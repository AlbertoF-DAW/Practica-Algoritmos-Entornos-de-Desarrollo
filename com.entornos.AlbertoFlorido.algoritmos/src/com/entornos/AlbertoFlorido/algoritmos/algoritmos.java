package com.entornos.AlbertoFlorido.algoritmos;

/**
 * 
 * @author Alberto
 *
 */
public abstract class algoritmos {

	/**
	 * Recibe un numero entero y devuelve el numero de fibonacci de dicho numero.
	 * 
	 * @param n El numero cuyo fibonacci se quiere calcular
	 * @return El valor de la sucesion de fibonacci en la posicion n-esima
	 */
	public static long fibonacci(int n) {
		int n0 = 0, n1 = 1;
		long res = 0;

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
	public static long factorial(int n) {
		long res = 1;
		for (int i = 2; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	/**
	 * Recibe un numero entero y devuelve true o false en funcion de si es primo o
	 * no.
	 * 
	 * @param n El numero entero a comprobar si es primo
	 * @return Devuelve un valor booleano segun si es primo (true) o no (false)
	 */
	public static boolean primo(int n) {
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
