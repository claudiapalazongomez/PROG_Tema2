package es.studium.ejercicio15; //este sería el ejercicio 14

import java.util.Scanner;

public class Ejercicio15
{

	public static void main(String[] args)
	{
		int base, exponente;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indicar el valor de la base: ");
		base = teclado.nextInt();
		System.out.println("Indicar el valor del exponente: ");
		exponente = teclado.nextInt();
		teclado.close();
		System.out.println("El número " + base + " elevado a " + exponente + " es igual a " + Potencia(base,exponente));
	}

	public static int Potencia(int base, int exponente)
	{
		int i, resultado = 1;
		for(i = 1; i <= exponente; i++)
		{
		resultado = resultado*base;
		}
		return (resultado);
	}

}
