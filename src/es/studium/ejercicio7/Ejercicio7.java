package es.studium.ejercicio7;

import java.util.Scanner;

public class Ejercicio7
{

	public static void main(String[] args)
	{
		int num1, num2;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dame el primer número entero:");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo número entero:"); 
		num2 = teclado.nextInt();
		teclado.close();
		if(num1 == num2) 
		{
			System.out.println("Son iguales");
		}
		else 
		{ 
			if(num1 < num2) 
			{
				System.out.println("El segundo es mayor");
			}
			else 
			{
				System.out.println("El primero es mayor");
			}
		}

	}
}