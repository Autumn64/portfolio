package controlescolar;
import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{
    private String titulo, nocedula;
    private ArrayList<Materia> materias;
    
    public Profesor(String nombre, String apellido, String genero, int edad, String titulo, String nocedula){
        super(nombre, apellido, genero, edad);
        this.titulo = titulo;
        this.nocedula = nocedula;
        this.materias = new ArrayList<Materia>();
    }
    
    public Profesor(){
        super();
        this.titulo = "Título genérico";
        this.nocedula = "1234567890";
        this.materias = new ArrayList<Materia>();
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getNoCedula(){
        return this.nocedula;
    }
    
    public List getMaterias(){
        return this.materias;
    }
    
    public void agregarMateria(Materia materia) throws MateriaRepetida{
        if (materias.contains(materia)){
            throw new MateriaRepetida("Ya existe la materia `" + materia.obtenerNombre() +"` para este profesor.");
        }
        
        materias.add(materia);
    }
}
