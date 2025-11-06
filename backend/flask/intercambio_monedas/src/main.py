# Una API en sí misma no tiene una forma definida, sino que depende de la necesidad que se busca
# cubrir y de si se están siguiendo estándares o normativas (como REST o SOAP). En este caso la API
# que hice retorna dos valores: un estado, y un mensaje. El estado es un código de estado HTTP
# (revisar el link https://es.wikipedia.org/wiki/Anexo:C%C3%B3digos_de_estado_HTTP para más información),
# y el mensaje puede ser un diccionario con la información pedida o una simple cadena de texto en caso de 
# error.

# Este ejemplo de API es sumamente sencillo, y cuenta con la ventaja de que podría utilizarse para cosas
# como apps móviles o software al que no se acceda mediante un navegador y, por ende, que no pueda conectarse
# de forma directa a un backend.

import dotenv, os, requests, json
from flask_cors import CORS
from flask import Flask, render_template, request, jsonify

app = Flask(__name__)

# CORS es un concepto bastante complicado y que, la verdad, me da flojera explicar,
# así que sólo diré que CORS es lo que provoca que, si no lo configuramos bien,
# nos tire error al tratar de hacer fetch desde JavaScript hacia la API.
# Con esta instrucción configuramos CORS para que no nos dé problemas.
CORS(app)

def fetchAPI(amount, current, target):
   # La variable de entorno que está en el archivo .env (NO HARDCODEAR!!!)
   key = os.getenv("SECRET_KEY")
   url = f"https://api.currencylayer.com/convert?from={current}&to={target}&amount={amount}&access_key={key}"

   r = requests.get(url)

   if r.status_code != 200:
      return jsonify({
         "status": 500,
         "message": "Coud not fetch resource"
      }), 500
   
   result = r.json()

   response = jsonify({
      "status": 200,
      "message": {
         "from": current,
         "to": target,
         "amount": amount,
         "result": result["result"]
      }
   })

   # Otra vez la burrada del CORS
   response.headers.add("Access-Control-Allow-Origin", "*")

   return response, 200

# Los `args.get` son los argumentos que pasamos a la URL.
@app.route('/getExchange')
def getExchange():
   amount = request.args.get("amount")
   currentCurr = request.args.get("from")
   targetCurr = request.args.get("to")

   if not amount or not currentCurr or not targetCurr:
      return jsonify({
         "status": 400,
         "message": "Bad URI"
      }), 400

   return fetchAPI(amount, currentCurr, targetCurr)

@app.route('/')
def index():
   return render_template("index.html")

@app.route('/about')
def about():
   return render_template("about.html")

if __name__ == '__main__':
   dotenv.load_dotenv()

   # 0.0.0.0 significa que va a leer todas las direcciones IP
   # (en este caso `localhost` y la IP que se obtiene con
   # `ipconfig` en Windows y `ifconfig` en GNU/Linux).
   app.run(host = "0.0.0.0", debug = True)