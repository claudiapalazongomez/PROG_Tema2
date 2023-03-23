package es.studium.ejercicio16;

import java.util.Scanner;

public class Ejercicio16
{

	public static void main(String[] args)
	{
		int a, b, c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el número A: ");
		a = teclado.nextInt();
		System.out.println("Dime el número B: ");
		b = teclado.nextInt();
		System.out.println("Dime el número C: ");
		c = teclado.nextInt();
		teclado.close();
		System.out.println("La solución de tu función es: " + Funcion(a,b,c));
	}
		
	public static double Funcion(int a, int b, int c)
	{
		double resultado;
		resultado = ((double)(b*b-4*a*c)/(double)(2*a));
		return resultado;

	}

}
