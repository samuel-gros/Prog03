import java.util.Scanner;
//Leer una frase por teclado y escribir a continuación cuantas mayúsculas, minúsculas y números contiene.

public class ejercicio7 {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		String frase;
		int contador = 0, numero = 0, mayus = 0, minus = 0;

		System.out.println("introduce una frase de maximo 80 caracteres");
		frase = teclado.nextLine();
		
			for (contador = 0; contador < frase.length(); contador++) {
				if (frase.charAt(contador) >= '0' && frase.charAt(contador) < '9') {
					numero++;
					}
				else if (frase.charAt(contador) >= 'A' && frase.charAt(contador) <= 'Z'
						|| frase.charAt(contador) >= 'a' && frase.charAt(contador) <= 'z') {
					 		
					if (frase.charAt(contador) >= 'A' && frase.charAt(contador) <= 'Z'){
						mayus++;
					}else if (frase.charAt(contador) >= 'a' && frase.charAt(contador) <= 'z'){
						minus++;
					}
				
				}				
			}
			System.out.println("numeros   "+numero);
			System.out.println("mayusculas   "+mayus);
			System.out.println("minusculas   "+minus);		


	}
}