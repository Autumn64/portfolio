//Made by Mónica Gómez (Autumn64)
package banco;

public class Cliente extends Persona {
    
    private String nocliente;
    private int antiguedad;
    private double ingreso;
    
    public Cliente(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }
    
    public void Registrar(String nocliente, int antiguedad, double ingreso){
        this.nocliente = nocliente;
        this.antiguedad = antiguedad;
        this.ingreso = ingreso;
    }
    
    public void verDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("No. cliente: " + nocliente);
        System.out.println("Antigüedad: " + antiguedad);
        System.out.println("Ingreso: " + ingreso);
    }
}
