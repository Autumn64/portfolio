//Made by Mónica Nayely Flores Gómez (Autumn64)
package vehiculo;

public class Vehiculo{
	public static void main(String []args){
		Automovil auto1 = new Automovil("Encendido", "Ferrari", "Rojo", 400);
		Automovil auto2 = new Automovil();

		System.out.println("Automovil 1:");
		auto1.obtenerDatos();
		System.out.println("\nAutomovil 2:");
		auto2.obtenerDatos();
	}
}
