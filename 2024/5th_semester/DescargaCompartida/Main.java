// Made by Mónica Gómez (Autumn64)
import java.util.concurrent.Semaphore;
import java.util.Random;

class DescargaCompartida {
    // Definimos un semáforo con 2 permisos (máximo 2 hilos pueden acceder a la vez)
    private final Semaphore semaforo = new Semaphore(2);
		Random rand = new Random();
		int[] descargas = {50, 100, 200, 500}; // Megabits por segundo
    public void descargar(String hiloUsuario) {
        try {
            System.out.println(hiloUsuario + " está esperando para descargar el archivo.");
            // Adquiere un permiso del semáforo con el método acquire
            semaforo.acquire();
						long t_archivo = rand.nextLong(104857600, 2147483648L); // 100 MiB hasta 2 GiB
						double v_descarga = descargas[rand.nextInt(0, 4)] * 1000000 / 8; // Conversión a mebibytes por segundo
						double tiempo = t_archivo / v_descarga;
            System.out.println(hiloUsuario + " está descargando el archivo. Tamaño del archivo: " + String.format("%.2f", (double) t_archivo / 1048576) + " MiB. Velocidad de descarga: " + String.format("%.2f", v_descarga / 1048576) + " MiB/s. Tiempo de espera: " + String.format("%.2f", tiempo) + " segundos.");
            // Simula el tiempo que el usuario pasa descargando el archivo
            Thread.sleep((long) tiempo * 1000);
            System.out.println(hiloUsuario + " ha terminado de descargar el archivo." );
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Libera el permiso para que otro hilo pueda descargar
            semaforo.release();
        }
    }
}
class HiloDescarga extends Thread {
    private final DescargaCompartida cliente;
    private final String hiloUsuario;
    public HiloDescarga(DescargaCompartida cliente, String hiloUsuario) {
        this.cliente = cliente;
        this.hiloUsuario = hiloUsuario;
    }
    @Override
    public void run() {
        cliente.descargar(hiloUsuario);
    }
}
 
public class Main {
    public static void main(String[] args) {
        DescargaCompartida cliente = new DescargaCompartida();
        // Creamos los hilos que simularán los usuarios que descargan los archivos (10 usuarios) 
        for (int i = 1; i <= 10; i++) {
            new HiloDescarga(cliente, "Usuario-" + i).start();
        }
    }
}
