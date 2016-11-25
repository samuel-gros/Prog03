import java.util.Scanner;

//descifrado = letra – clave % 255
public class ejercicio8 {
	private static Scanner teclado;


		public static void main(String[] args) {
			teclado = new Scanner(System.in);
			String frase,cifrado,mayus;
			int  num=0,i=0,clave;
			
			System.out.println("introduce su frase modificada");
			mayus = teclado.nextLine();
			frase=mayus.toUpperCase();
			System.out.println("introduce  numero con el que cifrar el texto ");
			num = teclado.nextInt();
			clave = num % 26;
			cifrado="";
			for(i=0;i<frase.length();i++){
				if (frase.charAt(i)>='A'&& frase.charAt(i)<='Z'){
					if ((frase.charAt(i)+ clave)> 'Z'){
						cifrado =cifrado+((char)( frase.charAt(i)-num -26));
					}else{
						cifrado= cifrado+((char)(frase.charAt(i)-num));
					}
							
				}
			}
			System.out.println("cadena cifrada con el numero = "+num+" Este es su texto cifrado  "+cifrado);
			
			
	}
	}