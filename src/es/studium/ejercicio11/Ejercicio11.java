package es.studium.ejercicio11;

import java.util.Scanner;

public class Ejercicio11
{
	public static void main(String[] args)
	{
		int num1, num2, intercambio;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: "); 
		num2 = teclado.nextInt();
		teclado.close();
		
		intercambio = num1;
		num1 = num2;
		num2 = intercambio;
		
		System.out.println("Tu primer número se ha convertido en: "+num1);
		System.out.println("Tu segundo número se ha convertido en: "+num2);
		/*con otra variable int intercambio2 sería:
		 * intercambio = num1;
		 * intercambio2 = num2;
		 * num1 = intercambio2;
		 * num2 = intercambio;
		 */
	}

}
