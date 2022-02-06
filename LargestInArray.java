package io.sevenx;

public class LargestInArray {
	public static int getLargest(int[] a, int total){  
		int save;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    save = a[i];  
		                    a[i] = a[j];  
		                    a[j] = save;  
		                }  
		            }  
		        }  
		       return a[total-1];  
		}  
		public static void main(String args[]){  
		int a[]={8,5,2,4,6,2};  
		int b[]={78,89,65,54,12,23,30,01};  
		System.out.println("Largest in Array a: "+getLargest(a,6));  
		System.out.println("Largestin Array b: "+getLargest(b,8));  
		} 
}
