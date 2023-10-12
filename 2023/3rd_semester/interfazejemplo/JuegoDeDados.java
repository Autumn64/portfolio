// Made by Mónica Nayely Flores Gómez (Autumn64)
package interfazejemplo;
import java.util.Scanner;

public class JuegoDeDados implements Juego{
	private int dado1, dado2;
	private String jugador1, jugador2;
	private Scanner teclado;

	public JuegoDeDados(){
		teclado = new Scanner(System.in);
	}

	public void iniciar(){
		System.out.print("Ingrese el nombre del primer jugador: ");
		jugador1 = teclado.nextLine();
		System.out.print("Ingrese el nombre del segundo jugador: ");
		jugador2 = teclado.nextLine();
	}

	public void jugar(){
		dado1 = 1 + (int) (Math.random() * 6);
		dado2 = 1 + (int) (Math.random() * 6);
		System.out.println(jugador1 + " obtuvo el valor " + dado1);
		System.out.println(jugador2 + " obtuvo el valor " + dado2);
	}

	public void finalizar(){
		if (dado1 > dado2) System.out.println(jugador1 + " ganó con un valor de " + dado1);
		else if (dado1 < dado2) System.out.println(jugador2 + " ganó con un valor de " + dado2);
		else System.out.println("Ambos jugadores empataron con un valor de " + dado1);
	}
}
