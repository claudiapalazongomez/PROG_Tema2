package es.studium.ejercicio10;

import java.util.Scanner;

public class Ejercicio10
{

	public static void main(String[] args)
	{
		int num, veces;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de veces: ");
		veces = teclado.nextInt();
		System.out.println("Introduce el número a repetir: "); 
		num = teclado.nextInt();
		teclado.close();
		for(int i = 1; i <= veces; i++) //declarar mejor la i en el for, si pusiera i = 0; i < veces (SIN EL IGUAL)
		{ 
			System.out.println(num);
		}

	}

}
