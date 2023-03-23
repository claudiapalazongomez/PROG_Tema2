package es.studium.ejercicio21;

import java.util.Scanner;

public class Ejercicio21
{

	public static void main(String[] args)
	{
		float lado1, lado2, lado3;
		Scanner teclado = new Scanner(System.in);
		
		do {
		System.out.println("Dime las medidas del primer lado: ");
		lado1 = teclado.nextInt();
		System.out.println("Dime las medidas del segundo lado: ");
		lado2 = teclado.nextInt();
		System.out.println("Dime las medidas del tercer lado: ");
		lado3 = teclado.nextInt();
		} while((lado1<=0) || (lado2<=0) || (lado3<=0));
		teclado.close();
		
		
		if((lado1==lado2) && (lado2==lado3)) 
		{
			System.out.println("Tu triángulo es equilátero");
		}
		else if((lado1==lado2) || (lado2==lado3) || (lado1==lado3))
		{
			System.out.println("Tu triángulo es isósceles");
		}
		else
		{
			System.out.println("Tu triángulo es escaleno");
		}

	}

}
