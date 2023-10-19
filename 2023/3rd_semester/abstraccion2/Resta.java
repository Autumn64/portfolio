//Made by Mónica Nayely Flores Gómez (Autumn64)
package abstraccion2;

public class Resta extends Operacion{
    Resta(double n1, double n2){
        super(n1, n2);
    }

    double hacerOperacion(){
        System.out.println("Resta de números");
        return numero1 - numero2;
    }
}
