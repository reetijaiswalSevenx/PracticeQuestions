package io.sevenx;

public class FibonacciUsingRecursion {
	static int n1=0,n2=1,n3;
	static void printFibonacciSeries(int count) {
		
		if(count>0) {
		n3 = n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" " + n3);
		printFibonacciSeries(count-1);
	}
	}

  public static void main(String args[]) {
	  int count = 12;
	  System.out.print(n1 + "" + n2);
	  
	 printFibonacciSeries(count-2); //call
		 
	 }
  }


