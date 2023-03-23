package es.studium.ejercicio9;

import java.util.Scanner;

public class Ejercicio9
{

	public static void main(String[] args)
	{
		int num1, num2, suma, multiplicar;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el primer número entero:");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo número entero:"); 
		num2 = teclado.nextInt();
		teclado.close();
		if(num1 < num2)
		{
			suma = num1 + num2;
			System.out.println("Tu suma es: "+ suma);
		}
		else 
		{ 
			multiplicar = num1 * num2;
			System.out.println("Tu multiplicación es: "+ multiplicar);
		}

	}

}
