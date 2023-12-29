package controlescolar;

public class Materia {
    private String nombre;
    private Profesor profesor;
    private int creditos;
    
    public Materia(String nombre, Profesor profesor, int creditos){
        this.nombre = nombre;
        this.profesor = profesor;
        this.creditos = creditos;
    }
    
    public void obtenerDatos(String []vargs) throws Exception{
        if (vargs.length < 1){
            System.out.println("Nombre: " + nombre);
            System.out.println("Profesor: " + profesor.getNombre());
            System.out.println("Créditos: " + creditos);
            return;
        }
        
        for (int i = 0; i < vargs.length; i++){
            switch (vargs[i]){
                case "nombre":
                    System.out.println("Nombre: " + nombre);
                    break;
                case "profesor":
                    System.out.println("Profesor: " + profesor.getNombre());
                    break;
                case "creditos":
                    System.out.println("Créditos: " + creditos);
                    break;
                default:
                    throw new Exception("El campo `" + vargs[i] + "` no es válido.");
            }
        }
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
}
