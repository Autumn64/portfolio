//Made by Mónica Nayely Flores Gómez (Autumn64).
package pracclase;
import java.util.*;

public class PracClase{
	static Scanner reader = new Scanner(System.in);

	static void retornar(){
		char op;
		System.out.print("Volver al menú principal? (s/n): ");
		op = reader.next().charAt(0);
		if (op != 's'){
			System.out.println("Saliendo...");
			System.exit(0);
		}
	}

	public static void main(String []args){
		while (true){
			int opcion;
			System.out.println("Operaciones.");
			System.out.println("1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir");
			System.out.print("\nElige una opción (1-5): ");
			opcion = reader.nextInt();
			switch(opcion){
				case 1:
					Suma objuno = new Suma(reader);
					objuno.Sumar();
					retornar();
					break;
				case 2:
					Resta objdos = new Resta(reader);
					objdos.Restar();
					retornar();
					break;
				case 3:
					Multiplicacion objtres = new Multiplicacion(reader);
					objtres.Multiplicar();
					retornar();
					break;
				case 4:
					Division objcuatro = new Division(reader);
					objcuatro.Dividir();
					retornar();
					break;
				case 5:
					System.out.println("Saliendo...");
					System.exit(0);
					break;
				default:
					System.out.println("Opción inválida.");
					retornar();
					break;
			}
		}
	}
}
