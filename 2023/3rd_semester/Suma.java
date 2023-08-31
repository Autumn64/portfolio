//Made by Mónica Nayely Flores Gómez (Autumn64).
package pracclase;
import java.util.*;

public class Suma{
	Scanner reader;

	public Suma(Scanner reader){
		this.reader = reader;
	}

	public void Sumar(){		
		int x, y, z;
		System.out.println("Suma de números.");
		System.out.print("Ingresa número 1: ");
		x = this.reader.nextInt();
		System.out.print("Ingresa número 2: ");
		y = this.reader.nextInt();
		z = x + y;
		System.out.println("El resultado es: " + z);
	}
}
