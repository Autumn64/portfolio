// Made by Mónica Gómez (Autumn64)
import java.util.concurrent.Semaphore;
import java.util.Random;

public class Escritores{
		public static final Semaphore Es_mutex = new Semaphore(1, true);
		public static final Semaphore Lec_mutex = new Semaphore(1, true);
		public static final Random rand = new Random();
		// Región crítica
		public static int RC = 0;

		public static void main(String [] args){
				int esc, lec;
				Administrar manage = new Administrar();
				for (int i = 1; i < 6; i++){
						// 5 Lectores
						new Thread(new Lector(i, manage), "Lector " + i).start();
				}
				for (int i = 1; i < 4; i++){
						// 3 Escritores
						new Thread(new Escritor(i, manage), "Escritor " + i).start();
				}
		}
}

class Escritor implements Runnable{
		private int num;
		private Administrar manage;

		public Escritor(int num, Administrar manage){
				super();
				this.num = num;
				this.manage = manage;
		}

		@Override
		public void run(){
				while(true){
					System.out.println(Thread.currentThread().getName() + " está escribiendo.");
					manage.dormir();
					manage.Escribe();
				}
		}
}

class Lector implements Runnable{
		private int num;
		private Administrar manage;

		public Lector(int num, Administrar manage){
				super();
				this.num = num;
				this.manage = manage;
		}

		@Override
		public void run(){
				while(true){
					manage.dormir();
					manage.ComienzaLectura();
					System.out.println(Thread.currentThread().getName() + " está leyendo.");
					manage.dormir();
					manage.TerminaLector();
				}
		}
}

class Administrar{
		public Administrar(){
				super();
		}

		public void dormir(){
				try{
						Thread.sleep(1000);
				}catch (InterruptedException e){
						e.printStackTrace();
				}
		}

		public void ComienzaLectura(){
				try{
						Escritores.Lec_mutex.acquire();
						if (Escritores.RC == 0){
								Escritores.Es_mutex.acquire();
						}
						Escritores.RC++;
				}catch (InterruptedException e){
						e.printStackTrace();
				}finally{
						Escritores.Lec_mutex.release();
				}
		}

		public void TerminaLector(){
				try{
						Escritores.Lec_mutex.acquire();
						Escritores.RC--;
						if (Escritores.RC == 0) Escritores.Es_mutex.release();
						System.out.println(Thread.currentThread().getName() + " ha terminado de leer.");
				}catch (InterruptedException e){
						e.printStackTrace();
				}finally{
						Escritores.Lec_mutex.release();
				}
		}

		public void Escribe(){
				try{
						Escritores.Es_mutex.acquire();
				}catch (InterruptedException e){
						e.printStackTrace();
				}finally{
						Escritores.Es_mutex.release();
				}
		}
}
