package com.entornos.AlbertoFlorido.algoritmos;

public abstract class algoritmos {

	/**
	 * Recibe un numero entero y devuelve el numero de fibonacci de dicho numero.
	 * 
	 * @param n El numero cuyo fibonacci se quiere calcular
	 * @return El valor de la sucesion de fibonacci en la posicion n-esima
	 */
	public static int fibonacci(int n) {
		int n0 = 0, n1 = 1, res = 0;

		for (int i = 0; i < 0; i++) {
			if (i % 2 == 0) {
				n0 += n1;
				res = n0;
			} else {
				n1 += n0;
				res = n1;
			}
		}
		return res;
	}

	/**
	 * Recibe un numero entero y devuelve el factorial de dicho numero.
	 * 
	 * @param n El numero cuyo factorial se quiere calcular
	 * @return El valor del factorial de n
	 */
	public static int factorial(int n) {
		int res = 1;
		for (int i = 2; i <= n; i++) {
			res *= i;
		}
		return res;
	}
}
