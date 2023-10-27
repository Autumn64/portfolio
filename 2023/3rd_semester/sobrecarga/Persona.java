//Made by Mónica Nayely Flores Gómez (Autumn64)
package sobrecarga;

public class Persona {
    private String nombre, genero;
    private short edad;
    
    public Persona(){
        this.nombre = "Usuario 1";
        this.edad = 25;
        this.genero = "Genérico";
    }
    
    public Persona(String nombre, short edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    public void imprimir(String []args){
        for (int i = 0; i < args.length; i++){
            if (args[i].equals("1")) System.out.println("Nombre: " + this.nombre);
            else if (args[i].equals("2")) System.out.println("Edad: " + this.edad);
            else if (args[i].equals("3")) System.out.println("Género: " + this.genero);
        }
    }
}
