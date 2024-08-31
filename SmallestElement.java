package com.array.problems;


public class SmallestElement {

	    public static void main(String[] args) {
	        
	        int a[] = {10, 20, 30};
	        
	        int total = a.length;
	        int temp;

	        for (int i = 0; i < total; i++) {
	            for (int j = i; j < total; j++) {
	                if (a[i] < a[j]) {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        System.out.println("Smallest Number in array " + a[total - 1]);
	    }
	}

