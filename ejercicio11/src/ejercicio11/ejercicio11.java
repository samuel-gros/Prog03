package ejercicio11;

//Dado un numero N imprimir la lista de todos los numero primos hasta dicho numero N.
import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		int n, contador, cercano, y, i;
		boolean primo;

		System.out.println("Introduzca el numero");
		n = t.nextInt();

		primo = false;
		i = 1;
		while (n != i) {

			for (i = 1; i <= n; i++) {
				primo = true;
			}

			for (y = 2; y < i; y++) {
				if (i % y == 0) {
					primo = false;
				}
			}
			System.out.println("El numero " + primo + " es el primo mas cercano");
		}
	}
}