//Made by Mónica Nayely Flores Gómez (Autumn64)
package finales;

public class Circulo {
    private static final double PI = 3.1415926;
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public double areaCirculo(){
        return PI * Math.pow(radio, 2);
    }
    
    public double diametroCirculo(){
        return PI * (radio * 2);
    }
}
