package io.sevenx;
import java.util.*;

public class AdditionArray {
	
	public static void main(String[] args) {
		
		int arr[][] = {{9,8,7},{4,5,6}};
		int brr[][]= {{2,3,4},{6,7,8}};
		
		int c[][]=new int[2][3];
		
		for(int i=0;i<2;i++)
		{
			for (int j=0;j<3;j++)
			{
				c[i][j] = arr[i][j] + brr[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
