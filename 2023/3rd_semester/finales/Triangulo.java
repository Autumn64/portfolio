//Made by Mónica Nayely Flores Gómez (Autumn64)
package finales;

public class Triangulo {
    private static final double DIV = 2;
    private double b;
    private double h;

    public Triangulo(double b, double h){
        this.b = b;
        this.h = h;
    }

    public double areaTriangulo(){
        return b * h / DIV;
    }

    public double perimetroTriangulo(){
        return 2 * h + b;
    }
}
