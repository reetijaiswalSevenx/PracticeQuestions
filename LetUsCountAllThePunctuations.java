package io.sevwnx;

public class LetUsCountAllThePunctuations {
	public static void main(String[] args) {
		
	int count = 0;    
	String str = " 'The mailman loves you.' I heard it with my own ears. He is such a liar!";   
	for (int i = 0; i < str.length(); i++)   
	{    
	if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
	str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   
	{    
	count++;    
	}    
	}    
	System.out.println("The number of punctuations exists in the string is: " +count);       
}
}
