import java.util.Scanner;

//Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra en la frase y si no la encuentra devuelva un cero.

public class ejercicio3 {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		String frase, palabra;

		System.out.println("introduce una frase");
		frase = teclado.nextLine();
		System.out.println("introduce una palabra de la frase anterior");
		palabra = teclado.nextLine();

		System.out.println(frase.indexOf(palabra));
		
	

	}
}