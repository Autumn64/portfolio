//Made by Mónica Nayely Flores Gómez (Autumn64)
package abstraccion;

public abstract class Shape{
    double width;
    double height;
    Shape(double a, double b){
        width = a;
        height = b;
    }
    abstract double calculateArea();
}