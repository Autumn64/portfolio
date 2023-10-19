//Made by Mónica Nayely Flores Gómez (Autumn64)
package abstraccion2;

public abstract class Operacion {
    double numero1, numero2;
    Operacion(double n1, double n2){
        numero1 = n1;
        numero2 = n2;
    }
    abstract double hacerOperacion();
}
