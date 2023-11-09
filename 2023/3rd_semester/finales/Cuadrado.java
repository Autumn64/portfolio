//Made by Mónica Nayely Flores Gómez (Autumn64)
package finales;

public class Cuadrado{
    private static final double exponente = 2;
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double areaCuadrado(){
        return Math.pow(lado, exponente);
    }

    public double perimetroCuadrado(){
        return lado * 4;
    }
}