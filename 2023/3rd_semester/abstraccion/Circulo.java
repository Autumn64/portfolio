//Made by Mónica Nayely Flores Gómez (Autumn64)
package abstraccion;

public class Circulo extends Shape{
    Circulo(double radio){
        super(radio * radio, 3.141592653);
    }
    double calculateArea(){
        System.out.println("Área del círculo");
        return height * width;
    }
}
