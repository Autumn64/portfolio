//Made by Mónica Nayely Flores Gómez (Autumn64)
package abstraccion2;

public class Potencia extends Operacion{
    Potencia(double base, double exponente){
        super(base, exponente);
    }

    double hacerOperacion(){
        System.out.println("Potenciación de un número por exponente");
        return Math.pow(numero1, numero2);
    }
}
