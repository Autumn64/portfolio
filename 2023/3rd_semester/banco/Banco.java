//Made by Mónica Nayely Flores Gómez (Autumn64)
package banco;
import java.util.*;

public class Banco{
	private ArrayList<Cliente> clientes;
	private Scanner reader;

	public Banco(){
		clientes = new ArrayList<Cliente>();
		reader = new Scanner(System.in);
	}

	public void agregarCliente(){
		String nombre, app, apm;
		int edad;
		double monto;
		System.out.print("Ingrese nombre: ");
		nombre = reader.nextLine();
		System.out.print("Ingrese apellido paterno: ");
		app = reader.nextLine();
		System.out.print("Ingrese apellido materno: ");
		apm = reader.nextLine();
		System.out.print("Ingrese edad: ");
		edad = reader.nextInt();
		System.out.print("Ingrese monto: ");
		monto = reader.nextDouble();

		Cliente nuevoCliente = new Cliente(nombre, app, apm, monto, edad);
		clientes.add(nuevoCliente);

		System.out.println("Cliente agregado exitosamente!\n");
	}

	public void mostrarClientes(){
		int cantidad = clientes.size();
		System.out.println("CLIENTES REGISTRADOS");
		for (int i = 0; i < cantidad; i++){
			System.out.println("Nombre: " + clientes.get(i).nombre);
			System.out.println("Apellido paterno: " + clientes.get(i).app);
			System.out.println("Apellido materno: " + clientes.get(i).apm);
			System.out.println("Edad: " + clientes.get(i).edad);
			System.out.println("Monto: " + clientes.get(i).monto);
			System.out.println("\n");
		}
		System.out.println("Presiona Enter para continuar...");
		reader.nextLine();
	}

	public void menu(){
		for (;;){
			int cantidad = clientes.size();
			char opcion;
			System.out.println("************ BANCO UVM HISPANO ************\nFlores Gómez Mónica Nayely.\n");
			System.out.println("Actualmente hay " + cantidad + " clientes registrados.");
			System.out.println("1. Agregar cliente.\n2. Ver clientes.\n3. Salir.");
			System.out.print("Escoge una opción (1-3): ");
			opcion = reader.next().charAt(0);
			reader.nextLine();
			switch (opcion){
				case '1':
					agregarCliente();
					break;
				case '2':
					mostrarClientes();
					break;
				case '3':
					System.out.println("Saliendo...");
					System.exit(0);
					break;
				default:
					System.out.println("Opción incorrecta, intente nuevamente.");
					break;
			}
		}
	}

	public static void main(String []args){
		Banco banco = new Banco();
		Cliente cliente1 = new Cliente("Persona 1", "Apellido 1", "Apellido 2", 500.25, 35);
		banco.clientes.add(cliente1);
		banco.menu();
	}
}
