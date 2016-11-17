package ejercicio01;

import java.util.Scanner;

public class circulo {
	private static Scanner teclado;
	public static void main (String[]args) {
		teclado = new Scanner (System.in);

		
		double radio;
		
		System.out.print ("Ingrese el radio ");
		radio=teclado.nextDouble ();
		
		double perimetro= 2*Math.PI*radio;
		double area= Math.PI*Math.pow(radio, 2);
		System.out.println("Su perimetro es " + perimetro);
		System.out.print("Su area es " + area);
		
}
}
