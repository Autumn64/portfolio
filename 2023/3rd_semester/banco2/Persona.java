//Made by Mónica Gómez (Autumn64)
package banco;

public class Persona {
    private String nombre, apellido;
    private int edad;
    
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getEdad(){
        return edad;
    }
}
