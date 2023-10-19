//Made by Mónica Nayely Flores Gómez (Autumn64)
package abstraccion;

public class Abstraccion {
    public static void main(String [] args){
        Rectangle r = new Rectangle(3, 4);
        Triangulo t = new Triangulo(5, 6);
        Circulo ci = new Circulo(7);
        Cuadrado cu = new Cuadrado(8);

        Shape figref = r;
        System.out.println("El área del rectángulo es: " + figref.calculateArea());
        figref = t;
        System.out.println("El área del triángulo es: " + figref.calculateArea());
        figref = ci;
        System.out.println("El área del círculo es: " + figref.calculateArea());
        figref = cu;
        System.out.println("El área del cuadrado es: " + figref.calculateArea());
    }
}
