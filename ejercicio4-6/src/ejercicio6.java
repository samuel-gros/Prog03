
import java.util.Scanner;
//Leer una frase por teclado (máximo 80) y a continuación escribir cuantas vocales, consonantes y caracteres numéricos posee.

public class ejercicio6 {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		String frase;
		int contador = 0, numero = 0, vocal = 0, consonante = 0;

		System.out.println("introduce una frase de maximo 80 caracteres");
		frase = teclado.nextLine();
		if (frase.length() <= 80) {
			for (contador = 0; contador < frase.length(); contador++) {
				if (frase.charAt(contador) >= '0' && frase.charAt(contador) < '9') {
					numero++;
				} else if (frase.charAt(contador) >= 'A' && frase.charAt(contador) <= 'Z'
						|| frase.charAt(contador) >= 'a' && frase.charAt(contador) <= 'z') {
					// SABEMOS QUE ES UNA LETRA
					if (frase.charAt(contador) != 'a' && frase.charAt(contador) != 'e' && frase.charAt(contador) != 'i'
							&& frase.charAt(contador) != 'o' && frase.charAt(contador) != 'u'
							&& frase.charAt(contador) != 'A' && frase.charAt(contador) != 'E'  //Distingue entre vocal y consonante
							&& frase.charAt(contador) != 'I' && frase.charAt(contador) != 'O'
							&& frase.charAt(contador) != 'U') {
						consonante++;
					} else {
						vocal++;
					}
				}
			}
			System.out.println(numero);
			System.out.println(vocal);
			System.out.println(consonante);
		}

	}
}