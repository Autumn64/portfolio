//Made by Mónica Nayely Flores Gómez (Autumn64)
package finales;

public class Rectangulo {
    private static final double DIV = 1;
    private double b;
    private double h;

    public Rectangulo(double b, double h){
        this.b = b;
        this.h = h;
    }

    public double areaRectangulo(){
        return b * h;
    }

    public double perimetroRectangulo(){
        return (b * 2) + (h * 2);
    }
}
