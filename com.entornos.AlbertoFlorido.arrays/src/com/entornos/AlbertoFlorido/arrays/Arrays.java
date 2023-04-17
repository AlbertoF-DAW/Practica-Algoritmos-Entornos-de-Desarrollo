package com.entornos.AlbertoFlorido.arrays;

public abstract class Arrays {

	/**
	 * Calcular la media aritmetica de un array de numeros enteros
	 * @param array de numeros enteros
	 * @return valor double que es la media aritmetica del array
	 */
	public static double media(int[] array) {
		return java.util.Arrays.stream(array).average().getAsDouble();
	}

	/**
	 * Calcular la mediana de un array de numeros enteros
	 * @param array de numeros enteros
	 * @return valor double que es la mediana del array
	 */
	public static double mediana(int[] array) {
		java.util.Arrays.sort(array);
		return array.length % 2 == 1 ? array[array.length / 2]
				: ((double) array[array.length / 2 - 1] + array[array.length / 2]) / 2;
	}

	/**
	 * Calcular el maximo de un array de numeros enteros
	 * @param array de numeros enteros
	 * @return valor entero que es el maximo del array
	 */
	public static int maximo(int[] array) {
		return java.util.Arrays.stream(array).max().getAsInt();
	}

	/**
	 * Calcular el minimo de un array de numeros enteros
	 * @param array de numeros enteros
	 * @return valor entero que es el minimo del array
	 */
	public static int minimo(int[] array) {
		return java.util.Arrays.stream(array).min().getAsInt();
	}
}
