package controlescolar;

public class Persona {
    protected String nombre, apellido, genero; //Protected y no private para que las subclases puedan acceder a los atributos
    protected int edad;
    
    public Persona(String nombre, String apellido, String genero, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }
    
    public Persona(){
        this.nombre = "Persona";
        this.apellido = "Genérica";
        this.genero = "Genérico";
        this.edad = 25;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public int getEdad(){
        return this.edad;
    }
}
