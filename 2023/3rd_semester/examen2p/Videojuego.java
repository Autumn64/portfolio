package examen;

public class Videojuego implements Entregable{
    
    private String titulo, compania, genero;
    private int horas;
    private boolean entregado;

    public Videojuego(){
        this.titulo = "Videojuego genérico";
        this.compania = "Compañía genérica";
        this.genero = "Género genérico";
        this.horas = 10;
        this.entregado = false;
    }

    public Videojuego(String titulo, String compania){
        this.titulo = titulo;
        this.compania = compania;
        this.genero = "Género genérico";
        this.horas = 3;
        this.entregado = false;
    }

    public Videojuego(String titulo, String compania, String genero, int horas){
        this.titulo = titulo;
        this.compania = compania;
        this.genero = genero;
        this.horas = horas;
        this.entregado = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getCompania(){
        return compania;
    }

    public String getGenero(){
        return genero;
    }

    public int getHoras(){
        return horas;
    }

    public void setTitulo(String titulo) throws Exception{
        try{
            this.titulo = titulo;
        }catch (Exception e){
            throw new Exception("Error asignando el título: " + e);
        }
    }

    public void setCompania(String compania) throws Exception{
        try{
            this.compania = compania;
        }catch (Exception e){
            throw new Exception("Error asignando la compañía: " + e);
        }
    }

    public void setGenero(String genero) throws Exception{
        try{
            this.genero = genero;
        }catch (Exception e){
            throw new Exception("Error asignando el género: " + e);
        }
    }

    public void setHoras(int horas) throws Exception{
        try{
            this.horas = horas;
        }catch (Exception e){
            throw new Exception("Error asignando el número de horas: " + e);
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
        Videojuego b = (Videojuego) a;
        System.out.println("Videojuego 1: " + b.getTitulo() + "\nNúmero de horas estimadas: " + b.getHoras());
        System.out.println("Videojuego 2: " + this.getTitulo() + "\nNúmero de horas estimadas: " + this.getHoras());

    }
    
    @Override
    public String toString(){
        return "Título: " + titulo + "\nCompañía:"  + compania + "\nGénero " + genero + "\nHoras: " + horas + "\nEntregado: " + entregado;
    }
}
