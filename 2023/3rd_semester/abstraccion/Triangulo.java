//Made by Mónica Nayely Flores Gómez (Autumn64)
package abstraccion;

public class Triangulo extends Shape{
    Triangulo(double a, double b){
        super(a, b);
    }
    double calculateArea(){
        System.out.println("Área del triángulo");
        return height * width / 2;
    }    
}
