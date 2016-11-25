package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int n, a, b, resu;
		

		System.out.println("Introduce el numero correspondiente a la figura de la que quieres calcular el area:");
		System.out.println("    1 - Triángulo");
		System.out.println("    2 - Cuadrado");
		System.out.println("    3 - Rectangulo");

		n= teclado.nextInt();
		if (n>=1&&n<=3)
		{
			switch(n)
			{
			case (1):
				System.out.println("Has seleccionado Triángulo:");
			System.out.println("Introduce la base:");
			b= teclado.nextInt();
			System.out.println("Introduce la altura");
			a= teclado.nextInt();
			resu=(b*a)/2;
			System.out.println("El area del triangulo es: "+resu);
			break;
			
			case (2):
				System.out.println("Has seleccionado Cuadrado:");
			System.out.println("Introduce el lado:");
			b= teclado.nextInt();
			resu=b*b;
			System.out.println("El area del Cuadrado es: "+resu);
			break;

			case (3):
				System.out.println("Has seleccionado Rectangulo:");
			System.out.println("Introduce la base:");
			b= teclado.nextInt();
			System.out.println("Introduce la altura");
			a= teclado.nextInt();
			resu=b*a;
			System.out.println("El area del Rectangulo es: "+resu);
			break;

			}
		}	
		else	
			System.out.println("Error, seleccione un numero del 1 al 3");

	}

}