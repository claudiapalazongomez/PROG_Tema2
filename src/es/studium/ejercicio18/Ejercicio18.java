package es.studium.ejercicio18;

import java.util.Scanner;

public class Ejercicio18
{

	public static void main(String[] args)
	{
		int num1, num2, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un n�mero entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dime el segundo n�mero: ");
		num2 = teclado.nextInt();
		teclado.close();
		resultado = num1 + num2;
		System.out.println("La suma de ambos n�meros es: "+ resultado);
		resultado = num1 - num2;
		System.out.println("La resta de ambos n�meros es: "+ resultado);
		resultado = num1 * num2;
		System.out.println("La multiplicaci�n de ambos n�meros es: "+ resultado);
		if(num2==0)
		{	
			System.out.println("Para realizar la divisi�n, tu segundo n�mero debe ser distinto a 0");
		}
		else
		{
			resultado = num1 / num2;
			System.out.println("La divisi�n de ambos n�meros es: "+ resultado);
		}
		
	}

}
