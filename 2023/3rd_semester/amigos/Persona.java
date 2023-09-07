package amigos;

public class Persona{
	private String nombre;
	private int edad;
	private String ciudad;
	private int telefono;

	public Persona (String n, int e, String c, int t){
		this.nombre = n;
		this.edad = e ;
		this.ciudad = c;
		this.telefono = t;
	}

	//Sin parámetros
	public Persona (){
		this.nombre = "Pedro";
		this.edad = 0;
		this.ciudad = "";
		this.telefono = 0;
	}

	public void cambiarEdad(int e){
		this.edad = e;
	}

	public String consultarNombre(){
		return nombre;
	}

	public int consultarEdad(){
		return edad;
	}

	public String consultarCiudad(){
		return ciudad;
	}

	public int consultarTelefono(){
		return telefono;
	}
}
