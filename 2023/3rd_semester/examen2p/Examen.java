//FLORES GÓMEZ MÓNICA NAYELY. 660103897
package examen;

public class Examen {
    
    public static int sentregadas, ventregados, vmayori, smayori;
    public static Serie []series;
    public static Videojuego []videojuegos;

    public static void main(String[] args) {
        
        sentregadas = 0;
        ventregados = 0;
        
        series = new Serie[5];
        videojuegos = new Videojuego[5];
        
        inicializarSeries();
        inicializarVideojuegos();
        
        series[1].entregar();
        series[2].entregar();
        series[3].entregar();
        
        videojuegos[0].entregar();
        videojuegos[1].entregar();
        videojuegos[4].entregar();
        
        for (int i = 0; i < series.length; i++){
            if(series[i].isEntregado() == true){
                sentregadas++;
                series[i].devolver();
            };
            if(i == 0){
                smayori = 0;
                continue;
            }
            if(series[i].getNoTemp() > series[i - 1].getNoTemp()) smayori = i;
        }
        
        for (int i = 0; i < videojuegos.length; i++){
            if(videojuegos[i].isEntregado() == true){
                ventregados++;
                videojuegos[i].devolver();
            }
            if (i == 0){
                vmayori = 0;
                continue;
            }
            if(videojuegos[i].getHoras() > videojuegos[i - 1].getHoras()) vmayori = i;
        }
        
        System.out.println("Hay " + sentregadas + " series entregadas y " + ventregados + 
                " videojuegos entregados.");
        System.out.println("La serie con mayor número de temporadas es: \n" + series[smayori].toString());
        System.out.println("El videojuego con mayor número de horas es: \n" + videojuegos[vmayori].toString());

        
    }
    
    public static void inicializarSeries(){
        series[0] = new Serie();
        series[1] = new Serie("Mr. Robot", "Sam Esmail");
        series[2] = new Serie("iCarly", "Dan Schneider", "Comedia", 6);
        series[3] = new Serie("Grey's Anatomy", "Shonda Rhimes", "Drama médico", 20);
        series[4] = new Serie();
    }
    
    public static void inicializarVideojuegos(){
        videojuegos[0] = new Videojuego();
        videojuegos[1] = new Videojuego("Super Mario Bros.", "Nintendo");
        videojuegos[2] = new Videojuego("Halo", "Bungie", "FPS", 35);
        videojuegos[3] = new Videojuego("Fall Guys", "Epic Games", "Battle Royale", 100);
        videojuegos[4] = new Videojuego("Contra: Hard Corps", "Konami", "Run and gun", 40);
    }
    
}
