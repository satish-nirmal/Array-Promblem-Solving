package com.array.problems;

/**
 * Question :
 * 1. Find the Acceding order of array 
 */

/**
 * @author Satish
 */


public class SortAccending {
	
	public static void main(String[] args) {
		
		
	      int [] arr = new int [] {5, 2, 8, 7, 1};  
	      int total = arr.length;
	        int temp = 0;    
	        
	        for (int i = 0; i < total; i++) {     
	            for (int j = i+1; j < total; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	 
	        
	        for(int i = 0 ; i < total ; i++) {
	        	System.out.print(arr[i] + " ");
	        }
	}

}

