package ejercicio01;

import java.util.Scanner;

public class prueba {
	private static Scanner teclado;
	public static void main (String[]args) {
		teclado = new Scanner (System.in);
		
		int opcion=0;
	
		do {
			System.out.println("1 para triángulo");
			System.out.println("2 para cuadrado");
			System.out.println("3 para rectángulo");
			System.out.print("Elija una figura ");
			opcion=teclado.nextInt ();
			
		if (opcion==1) {
			
			double altura;
			double base;
	
			System.out.print("Ingrese su base ");
			base=teclado.nextDouble ();
			System.out.print("Ingrese su altura ");
			altura=teclado.nextDouble ();
			
			double area = (base*altura)/2;
			System.out.println("Su area es " + area );
			area=teclado.nextDouble ();
		
		}
		
		else if (opcion==2){
			
			
			
		}
		
		
		}while(opcion<3);
	}
}

