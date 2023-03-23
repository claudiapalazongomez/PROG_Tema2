package es.studium.ejercicio26;

import java.util.Scanner;

public class Ejercicio26
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nombre;
		int fechaNacimiento, edad;
		System.out.println("Indique su nombre:");
		nombre= teclado.nextLine();
		System.out.println("Indique su fecha de nacimiento:");
		fechaNacimiento = teclado.nextInt();
		teclado.close();
		edad = 2030 - fechaNacimiento;
		System.out.println("Hola, "+ nombre +" , en el año 2030 tendrás "+ edad +" años.");	

	}

}
