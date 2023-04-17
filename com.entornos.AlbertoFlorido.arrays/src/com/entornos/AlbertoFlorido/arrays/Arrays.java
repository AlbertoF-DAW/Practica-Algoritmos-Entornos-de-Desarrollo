package com.entornos.AlbertoFlorido.arrays;

public abstract class Arrays {

	/**
	 * Funcion para calcular la media aritmetica de un array de numeros enteros
	 * 
	 * @param array
	 * @return valor double que es la media aritmetica del array
	 */
	public static double media(int[] array) {
		return java.util.Arrays.stream(array).average().getAsDouble();
	}

	public static double mediana(int[] array) {

		return 0;
	}

	public static int maximo(int[] array) {
		return 0;
	}

	public static int minimo(int[] array) {
		return 0;
	}
}
