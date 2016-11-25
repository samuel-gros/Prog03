package ejercicio10;

//Dado un numero N leído por teclado encontrar el numero P primo mas cercano a él por exceso.
import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		int n, contador, cercano, y, i;
		boolean primo;

		System.out.println("Introduzca el numero");
		n = t.nextInt();

		primo = false;
		cercano = 0;
		y = 1;

		while (primo == false) {
			contador = 0;
			cercano = n + y;

			for (i = 1; i <= cercano; i++) {
				if (cercano % i == 0) {
					contador++;
				}
			}

			if (contador == 2) {
				primo = true;
			}
			y++;

		}
		System.out.println("El numero " + cercano + " es el primo mas cercano");
	}
}
