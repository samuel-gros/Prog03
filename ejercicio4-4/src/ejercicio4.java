import java.util.Scanner;

//Leer una cadena de hasta 80 caracteres y pasarla en función de una variable de opción a mayúsculas ó a minúsculas e imprimir la cadena resultante

public class ejercicio4 {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		String frase;
		int N;
		System.out.println("introduce una frase");
		frase = teclado.nextLine();
		
		System.out.println("introduce 1 para pasarlo a mayusculas y 2 para minusculas");
		N=teclado.nextInt ();
		
		if (N==2){
		System.out.println(frase.toLowerCase());
		}
		if (N==1){
		System.out.println(frase.toUpperCase());
		}
		
		
		
	}
}
