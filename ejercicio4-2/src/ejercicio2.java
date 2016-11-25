import java.util.Scanner;

//Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas mayúsculas y minúsculas tiene y lo imprima
public class ejercicio2 {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);

		String F;
		int mayus, minus;
		System.out.println("introduce una frase max 80 caracteres");
		F = teclado.nextLine();

		mayus = 0;
		minus = 0;

		if (F.length() <= 80) {
			for (int posicion = 0; posicion < F.length(); posicion++) {
				if (F.charAt(posicion) >= 'A' && F.charAt(posicion) < 'Z') {
					mayus++;
				} else if (F.charAt(posicion) >= 'a' && F.charAt(posicion) < 'z') {
					minus++;

				}
			}
		}
		System.out.println("Hay " + mayus + " mayusculas");
		System.out.println("Hay " + minus + " minusculas");

	}
}
