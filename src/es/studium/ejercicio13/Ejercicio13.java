package es.studium.ejercicio13;

import java.util.Scanner;

public class Ejercicio13
{

	public static void main(String[] args)
	{
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el número entero del que quieres la tabla de multiplicar: ");
		num = teclado.nextInt();
		teclado.close();
		for(int i = 0; i <= 10; i++)
		{
			System.out.println(num + ("x") + i + "=" + num*i);
		}	

	}

}
