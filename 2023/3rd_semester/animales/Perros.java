package animales;

public class Perros{
	private String nombre;
	private String raza;
	private String color;
	private int edad;

	public Perros(String nombre, String raza, String color, int edad){
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.edad = edad;
	}

	public String mostrarNombre(){
		return nombre;
	}

	public String mostrarRaza(){
		return raza;
	}

	public String mostrarColor(){
		return color;
	}

	public int mostrarEdad(){
		return edad;
	}
}
