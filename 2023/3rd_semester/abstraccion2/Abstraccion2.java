//Made by Mónica Nayely Flores Gómez (Autumn64)
package abstraccion2;

public class Abstraccion2 {
    public static void main(String []args){
        Suma s = new Suma(0, 1);
        Resta r = new Resta(3, 2);
        Multiplicacion m = new Multiplicacion(4, 5);
        Division d = new Division(6, 7);
        Potencia p = new Potencia(8, 9);
        Operacion opref = s;
        System.out.println("La suma es: " + opref.hacerOperacion());
        opref = r;
        System.out.println("La resta es: " + opref.hacerOperacion());
        opref = m;
        System.out.println("La multiplicación es: " + opref.hacerOperacion());
        opref = d;
        System.out.println("La división es: " + opref.hacerOperacion());
        opref = p;
        System.out.println("La potencia es: " + opref.hacerOperacion());
    }
}
