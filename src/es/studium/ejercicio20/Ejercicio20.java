package es.studium.ejercicio20;

import java.util.Scanner;
import es.studium.ejercicio19.Ejercicio19;

public class Ejercicio20
{

	public static void main(String[] args)
	{
		int num1, num2, num3;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un número entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dime el segundo número entero: ");
		num2 = teclado.nextInt();
		System.out.println("Dime el tercer número entero: ");
		num3 = teclado.nextInt();
		teclado.close();
		System.out.println("La suma de los números es: "+ (Ejercicio19.Suma(num1,num2)+ num3));
		System.out.println("La multiplicación de los números es: "+ Producto(num1,num2,num3));
		System.out.println("La media de los números es: "+ Media(num1,num2,num3));
		

	}
	
	public static int Producto(int num1, int num2, int num3)
	{
		int resultado;
		resultado = num1 * num2 * num3;
		return resultado;
	}
	
	public static int Media(int num1, int num2, int num3)
	{
		int resultado;
		resultado = (num1 + num2 + num3)/2;
		return resultado;
	}
}
