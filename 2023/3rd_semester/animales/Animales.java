package animales;

public class Animales{
	public static void main(String []args){
		Perros p1 = new Perros("Cheems", "Shiba Inu", "Amarillo", 12);
		Perros p2 = new Perros("Firulais", "Chihuahueño", "Beige", 5);
		Perros p3 = new Perros("Doggo", "Schnauzer", "Negro", 6);

		System.out.println("Perro 1");
		System.out.println("Nombre: " + p1.mostrarNombre());
		System.out.println("Raza: " + p1.mostrarRaza());
		System.out.println("Color: " + p1.mostrarColor());
		System.out.println("Edad: " + p1.mostrarEdad());

		System.out.println("\nPerro 2");
		System.out.println("Nombre: " + p2.mostrarNombre());
		System.out.println("Raza: " + p2.mostrarRaza());
		System.out.println("Color: " + p2.mostrarColor());
		System.out.println("Edad: " + p2.mostrarEdad());

		System.out.println("\nPerro 3");
		System.out.println("Nombre: " + p3.mostrarNombre());
		System.out.println("Raza: " + p3.mostrarRaza());
		System.out.println("Color: " + p3.mostrarColor());
		System.out.println("Edad: " + p3.mostrarEdad());
	}
}
