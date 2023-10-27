//Made by Mónica Nayely Flores Gómez (Autumn64)
package sobrecarga;

public class Figura {
    public static double calcularArea(double l){
        return l * l;
    }
    public static double calcularArea(double b, double h, boolean r){
        if (r == true){
            return b * h;
        }
        return b * h / 2;
    }
    public static double calcularArea(double pi, double r){
        return pi * Math.pow(r, 2);
    }
    public static double calcularArea(double bmaj, double bmin, double h){
        return (bmaj + bmin) * h / 2;
    }
}
