//Made by Mónica Nayely Flores Gómez (Autumn64)
package puertacoche;

public class PuertaCoche extends ComponenteCoche implements Alarma, PuertaBloqueable{
    
    private boolean estaBloqueada;
    private boolean alarmaActivada;
    
    public PuertaCoche(){
        super();
        this.estaBloqueada = true;
        this.alarmaActivada = false;
    }
    
    public static void main(String[] args) {
        PuertaCoche coche1 = new PuertaCoche();
        System.out.println("Atributos del coche:");
        System.out.println("Descripción: " + coche1.mostrarDescripcion());
        System.out.println("Peso: " + coche1.mostrarPeso());
        System.out.println("Coste: " + coche1.mostrarCoste());
        
        System.out.println("\nAbriendo puerta...");
        coche1.abrir();
        coche1.desbloquea();
        coche1.desactivarAlarma();
        coche1.abrir();
        coche1.cerrar();
        coche1.bloquea();
        coche1.activarAlarma();
        coche1.verAlarmaActivada();
    }
    
    public void abrir(){
        if (this.estaBloqueada == true){
            System.out.println("La puerta está bloqueada.");
            return;
        }
        System.out.println("Abriendo puerta...");
    }
    
    public void cerrar(){
        System.out.println("Cerrando puerta...");
    }
    
    public void bloquea(){
        this.estaBloqueada = true;
        System.out.println("Puerta bloqueada.");
    }
    
    public void desbloquea(){
        this.estaBloqueada = false;
        System.out.println("Puerta desbloqueada.");
    }
    
    public void activarAlarma(){
        this.alarmaActivada = true;
        System.out.println("Alarma activada.");
    }
    
    public void desactivarAlarma(){
        this.alarmaActivada = false;
        System.out.println("Alarma desactivada.");
    }
    
    public void verAlarmaActivada(){
        if (this.alarmaActivada == true) System.out.println("La alarma está activada.");
        else System.out.println("La alarma está desactivada.");
    }
    
}
