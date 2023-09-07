package amigos;

public class Amigos{
	public static void main(String []args){
		Persona p1 = new Persona("Luis", 37, "Lugo", 5498765);
		Persona p2 = new Persona();
		System.out.println("P1");
		System.out.println("Nombre: " + p1.consultarNombre());
		System.out.println("Edad: " + p1.consultarEdad());
		System.out.println("Ciudad: " + p1.consultarCiudad());
		System.out.println("Teléfono: " + p1.consultarTelefono());

		System.out.println("P2");
		System.out.println("Nombre: " + p2.consultarNombre());
		System.out.println("Edad: " + p2.consultarEdad());
		System.out.println("Ciudad: " + p2.consultarCiudad());
		System.out.println("Teléfono: " + p2.consultarTelefono());
	}
}
