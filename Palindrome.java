package io.sevenx;

public class Palindrome {
	public static void main(String[] args) {
		
	int num = 323,remainder,reverse;
	int sum=0;
	reverse=num;
	while(num>0)
	{
		remainder=num%10;
		sum = sum*10 + remainder;
		num = num/10;
	}
	if(sum==reverse) {
	System.out.println("Palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
}
}
