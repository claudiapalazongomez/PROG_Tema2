package es.studium.ejercicio12;

import java.util.Scanner;

public class Ejercicio12
{
	public static int Suma(int num1, int num2)
	{
		int resultado;
		resultado = num1 + num2;
		return resultado; //podría poner tb directamente return a+b; y ahorrarme todo lo demás dentro de la función
	}
	
	public static void main(String[] args)
	{
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce otro número: ");
		num2 = teclado.nextInt();
		teclado.close();
		
		System.out.println("El resultado de la suma es: " + Suma(num1, num2));
	}
	
}
