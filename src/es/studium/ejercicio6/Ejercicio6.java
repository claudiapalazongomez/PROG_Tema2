package es.studium.ejercicio6;

import java.util.Scanner;

public class Ejercicio6
{

	public static void main(String[] args)
	{
		int numerador, denominador;
		double resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame el numerador: ");
		numerador = teclado.nextInt();
		System.out.println("Dame el denominador: ");
		denominador = teclado.nextInt();
		teclado.close();
		resultado = dividir(numerador, denominador);
		System.out.println(resultado);
	}

	private static double dividir(int numerador, int denominador) //puede estar antes del main, en otra clase... te lo lee igual, y las variables entre paréntesis se pueden llamar de otra manera es decir si pongo (int num, int den) te detecta los valores que le has asignado en el main como dividir(numerador, denominador) PERO SON VARIABLES TOTALMENTE DIFERENTES pero es como si los valores del main SE CLONASEN en la función 
	{
		double r;
		r = (double) numerador / (double) denominador; //se llama CASTING, no convertimos esos int en double SOLO en este momento el programa los traduce como doubles para que el resultado pueda ser double
		return r;
	}

}
