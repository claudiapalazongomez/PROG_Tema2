package es.studium.ejercicio16;

import java.util.Scanner;

public class Ejercicio16
{

	public static void main(String[] args)
	{
		int a, b, c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el n�mero A: ");
		a = teclado.nextInt();
		System.out.println("Dime el n�mero B: ");
		b = teclado.nextInt();
		System.out.println("Dime el n�mero C: ");
		c = teclado.nextInt();
		teclado.close();
		System.out.println("La soluci�n de tu funci�n es: " + Funcion(a,b,c));
	}
		
	public static double Funcion(int a, int b, int c)
	{
		double resultado;
		resultado = ((double)(b*b-4*a*c)/(double)(2*a));
		return resultado;

	}

}
