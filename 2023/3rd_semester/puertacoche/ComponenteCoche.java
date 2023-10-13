//Made by Mónica Nayely Flores Gómez (Autumn64)
package puertacoche;

public class ComponenteCoche {
    private String descripcion;
    private double peso, coste;
    
    public ComponenteCoche(){
        this.descripcion = "Coche sedan 2.0";
        this.peso = 1.5;
        this.coste = 300000;
    }
    
    public String mostrarDescripcion(){
        return this.descripcion;
    }
    
    public double mostrarPeso(){
        return this.peso;
    }
    
    public double mostrarCoste(){
        return this.coste;
    }
}
