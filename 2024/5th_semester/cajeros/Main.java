// Made by Mónica Gómez (Autumn64)
import java.util.concurrent.Semaphore;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList; // Array para luego poder hacer join para evitar la condición de carrera
							// del mensaje de salida

class Cajero {
    private final Semaphore semaforo = new Semaphore(5);
	Random rand = new Random();
    public void servicio(String hiloUsuario) {
        try {
            System.out.println(hiloUsuario + " está esperando para usar el cajero.");
            // Adquiere un permiso del semáforo con el método acquire
            semaforo.acquire();
			int tiempo = rand.nextInt(1, 5);
            System.out.println(hiloUsuario + " está utilizando el cajero.");
            Thread.sleep((long) tiempo * 1000);
            System.out.println(hiloUsuario + " ha terminado de utilizar el cajero." );
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaforo.release();
        }
    }
}

class Cliente extends Thread {
    private final Cajero cajero;
    private final String hiloUsuario;
    public Cliente(Cajero cajero, String hiloUsuario) {
        this.cajero = cajero;
        this.hiloUsuario = hiloUsuario;
    }
    @Override
    public void run() {
        cajero.servicio(hiloUsuario);
    }
}

public class Main {
    public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String opcion;
        Cajero cajero = new Cajero();
		while(true){
			ArrayList<Cliente> clientes = new ArrayList<>();
        	for (int i = 1; i <= random.nextInt(3, 20); i++) {
            	Cliente cliente = new Cliente(cajero, "Usuario-" + i);
				clientes.add(cliente);
				cliente.start();
        	}

			for (Cliente cliente : clientes){
					try{
							cliente.join();
					}catch(InterruptedException e){
							e.printStackTrace();
					}
			}

			System.out.print("¿Desea repetir la simulación? (S/n): ");
			opcion = scanner.nextLine();
			if (!opcion.equals("S") && !opcion.equals("s")) break;
		}
    }
}

