// Made by Mónica Gómez (Autumn64)
import java.util.concurrent.Semaphore;
import java.util.Random;

class Cena{
				private final Semaphore semaforo = new Semaphore(1);
				Random rand = new Random();
				public void comer(String filosofo){
								try{
									System.out.println("El " + filosofo + " está esperando para comer.");
									semaforo.acquire();
									int tiempo = rand.nextInt(6);
									if (tiempo == 0) tiempo = 1;
									System.out.println("El " + filosofo + " está comiendo.");
									Thread.sleep((long) tiempo * 1000);
									System.out.println("El " + filosofo + " ha terminado de comer. Ahora se pondrá a filosofar.");
								}catch (InterruptedException e){
												e.printStackTrace();
								}finally{
												semaforo.release();
								}
				}
}

class Filosofo extends Thread{
				private final Cena cena;
				private final String filosofo;
				public Filosofo(Cena cena, String filosofo){
								this.cena = cena;
								this.filosofo = filosofo;
				}
				@Override
				public void run(){
								cena.comer(filosofo);
				}
}

public class CenaFilosofos{
				public static void main(String[] args){
								Cena cena = new Cena();
								for (int i = 1; i <= 4; i++){
												new Filosofo(cena, "Filósofo " + i).start();
								}
				}
}
