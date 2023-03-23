package es.studium.ejercicio2;

import java.util.Scanner; //CTRL MAYUS (flechita para arriba de encima de CTRL) O

public class Ejercicio2 
{

	public static void main(String[] args) 
	{
		// ENTERO num1, num2, suma
		int num1, num2, suma;
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR "Dame el primer número entero: "
		System.out.println("Dame el primer número entero:");
		//LEER num1
		num1 = teclado.nextInt();
		//ESCRIBIR "Dame el segundo número entero: "
		System.out.println("Dame el segundo número entero:"); //CTRL A CTRL I
		//LEER num2
		num2 = teclado.nextInt();
		teclado.close();
		//suma = num1+num2
		suma = num1 + num2;
		//ESCRIBIR "La suma de ambos nmeros enteros es "+suma
		System.out.println("La suma de ambos números enteros es "+ suma);
	}

}
