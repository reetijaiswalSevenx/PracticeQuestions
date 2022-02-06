package io.sevenx;

public class SortinAscendingOrder {
	public static void main(String[] args) {
		int[] arr = new int[] {7,8,9,1,4};
		int save = 0;
		
		System.out.println("original array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		  for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   save = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = save;    
	               }     
	            }     
	        }    
	          
	        System.out.println(); 
	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	    }    
	}


