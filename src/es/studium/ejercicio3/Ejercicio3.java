package es.studium.ejercicio3;

import java.util.Scanner;

public class Ejercicio3
{

	public static void main(String[] args)
	{
		int num;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número entero: ");
		num = teclado.nextInt();
		teclado.close();
		if(num%2==0) 
		{
			System.out.println("Tu número es PAR");
		}
		else 
		{
			System.out.println("Tu número es IMPAR");
		}
	}
}
