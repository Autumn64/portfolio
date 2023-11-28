//Made by Mónica Gómez (Autumn64)
package banco;

public class Empleado extends Persona {
    private String matricula;
    private String puesto;
    double sueldo;
    
    public Empleado(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }
    
    public void Registrar(String matricula, String puesto, double sueldo){
        this.matricula = matricula;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }
    
    public void verDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Puesto: " + puesto);
        System.out.println("Sueldo: " + sueldo);
    }
}
