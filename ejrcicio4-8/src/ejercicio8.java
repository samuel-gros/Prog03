import java.util.Scanner;

//Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y dado un numero entre 1 y 10 haga un 
//cifrado de la frase (denominado cifrado CESAR) del modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera 
//que cada carácter se transforme en 3 códigos ASCII mas es decir :
//	Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
//	Desarrollar los programas de codificar y descodificar mediante dos funciones.
public class ejercicio8 {	
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		String frase,cifrado,mayus;
		int  num=0,i=0,clave;
		
		System.out.println("introduce una frase en mayusculas");
		mayus = teclado.nextLine();
		frase=mayus.toUpperCase();
		System.out.println("introduce un numero con el que cifrar el texto ");
		num = teclado.nextInt();
		clave = num % 26;
		cifrado="";
		for(i=0;i<frase.length();i++){
			if (frase.charAt(i)>='A'&& frase.charAt(i)<='Z'){
				if ((frase.charAt(i)+ clave)> 'Z'){
					cifrado =cifrado+((char)( frase.charAt(i)+num -26));
				}else{
					cifrado= cifrado+((char)(frase.charAt(i)+num));
				}
						
			}
		}
		System.out.println("cadena cifrada con el numero = "+num+" Este es su texto cifrado  "+cifrado);
		
		
}
}