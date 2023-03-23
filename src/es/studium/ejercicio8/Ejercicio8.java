package es.studium.ejercicio8;

import java.util.Scanner;

public class Ejercicio8
{

	public static void main(String[] args)
	{
		int base, exponente, i;
		int resultado = 1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce una base:");
		base = teclado.nextInt();
		System.out.println("Introduce un exponente:"); 
		exponente = teclado.nextInt();
		teclado.close();
		for(i = 1; i <= exponente; i++) 
		{
			resultado = resultado * base; //operación de arrastre
		}
		System.out.println("El cálculo de la potencia es: "+ resultado);

	}

}
