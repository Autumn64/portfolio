//Made by Mónica Nayely Flores Gómez (Autumn64)
package ingresadatos;
import java.util.*;

public class Ingresadatos {

        public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Bienvenidos");
                System.out.print("\nIngresa tu nombre: ");
                String nombre = reader.nextLine();
                System.out.print("Ahora ingresa tu edad: ");
                int edad = reader.nextInt();
		if (edad >= 18){
			System.out.println("Eres mayor de edad");
		}else{
			System.out.println("Eres menor de edad");
		}
    	}
    
}
