//Made by Mónica Gómez (Autumn64)
package banco;
import java.util.Scanner;

public class Banco {
    
    static Empleado empleado1;
    static Cliente cliente1;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombre, apellido, sgenerico1, sgenerico2;
        int igenerico;
        double dgenerico;
        
        System.out.println("******** SISTEMA BANCARIO DE REGISTRO ********");
        System.out.println("Creará un nuevo empleado.");
        System.out.print("Ingrese el nombre: ");
        nombre = reader.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = reader.nextLine();
        System.out.print("Ingrese la edad: ");
        igenerico = reader.nextInt();
        reader.nextLine();
        empleado1 = new Empleado(nombre, apellido, igenerico);
        System.out.print("Ingrese matrícula: ");
        sgenerico1 = reader.nextLine();
        System.out.print("Ingrese puesto: ");
        sgenerico2 = reader.nextLine();
        System.out.print("Ingrese sueldo: ");
        dgenerico = reader.nextDouble();
        reader.nextLine();
        empleado1.Registrar(sgenerico1, sgenerico2, dgenerico);
        System.out.println("Empleado registrado exitosamente.");
        System.out.println("\nCreará un nuevo cliente.");
        System.out.print("Ingrese el nombre: ");
        nombre = reader.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = reader.nextLine();
        System.out.print("Ingrese la edad: ");
        igenerico = reader.nextInt();
        reader.nextLine();
        cliente1 = new Cliente(nombre, apellido, igenerico);
        System.out.print("Ingrese número de cliente: ");
        sgenerico1 = reader.nextLine();
        System.out.print("Ingrese años de antigüedad: ");
        igenerico = reader.nextInt();
        System.out.print("Ingrese ingreso: ");
        dgenerico = reader.nextDouble();
        cliente1.Registrar(sgenerico1, igenerico, dgenerico);
        System.out.println("Cliente registrado exitosamente.");
        System.out.println("-------- EMPLEADO 1 --------\n");
        empleado1.verDatos();
        System.out.println("-------- CLIENTE 1 --------\n");
        cliente1.verDatos();
    }
    
}
