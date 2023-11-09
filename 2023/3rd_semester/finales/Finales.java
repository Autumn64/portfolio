//Made by Mónica Nayely Flores Gómez (Autumn64)
package finales;

public class Finales {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        Cuadrado cuadrado1 = new Cuadrado(5);
        Triangulo triangulo1 = new Triangulo(5, 10);
        Rectangulo rectangulo1 = new Rectangulo(5, 10);
        
        System.out.println("Radio del círculo: 5");
        System.out.println("Área del círculo: " + circulo1.areaCirculo());
        System.out.println("Longitud del círculo: " + circulo1.diametroCirculo());

        System.out.println("Lado del cuadrado: 5");
        System.out.println("Área del cuadrado: " + cuadrado1.areaCuadrado());
        System.out.println("Perímetro del cuadrado: " + cuadrado1.perimetroCuadrado());

        System.out.println("Base del triángulo: 5, altura: 10");
        System.out.println("Área del triángulo: " + triangulo1.areaTriangulo());
        System.out.println("Perímetro del triángulo: " + triangulo1.perimetroTriangulo());

        System.out.println("Base del rectángulo: 5, altura: 10");
        System.out.println("Área del rectángulo: " + rectangulo1.areaRectangulo());
        System.out.println("Perímetro del rectángulo: " + rectangulo1.perimetroRectangulo());
    }
    
}
