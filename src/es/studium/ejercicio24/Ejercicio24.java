package es.studium.ejercicio24;

public class Ejercicio24
{

	public static void main(String[] args)
	{
		System.out.println("La suma de los cuadrados de los 100 primeros números es: " + SumaCuadradosPares());
		
	}
	
	public static int SumaCuadradosPares()
	{
		int num = 0;
		int resultado = 0;
		for(int i = 2; i <= 100; i+=2)
		{
			num = (int)Math.pow(i, 2); 
			resultado = resultado + num;	
		}
		return resultado;
	}

}

