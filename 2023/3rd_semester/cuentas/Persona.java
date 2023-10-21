//Made by Mónica Nayely Flores Gómez (Autumn64)
package cuentas;

public class Persona {
    private String nombre;
    private long nif;
    
    public Persona(String no, long ni){
        this.nombre = no;
        this.nif = ni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public long getNif(){
        return this.nif;
    }
}
