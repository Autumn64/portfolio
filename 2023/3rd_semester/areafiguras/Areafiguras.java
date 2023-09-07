//Made by Mónica Nayely Flores Gómez (Autumn64)
package areafiguras;
import java.util.*;

public class Areafiguras {
    
    static void salir(){
        System.out.println("Saliendo...");
        System.exit(0);
    }
    
    static void retornar(Scanner reader){
        String retorno;
        System.out.print("Regresar al menú principal? (y/n): ");
        retorno = reader.next();
        if (!"y".equals(retorno)) salir();
    }
    
    static void cuadrado(Scanner reader){
        int lado, area;
        System.out.println("Área del cuadrado");
        System.out.print("Dame el lado: ");
        lado = reader.nextInt();
        area = lado * lado;
        System.out.println("El área es " + area + ".");
        retornar(reader);
    }
    
    static void triangulo(Scanner reader){
        double base, altura, area;
        System.out.println("Área del triángulo");
        System.out.print("Dame la base: ");
        base = reader.nextDouble();
        System.out.print("Dame la altura: ");
        altura = reader.nextDouble();
        area = base * altura / 2;
        System.out.println("El área es " + area + ".");
        retornar(reader);
    }
    
    static void rectangulo(Scanner reader){
        double base, altura, area;
        System.out.println("Área del rectángulo");
        System.out.print("Dame la base: ");
        base = reader.nextDouble();
        System.out.print("Dame la altura: ");
        altura = reader.nextDouble();
        area = base * altura;
        System.out.println("El área es " + area + ".");
        retornar(reader);
    }
    
    static void circulo(Scanner reader){
        double radio, area;
        System.out.println("Área del círculo");
        System.out.print("Dame el radio: ");
        radio = reader.nextDouble();
        area = (radio * radio) * 3.14159;
        System.out.println("El área es " + area + ".");
        retornar(reader);
    }

    public static void main(String[] args) {
        while (true){
            Scanner reader = new Scanner(System.in);
            int opcion;
            String retorno;
            System.out.println("1. Cuadrado\n2. Triángulo\n3. Rectángulo\n4. Círculo\n5. Salir\n");
            System.out.print("Elige una opción (1-5): ");
            opcion = reader.nextInt();
            switch (opcion){
                case 1:
                    cuadrado(reader);
                    break;
                case 2:
                    triangulo(reader);
                    break;
                case 3:
                    rectangulo(reader);
                    break;
                case 4:
                    circulo(reader);
                    break;
                case 5:
                    salir();
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        }
    }
}
