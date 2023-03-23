package es.studium.ejercicio4;

import java.util.Scanner;

public class Ejercicio4
{

	public static void main(String[] args)
	{
		int num1, num2, i;
		Scanner teclado = new Scanner(System.in);


		System.out.println("Dame el primer número entero:");
		num1 = teclado.nextInt();
		System.out.println("Dame el segundo número entero:"); 
		num2 = teclado.nextInt();
		teclado.close();
		for(i=num1; i<=2; i++) // i-- (i=i-1) i+=2 (i=i+2) i-=1 (i=i-1)
		{
			if(i%2==0) 
			{
				System.out.println(i);
			}
		}

	}
}
