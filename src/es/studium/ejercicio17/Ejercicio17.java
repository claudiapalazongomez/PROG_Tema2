package es.studium.ejercicio17;

import java.util.Scanner;

public class Ejercicio17
{

	public static void main(String[] args) //REVISAR
	
	{
		int num1, num2, num3;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Dime el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Dime el tercer número: ");
		num3 = teclado.nextInt();
		teclado.close();
		
		if((num1 >= num2) && (num2 >= num3))
		{
			System.out.println("El orden de mayor a menor es: "+ num1 + ","+ num2 + ","+ num3);
		}
		else if((num1 >= num3) && (num3 >= num2))
		{
			System.out.println("El orden de mayor a menor es: "+ num1 + ","+ num3 + ","+ num2);
		}
		else if((num2 >= num1) && (num1 >= num3))
		{
			System.out.println("El orden de mayor a menor es: "+ num2 + ","+ num1 + ","+ num3);
		}
		else if((num2 >= num3) && (num3 >= num1))
		{
			System.out.println("El orden de mayor a menor es: "+ num2 + ","+ num3 + ","+ num1);
		}
		else if((num3 >= num1) && (num1 >= num2))
		{
			System.out.println("El orden de mayor a menor es: "+ num3 + ","+ num1 + ","+ num2);
		}
		else if((num3 >= num2) && (num2 >= num1))
		{
			System.out.println("El orden de mayor a menor es: "+ num3 + ","+ num2 + ","+ num1);
		}			
		
	}

}
