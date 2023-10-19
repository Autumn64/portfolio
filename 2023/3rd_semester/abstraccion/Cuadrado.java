//Made by Mónica Nayely Flores Gómez (Autumn64)
package abstraccion;

public class Cuadrado extends Shape{
    Cuadrado(double lado){
        super(lado, lado);
    }

    double calculateArea(){
        System.out.println("Área del cuadrado");
        return height * width;
    }
}
