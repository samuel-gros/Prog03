import java.util.Scanner;

//Leer una frase por teclado (máximo 80 car) y construir otras dos cadenas
//de forma que una contenga los caracteres en posición par y la otra los caracteres en posición impar.

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		int contador = 0;

		System.out.println("introduce una palabra max 80 caracteres");
		frase = teclado.nextLine();

		if (frase.length() <= 80) {
			
			
			System.out.println("pares");
			for (contador = 0; contador < frase.length(); contador += 2) {
				System.out.print(frase.charAt (contador));
			}
			System.out.println("");
			System.out.println("impares");
			for (contador = 1; contador < frase.length(); contador += 2) {
				System.out.print(frase.charAt (contador));
			
			
			}
		}
	}
}