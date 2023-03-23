package es.studium.ejercicio18;

import java.util.Scanner;

public class Ejercicio18
{

	public static void main(String[] args)
	{
		int num1, num2, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un número entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dime el segundo número: ");
		num2 = teclado.nextInt();
		teclado.close();
		resultado = num1 + num2;
		System.out.println("La suma de ambos números es: "+ resultado);
		resultado = num1 - num2;
		System.out.println("La resta de ambos números es: "+ resultado);
		resultado = num1 * num2;
		System.out.println("La multiplicación de ambos números es: "+ resultado);
		if(num2==0)
		{	
			System.out.println("Para realizar la división, tu segundo número debe ser distinto a 0");
		}
		else
		{
			resultado = num1 / num2;
			System.out.println("La división de ambos números es: "+ resultado);
		}
		
	}

}
