package io.sevenx;
import java.util.*;

public class NthPrime {
  
	public static void main(String[] args)   
	{  
	
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the value of n to compute the nth prime number: ");  
	
	int nthPrimeNumber = sc.nextInt();   
	int number=1, count=0, i;  
	while (count < nthPrimeNumber)  
	{  
	number=number+1;  
	for (i = 2; i <= number; i++)  
	{   
	
	if (number % i == 0)   
	{  

	break;  
	}  
	}  
	if (i == number)  
	{  
	
	count = count+1;  
	}  
	}  
	
	System.out.println("The " +nthPrimeNumber +"th prime number is: " + number);  
	}  
	}  

