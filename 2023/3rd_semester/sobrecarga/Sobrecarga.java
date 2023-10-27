//Made by Mónica Nayely Flores Gómez (Autumn64)
package sobrecarga;
import java.util.Scanner;

public class Sobrecarga {
    static Scanner reader;
    
    public static void personaMenu(){
        Persona persona1 = new Persona();
        String []args = new String[5];
        
        System.out.println("******** PERSONA ********");
        System.out.println("1. Nombre\n2. Edad\n3. Genero");
        System.out.println("Escoja las opciones separadas por comas (Ej: 1,2,3): ");
        args = reader.nextLine().split(",", 5);
        persona1.imprimir(args);
        System.out.println("Presione una tecla para continuar...");
        reader.nextLine();
    }
    
    public static void figurasMenu(){
        for (;;){
            char op;
            double l, b, h, r, bmaj, bmin;
            System.out.println("******** FIGURAS ********");
            System.out.println("1. Cuadrado\n2. Rectángulo\n3. Triángulo\n4. Círculo"
                    + "\n5. Trapecio\n6. Volver al menú principal");
            System.out.print("Escoge una opción (1-6): ");
            op = reader.nextLine().charAt(0);
            
            switch (op){
                case '1':
                    System.out.print("Ingresa el lado: ");
                    l = reader.nextDouble();
                    System.out.println("El resultado es " + Figura.calcularArea(l));
                    break;
                case '2':
                    System.out.print("Ingresa la base: ");
                    b = reader.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    h = reader.nextDouble();
                    System.out.println("El resultado es " + Figura.calcularArea(b, h, true));
                    break;
                case '3':
                    System.out.print("Ingresa la base: ");
                    b = reader.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    h = reader.nextDouble();
                    System.out.println("El resultado es " + Figura.calcularArea(b, h, false));
                    break;
                case '4':
                    System.out.print("Ingresa el radio: ");
                    r = reader.nextDouble();
                    //Sí, me sé todas esas cifras de pi
                    System.out.println("El resultado es " + Figura.calcularArea(3.1415926, r));
                    break;
                case '5':
                    System.out.print("Ingresa la base mayor: ");
                    bmaj = reader.nextDouble();
                    System.out.print("Ingresa la base menor: ");
                    bmin = reader.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    h = reader.nextDouble();
                    System.out.println("El resultado es " + Figura.calcularArea(bmaj, bmin, h));
                    break;
                case '6':
                    System.out.println("Volviendo al menú principal...\n\n");
                    return;
            }
            reader.nextLine();
            System.out.println("Presione una tecla para continuar...");
            reader.nextLine();
        }
    }
    
    public static void menu(){
        for (;;){
            char op;
            System.out.println("******** MENÚ PRINCIPAL ********");
            System.out.println("1. Figuras\n2. Persona\n3. Salir");
            System.out.print("Escoge una opción (1-3): ");
            op = reader.nextLine().charAt(0);
            
            switch (op){
                case '1':
                    figurasMenu();
                    break;
                case '2':
                    personaMenu();
                    break;
                case '3':
                    System.out.println("Saliendo...");
                    return;
            }
        }
    }
    
    public static void main(String[] args) {
        reader = new Scanner(System.in);
        menu();
    }
    
}
