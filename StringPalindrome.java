package io.sevenx;
import java.util.Scanner;
import java.util.*;
public class StringPalindrome {
	
	public static void main(String[] args) {
		
		String old, reverse="";
		Scanner str = new Scanner(System.in);
		System.out.println("Enter String");
		old = str.nextLine();
		int length = old.length();
		for(int i= length-1;i>=0;i--)
		{
			reverse = reverse + old.charAt(i);
		}
		if(old.equals(reverse))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}
