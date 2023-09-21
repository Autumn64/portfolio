//Made by Mónica Nayely Flores Gómez (Autumn64).
package saludo;

public class Saludo{
	String mensajeSaludo;
	public Saludo(){
		mensajeSaludo = "Hola amigo";
	}
	public Saludo(String palabra){
		mensajeSaludo = palabra;
	}
	public Saludo(String palabra, String nombre){
		mensajeSaludo = palabra.concat(" ").concat(nombre);
	}

	public static void main(String []args){
		Saludo x = new Saludo();
		Saludo y = new Saludo("Hola Kevin");
		Saludo z = new Saludo("Hola", "Kevin Arnold");

		System.out.println(x.mensajeSaludo);
		System.out.println(y.mensajeSaludo);
		System.out.println(z.mensajeSaludo);
	}
}
