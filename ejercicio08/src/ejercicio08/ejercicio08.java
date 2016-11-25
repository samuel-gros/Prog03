package ejercicio08;
//Se define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1. Hacer un programa que lea un número N 
//filtrando que debe ser mayor que cero y calcule su factorial.
import java.util.Scanner;

public class ejercicio08 {
	private static Scanner teclado;
	public static void main (String[]args) {
		teclado = new Scanner (System.in);
		
		int N, Factorial;
		System.out.print ("ingrese un nº:");
		N=teclado.nextInt ();
				Factorial=1;
				
		while (N>0){		
				Factorial=Factorial*N;
				N--;
				
			}
		 System.out.println(Factorial);
			
		}
		
		
	}

