/*
Copyright (c) 2023 Monica Nayely Flores Gomez (Autumn64).
Licensed under the BSD-3-Clause license. More information at https://opensource.org/license/BSD-3-clause/

PROYECTO INTEGRADOR POO
*/

package controlescolar;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ControlEscolar {
    
    private static List<Alumno> alumnos;
    private static List<Profesor> profesores;
    private static List<Materia> materias;
    private static Scanner reader;
    
    public static void inicializar(){
        System.out.println("******** CONTROL ESCOLAR ********");
        agregarProf(3);
        agregarMat(4);
        agregarEst(3);
    }
    
    public static void agregarProf(int c){
        System.out.println("\nRequiere agregar " + c + " profesores.");
        for (int i = 0; i < c; i ++){
            String nombre, apellido, genero, titulo, nocedula;
            int edad;
            System.out.println("******** PROFESOR " + (i + 1) + " ********");
            System.out.print("Nombre: ");
            nombre = reader.nextLine();
            System.out.print("Apellido: ");
            apellido = reader.nextLine();
            System.out.print("Género: ");
            genero = reader.nextLine();
            System.out.print("Edad: ");
            edad = reader.nextInt();
            reader.nextLine();
            System.out.print("Título: ");
            titulo = reader.nextLine();
            System.out.print("Número de cédula: ");
            nocedula = reader.nextLine();
            profesores.add(new Profesor(nombre, apellido, genero, edad, titulo, nocedula));
        }
    }
    
    public static void agregarMat(int c){
        System.out.println("\nRequiere agregar " + c + " materias.");
        for (int i = 0; i < c; i++){
            String nombre;
            int profesor, creditos, j;
            
            System.out.println("******** MATERIA " + (i + 1) + " ********");
            System.out.print("Nombre: ");
            nombre = reader.nextLine();
            System.out.println("Los siguientes profesores están registrados: ");
            for (j = 0; j < profesores.size(); j++){
                System.out.println("   " + (j + 1) + ". " + profesores.get(j).getNombre());
            }
            System.out.print("Escoja un profesor (1-" + profesores.size() + "): ");
            profesor = reader.nextInt();
            System.out.print("Cantidad de créditos: ");
            creditos = reader.nextInt();
            reader.nextLine();
            materias.add(new Materia(nombre, profesores.get(profesor - 1), creditos));
            try{
                profesores.get(profesor - 1).agregarMateria(materias.get(materias.size() - 1));
            }catch (MateriaRepetida mr){
                System.out.println("Error: " + mr.toString());
                System.exit(1);
            }
        }
    }
    
    public static void agregarEst(int c){
        System.out.println("\nRequiere agregar " + c + " estudiantes.");
        for (int i = 0; i < c; i++){
            String nombre, apellido, ncontrol, genero;
            int edad, semestre, j;
            
            System.out.println("******** ESTUDIANTE " + (i + 1) + " ********");
            System.out.print("Nombre: ");
            nombre = reader.nextLine();
            System.out.print("Apellido: ");
            apellido = reader.nextLine();
            System.out.print("Edad: ");
            edad = reader.nextInt(); 
            reader.nextLine();
            System.out.print("Género: ");
            genero = reader.nextLine();
            System.out.print("Número de control: ");
            ncontrol = reader.nextLine();
            System.out.print("Semestre: ");
            semestre = reader.nextInt();
            reader.nextLine();
            System.out.println("Las siguientes materias están registradas:");
            for (j = 0; j < materias.size(); j++){
                System.out.println("   " + (j + 1) + ". " + materias.get(j).obtenerNombre());
            }
            System.out.print("Escoja las materias separadas por comas (ej: 1,2,3): ");
            String []cursos = reader.nextLine().split("[,]");
            alumnos.add(new Alumno(nombre, apellido, genero, edad, ncontrol, semestre));
            for (int k = 0; k < cursos.length; k++){
                try{
                    alumnos.get(alumnos.size() - 1).agregarMateria(materias.get(Integer.parseInt(cursos[k]) - 1));
                }catch (Exception e){
                    System.out.println("Error: " + e.toString());
                    System.exit(1);
                }
            }
        }
    }
    
    public static void menu(){
        for (;;){
            char c;
            System.out.print("\nPresione Enter para continuar..."); reader.nextLine();
            System.out.println("******** CONTROL ESCOLAR ********");
            System.out.println("1. Profesor");
            System.out.println("2. Materia");
            System.out.println("3. Alumno");
            System.out.println("4. Salir");
            System.out.print("Escoja una opción (1-4): ");
            c = reader.nextLine().charAt(0);
            
            if (c == '1'){ mostrarProf(); }
            else if (c == '2'){ mostrarMat(); }
            else if (c == '3'){ mostrarEst(); }
            else if (c == '4'){ System.out.println("Saliendo..."); System.exit(0); }
            else{ continue; }
        }
    }
    
    public static void mostrarProf(){
        int index;
        System.out.println("******** PROFESORES ********");
        System.out.println("Los siguientes profesores están registrados: ");
        for (int i = 0; i < profesores.size(); i++){
            System.out.println("   " + (i + 1) + ". " + profesores.get(i).getNombre());
        }
        System.out.print("Escoja un profesor (1-" + profesores.size() + "): ");
        index = reader.nextInt() - 1;
        reader.nextLine();
        System.out.println("******** INFORMACIÓN DEL PROFESOR ********");
        try{
            System.out.println("Nombre: " + profesores.get(index).getNombre());
            System.out.println("Apellido: " + profesores.get(index).getApellido());
            System.out.println("Género: " + profesores.get(index).getGenero());
            System.out.println("Edad: " + profesores.get(index).getEdad());
            System.out.println("Título: " + profesores.get(index).getTitulo());
            System.out.println("No. Cédula: " + profesores.get(index).getNoCedula());
            System.out.print("Materias: ");
            List<Materia> profmaterias = profesores.get(index).getMaterias();
            for (int i = 0; i < profmaterias.size(); i++){
                System.out.print(profmaterias.get(i).obtenerNombre() + ", ");
            }
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
            System.exit(1);
        }
    }
        public static void mostrarMat(){
        int index;
        System.out.println("******** MATERIAS ********");
        System.out.println("Las siguientes materias están registradas: ");
        for (int i = 0; i < materias.size(); i++){
            System.out.println("   " + (i + 1) + ". " + materias.get(i).obtenerNombre());
        }
        System.out.print("Escoja un profesor (1-" + materias.size() + "): ");
        index = reader.nextInt() - 1;
        reader.nextLine();
        System.out.println("******** INFORMACIÓN DE LA MATERIA ********");
        try{
            materias.get(index).obtenerDatos(new String[0]);
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
            System.exit(1);
        }
    }
    
    public static void mostrarEst(){
        int index;
        System.out.println("******** ESTUDIANTES ********");
        System.out.println("Los siguientes estudiantes están registrados: ");
        for (int i = 0; i < alumnos.size(); i++){
            System.out.println("   " + (i + 1) + ". " + alumnos.get(i).getNombre());
        }
        System.out.print("Escoja un estudiante (1-" + alumnos.size() + "): ");
        index = reader.nextInt() - 1;
        reader.nextLine();
        System.out.println("******** INFORMACIÓN DEL ESTUDIANTE ********");
        try{
            System.out.println("Nombre: " + alumnos.get(index).getNombre());
            System.out.println("Apellido: " + alumnos.get(index).getApellido());
            System.out.println("Género: " + alumnos.get(index).getGenero());
            System.out.println("Edad: " + alumnos.get(index).getEdad());
            System.out.println("Semestre: " + alumnos.get(index).getSemestre());
            System.out.println("No. Control: " + alumnos.get(index).getNControl());
            System.out.print("Materias: ");
            List<Materia> estmaterias = alumnos.get(index).getMaterias();
            for (int i = 0; i < estmaterias.size(); i++){
                System.out.print(estmaterias.get(i).obtenerNombre() + ", ");
            }
        }catch (Exception e){
            System.out.println("Error: " + e.toString());
            System.exit(1);
        }
    }
    
    public static void main(String[] args){
        reader = new Scanner(System.in);
        alumnos = new ArrayList<>();
        materias = new ArrayList<>();
        profesores = new ArrayList<>();
        inicializar();
        menu();
    }
}