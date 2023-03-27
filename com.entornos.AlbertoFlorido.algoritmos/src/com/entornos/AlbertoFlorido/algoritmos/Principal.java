package com.entornos.AlbertoFlorido.algoritmos;

/**
 * 
 * @author Alberto
 *
 */
public class Principal {

	public static void main(String[] args) {
		// Array numeros
		int[] numeros = new int[5];
		for (int i = 0; i < numeros.length; i++)
			numeros[i] = (int) (Math.random() * 100 + 1);

		// Prueba fibonacci
		long[] resultadoFibonacci = new long[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
			resultadoFibonacci[i] = algoritmos.fibonacci(numeros[i]);
		}
		// Prueba factorial
		long[] resultadoFactorial = new long[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
			resultadoFactorial[i] = algoritmos.factorial(numeros[i]);
		}
		
		// Prueba primo
		boolean[] resultadoPrimos = new boolean[numeros.length];

		for (int i = 0; i < numeros.length; i++) {
			resultadoPrimos[i] = algoritmos.primo(numeros[i]);
		}
	}
}
