//Made by Mónica Nayely Flores Gómez (Autumn64)
package abstraccion;

public class Rectangle extends Shape{
    Rectangle(double a, double b){
        super(a, b);
    }
    double calculateArea(){
        System.out.println("Área del rectángulo");
        return height * width;
    }
}