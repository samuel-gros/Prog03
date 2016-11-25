package ejercicio03;

import java.util.Scanner;
//Escribir un programa que una vez que lea un número N por teclado calcule y escriba sus divisores por la pantalla 
//(sin incluirse a si mismo).
public class ejercicio03 {
	private static Scanner teclado;
	public static void main (String[]args) {
		teclado = new Scanner (System.in);
		int N ;
		
		System.out.print ("ingrese un nº:");
		N=teclado.nextInt ();
		 for (int i = 1 ; i < N ; i++)
	            if (N % i == 0)
	                System.out.println (i);
	}

}
