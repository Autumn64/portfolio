package ingresadaatos;
import java.util.*;

public class Comprobar {
    private Scanner teclado;
    private String nombre;
    private int edad;
    
    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
    }
    public void comprobar(){
        String resultado;
        resultado = (edad >= 18) ? "Eres mayor de edad." : "Eres menor de edad.";
        System.out.println(resultado);
    }
    public void imprimir(){
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu edad es " + edad);
    }
}
