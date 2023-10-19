//Made by Mónica Nayely Flores Gómez (Autumn64)
package abstraccion2;

public class Division extends Operacion{
    Division(double n1, double n2){
        super(n1, n2);
    }

    double hacerOperacion(){
        System.out.println("División de números");
        return numero1 / numero2;
    }
}
