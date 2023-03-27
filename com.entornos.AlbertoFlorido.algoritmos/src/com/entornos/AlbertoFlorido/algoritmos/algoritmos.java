package com.entornos.AlbertoFlorido.algoritmos;

public abstract class algoritmos {

	/**
	 * Recibe un numero entero y devuelve el numero de fibonacci de dicho numero.
	 * 
	 * @param n El numero cuyo fibonacci calcular
	 * @return El valor de la sucesion de fibonacci en la posicion N-esima
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
}
