package ejercicio05;

import java.util.Scanner;

public class ejercicio05 { //Hacer un programa que lea una serie de números por teclado de manera que cuando 
		//el número leído sea el cero ya no se introduzcan más, el programa debe calcular y escribir la suma 
		//de los números de la serie y cuántos se han introducido en total.

	private static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teclado = new Scanner (System.in);
		
	int n=0,suma=0,contador=0;
	
	  System.out.print("Introduce un número  ");
      n=teclado.nextInt ();

      while (n !=0){
    	  contador = contador + 1;
    	  suma = n + suma;
    	  System.out.print("Introduce un número  ");
          n=teclado.nextInt ();
          
      }
    	  
           System.out.println ("la suma de todos los numeros introducidos es  "+ suma);
           System.out.println("la cantidad de números introducidos es  "+ contador);
	} 
}
