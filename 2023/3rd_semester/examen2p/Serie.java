package examen;

public class Serie implements Entregable{

    private String titulo, creador, genero;
    private int notemp;
    private boolean entregado;

    public Serie(){
        this.titulo = "Serie genérica";
        this.creador = "Creador genérico";
        this.genero = "Género genérico";
        this.notemp = 3;
        this.entregado = false;
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
        this.genero = "Género genérico";
        this.notemp = 3;
        this.entregado = false;
    }

    public Serie(String titulo, String creador, String genero, int notemp){
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.notemp = notemp;
        this.entregado = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getCreador(){
        return creador;
    }

    public String getGenero(){
        return genero;
    }

    public int getNoTemp(){
        return notemp;
    }

    public void setTitulo(String titulo) throws Exception{
        try{
            this.titulo = titulo;
        }catch (Exception e){
            throw new Exception("Error asignando el título: " + e);
        }
    }

    public void setCreador(String creador) throws Exception{
        try{
            this.creador = creador;
        }catch (Exception e){
            throw new Exception("Error asignando el creador: " + e);
        }
    }

    public void setGenero(String genero) throws Exception{
        try{
            this.genero = genero;
        }catch (Exception e){
            throw new Exception("Error asignando el género: " + e);
        }
    }

    public void setNoTemp(int notemp) throws Exception{
        try{
            this.notemp = notemp;
        }catch (Exception e){
            throw new Exception("Error asignando el número de temporadas: " + e);
        }
    }

    public void entregar(){
        this.entregado = true;
        System.out.println("Artículo entregado.");
    }

    public void devolver(){
        this.entregado = false;
        System.out.println("Artículo devuelto.");
    }

    public boolean isEntregado(){
        return this.entregado;
    }
    
    public void compareTo(Object a){
        Serie b = (Serie) a;
        System.out.println("Serie 1: " + b.getTitulo() + "\nNúmero de temporadas: " + b.getNoTemp());
        System.out.println("Serie 2: " + this.getTitulo() + "\nNúmero de temporadas: " + this.getNoTemp());
    }
    
    @Override
    public String toString(){
        return "Título: " + titulo + "\nCreador:"  + creador + "\nGénero " + genero + "\nTemporadas: " + notemp + "\nEntregado: " + entregado;
    }
    
}