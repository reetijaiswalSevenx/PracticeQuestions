package io.sevenx;

public class LowerTraingleMatrix {
	public static void main(String[] args) {    
	    int rows, columns;    
	    //Initialize matrix a    
	        int a[][] = {{1, 2, 7},{8, 3, 4},{9, 5, 6}};
	        rows = a.length;    
	          columns = a[0].length;  
	          if(rows != columns){
	        	  System.out.println("Square matrix");
	          }
	          else {
	        	  System.out.println("lower trianglular");
	        	  for(int i = 0; i < rows; i++){    
	                  for(int j = 0; j < columns; j++){    
	                    if(j > i)    
	                      System.out.print("0 ");    
	                    else    
	                      System.out.print(a[i][j] + " ");    
	                }    
	                System.out.println();    
	            }    
	          }
}
}
