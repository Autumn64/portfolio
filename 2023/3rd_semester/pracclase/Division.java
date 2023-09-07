//Made by Mónica Nayely Flores Gómez (Autumn64).
package pracclase;
import java.util.*;

public class Division{
	Scanner reader;

	public Division(Scanner reader){
		this.reader = reader;
	}

	public void Dividir(){		
		double x, y, z;
		System.out.println("División de números.");
		System.out.print("Ingresa número 1: ");
		x = this.reader.nextDouble();
		System.out.print("Ingresa número 2: ");
		y = this.reader.nextDouble();
		z = x / y;
		System.out.println("El resultado es: " + z);
	}
}
