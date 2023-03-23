package es.studium.ejercicio19;

import java.util.Scanner;

public class Ejercicio19
{

	public static void main(String[] args)
	{
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un número entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dime el segundo número entero: ");
		num2 = teclado.nextInt();
		teclado.close();
		System.out.println("La suma de ambos números es: " + Suma(num1,num2));
		System.out.println("La resta de ambos números es: " + Resta(num1,num2));
		System.out.println("La multiplicación de ambos números es: " + Producto(num1,num2));
		if(num2==0)
		{
			System.out.println("Para realizar la división, el segundo número debe ser distinto a 0");
		}
		else
		{
			System.out.println("La división de ambos números es: " + Cociente(num1,num2));
		}

	}
	
	public static int Suma(int num1, int num2)
	{
		int resultado; //directamente tb podría poner return (a+b) y me ahorro líneas de código, lo mismo para las demás funciones
		resultado = num1 + num2;
		return resultado;
	}
	
	public static int Resta(int num1, int num2)
	{
		int resultado;
		resultado = num1 - num2;
		return resultado;
	}
	
	public static int Producto(int num1, int num2)
	{
		int resultado;
		resultado = num1 * num2;
		return resultado;
	}
	
	public static double Cociente(int num1, int num2)
	{
		double resultado;
		resultado = num1 / num2;
		return resultado;

	}

}
