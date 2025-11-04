/*
    La clave API debe ser la de GNews. Tomar en cuenta que la API aplica
    CORS, por lo que es mejor idea implementar un backend que haga la petición
    a la API y despliegue la información.
*/
const API_KEY = "API";

async function fetchNews(){
    const response = await fetch(`https://gnews.io/api/v4/search?q=Google&lang=es&max=25&apikey=${API_KEY}`);

    if (!response.ok) throw new Error("No se pudo hacer la conexión a la API.");

    const json = await response.json();
    return json.articles;
}