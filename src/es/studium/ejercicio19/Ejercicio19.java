package es.studium.ejercicio19;

import java.util.Scanner;

public class Ejercicio19
{

	public static void main(String[] args)
	{
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un n�mero entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dime el segundo n�mero entero: ");
		num2 = teclado.nextInt();
		teclado.close();
		System.out.println("La suma de ambos n�meros es: " + Suma(num1,num2));
		System.out.println("La resta de ambos n�meros es: " + Resta(num1,num2));
		System.out.println("La multiplicaci�n de ambos n�meros es: " + Producto(num1,num2));
		if(num2==0)
		{
			System.out.println("Para realizar la divisi�n, el segundo n�mero debe ser distinto a 0");
		}
		else
		{
			System.out.println("La divisi�n de ambos n�meros es: " + Cociente(num1,num2));
		}

	}
	
	public static int Suma(int num1, int num2)
	{
		int resultado; //directamente tb podr�a poner return (a+b) y me ahorro l�neas de c�digo, lo mismo para las dem�s funciones
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
