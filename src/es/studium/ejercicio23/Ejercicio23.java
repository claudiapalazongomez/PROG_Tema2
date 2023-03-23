package es.studium.ejercicio23;

public class Ejercicio23
{

	public static void main(String[] args)
	{
		System.out.println("La suma de los cuadrados de los 100 primeros números es: " + SumaCuadrados()); //debe salir 338350
		
	}
	
	public static int SumaCuadrados()
	{
		int num = 0;
		int resultado = 0;
		for(int i = 1; i <= 100; i++)
		{
			num = (int)Math.pow(i, 2); //esta función sirve para elevar un número (en este caso i) a una potencia (en este caso 2)
			resultado = resultado + num;
		}
		return resultado;
	}

}
