//Made by Mónica Nayely Flores Gómez (Autumn64)
package vehiculo;

public class Automovil{
	private String estado, marca, color;
	private int vMax;

	public Automovil(String estado, String marca, String color, int vMax){
		this.estado = estado;
		this.marca = marca;
		this.color = color;
		this.vMax = vMax;
	}

	public Automovil(){
		this.estado = "Apagado";
		this.marca = "Volkswagen";
		this.color = "Azul";
		this.vMax = 260;
	}
	
	public void obtenerDatos(){
		System.out.println("Estado: " + estado);
		System.out.println("Marca: " + marca);
		System.out.println("Color: " + color);
		System.out.println("Velocidad máxima: " + vMax + "km/h");
	}
}
