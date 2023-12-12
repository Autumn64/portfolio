package controlescolar;
import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona{
    private String ncontrol;
    private int semestre;
    private ArrayList<Materia> materias;
    
    public Alumno(String nombre, String apellido, String genero, int edad, 
            String ncontrol, int semestre){
        super(nombre, apellido, genero, edad);
        this.ncontrol = ncontrol;
        this.semestre = semestre;
        this.materias = new ArrayList<Materia>();
    }
    
    public Alumno(){
        super();
        this.ncontrol = "661265843";
        this.semestre = 4;
        this.materias = new ArrayList<Materia>();
    }
    
    public String getNControl(){
        return this.ncontrol;
    }
    
    public int getSemestre(){
        return this.semestre;
    }
    
    public List getMaterias(){
        return this.materias;
    }
 
    public void agregarMateria(Materia materia) throws MateriaRepetida{
        if (materias.contains(materia)){
            throw new MateriaRepetida("Ya existe la materia `" + materia.obtenerNombre() +"` para este alumno.");
        }
        
        materias.add(materia);
    }
}
