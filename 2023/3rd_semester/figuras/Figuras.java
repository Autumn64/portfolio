//Made by Mónica Nayely Flores Gómez (Autumn64)
package figuras;

class Figura{
	enum Tipo{
		CUADRADO,
		CIRCULO,
		TRIANGULO,
		RECTANGULO
	}

	protected double length;

	Tipo figura_tipo;

	Figura(Tipo figura, double length){
		this.length = length;
		this.figura_tipo = figura;
	}

	double area(){
		double area = 0;
		switch (figura_tipo){
			case CUADRADO:
				area = length * length;
				break;
			case CIRCULO:
				area = (length * length) * 3.14159;
				break;
			case TRIANGULO:
				area = length * 15 / 2;
				break;
			case RECTANGULO:
				area = length * 15;
		}
		return area;
	}
}

public class Figuras{
	public static void main(String []args){
		Figura circulo = new Figura(Figura.Tipo.CIRCULO, 10);
		System.out.println("El área del círculo es " + circulo.area());
		Figura cuadrado = new Figura(Figura.Tipo.CUADRADO, 10);
		System.out.println("El área del cuadrado es " + cuadrado.area());
		Figura triangulo = new Figura(Figura.Tipo.TRIANGULO, 10);
		System.out.println("El área del triangulo es " + triangulo.area());
		Figura rectangulo = new Figura(Figura.Tipo.RECTANGULO, 10);
		System.out.println("El área del rectangulo es " + rectangulo.area());
	}
}
