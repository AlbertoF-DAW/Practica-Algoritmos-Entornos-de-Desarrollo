package com.entornos.AlbertoFlorido.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.entornos.AlbertoFlorido.arrays.Arrays;

public class TestArrays {

	static int[] array1;
	static int[] array2;
	static int[] array3;
	static int[] array4;
	
	@BeforeAll
	static void setUpBeforeClass(){
		array1 = new int[]{5, 4, 3, 1, 1};
		array2 = new int[]{0, 1, 3, 3};
		array3 = new int[]{7};
		array4 = new int[]{7, 3, 5, 7};
	}

	@Test
	void testMedia() {
		assertEquals(2.8, Arrays.media(array1));
		assertEquals(7.0/4.0, Arrays.media(array2));
		assertEquals(7, Arrays.media(array3));
		assertEquals(5.5, Arrays.media(array4));
	}
	
	@Test
	void testMediana() {
		assertEquals(3, Arrays.mediana(array1));
		assertEquals(2, Arrays.mediana(array2));
		assertEquals(7, Arrays.mediana(array3));
		assertEquals(6, Arrays.mediana(array4));
	}
	
	@Test
	void testMaximo() {
		assertEquals(5, Arrays.maximo(array1));
		assertEquals(3, Arrays.maximo(array2));
		assertEquals(7, Arrays.maximo(array3));
		assertEquals(7, Arrays.maximo(array4));
	}
	
	@Test
	void testMinimo() {
		assertEquals(1, Arrays.minimo(array1));
		assertEquals(0, Arrays.minimo(array2));
		assertEquals(7, Arrays.minimo(array3));
		assertEquals(3, Arrays.minimo(array4));
	}

}
