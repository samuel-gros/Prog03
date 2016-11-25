import java.util.Scanner;

//Leer una frase de máximo 80 caracteres y escribirla progresivamente

public class ejercicio1 {
	private static Scanner teclado;
	public static void main (String[]args) {
		teclado = new Scanner (System.in);
		
		String s1 , P;
		
		System.out.println ("introduce una palabra max 80 caracteres");
		P=teclado.nextLine ();
		s1= P;
		 if (P.length()<=80)
			 for (int j=0;j<=P.length();j++)

				 System.out.println (s1.substring(0,j));

}
}