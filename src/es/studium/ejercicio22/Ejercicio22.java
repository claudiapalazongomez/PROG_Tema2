package es.studium.ejercicio22;

import java.util.Scanner;

public class Ejercicio22
{

	public static void main(String[] args)
	{	
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d, e;
		System.out.println("Indicar el valor de la primera cifra del n�mero binario:");
		e = teclado.nextInt();
		System.out.println("Indicar el valor de la segunda cifra del n�mero binario:");
		d = teclado.nextInt();
		System.out.println("Indicar el valor de la tercera cifra del n�mero binario:");
		c = teclado.nextInt();
		System.out.println("Indicar el valor de la cuarta cifra del n�mero binario:");
		b = teclado.nextInt();
		System.out.println("Indicar el valor de la quinta cifra del n�mero binario:");
		a = teclado.nextInt();
		System.out.println("El numero decimal equivalente es:"+ Conversion(e, d, c, b, a));
		teclado.close();
	}	
	
	public static int Conversion(int e, int d, int c, int b, int a)
	{
		int resultado = 0;
		resultado = (e*16)+(d*8)+(c*4)+(b*2)+(a*1);
		return(resultado);
	}
		
		/*long num, aux, digito, decimal;
	    int exponente;
	    boolean esBinario;
	    Scanner teclado = new Scanner(System.in);

	    //Leer un n�mero por teclado y comprobar que es binario
	    do {
	         System.out.print("Introduce un numero binario: ");
	         num = teclado.nextInt();
	         esBinario = true; 
	         aux = num;
	         while (aux != 0) {
	                    digito = aux % 10; //con esto averiguamos su resto (si cogemos el n�mero 1101 mod 10, su resto es 1; en la siguiente vuelta cogemos el 110 cuyo resto es 0... y as� logramos quedarnos con la cifra final del n�mero para analizar si se va tratando de un n�mero binario)
	                    if (digito != 0 && digito != 1) { //si no es 0 � 1 el resto
	                         esBinario = false; //entonces NO es un n�mero binario
	                    }
	                    aux = aux / 10; //quitamos la �ltima cifra para repetir el proceso                           
	           }
	     } while (!esBinario); //se vuelve a pedir si no es binario, as� nos saltar�a una y otra vez el syso
	     teclado.close();
	     
	     //Proceso para pasar de binario a decimal
	     exponente = 0;
	     decimal = 0; 
	     while (num != 0) {
	               digito = num % 10;                        
	               decimal = decimal + digito * (int) Math.pow(2, exponente); //se multiplica por la potencia de 2 correspondiente y se suma al n�mero 
	               exponente++; //se aumenta el exponente
	               num = num / 10; //se quita la �ltima cifra para repetir el proceso
	     }
	     System.out.println("El n�mero pasado a decimal es: " + decimal);*/
	  
	}

