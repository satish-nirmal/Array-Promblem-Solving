package com.array.problems;

/**
 * Question :
 * 1. Find the Third largest element in array 
 */

/**
 * @author Satish
 */

public class ThirdLargestElement {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 50,30 ,87, 33,56};

		int total = a.length;
		int temp;

		for (int i = 0; i < total; i++) {
			for (int j = i; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Largest Number in array " + a[total - 3]);
	}
}
