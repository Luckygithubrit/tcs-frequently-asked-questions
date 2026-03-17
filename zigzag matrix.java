// Question: Matrix Wave Traversal
// Problem

// Write a Java program to print a matrix in wave (zigzag) form row-wise.

// If the row index is even, print elements left to right

// If the row index is odd, print elements right to left

// Input Format

// First line → number of rows (R)

// Second line → number of columns (C)

// Next R × C elements → matrix values

// Output Format

// Print the matrix in wave pattern

// Sample Input
// 3
// 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// Sample Output
// 1 2 3 4
// 8 7 6 5
// 9 10 11 12

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st matrix");
		int a=sc.nextInt();
		System.out.println("enter the 2nd matrix");
		int b=sc.nextInt();
		int matrix[][]=new int[a][b];
		System.out.println("enter the values");
		for(int i=0;i<a;i++){
		    for(int j=0;j<b;j++){
		        matrix[i][j]=sc.nextInt();
		    }
		}
		System.out.println("the matrix is:");
		for(int i=0;i<a;i++){
		    if(i%2==0){
		        for(int j=0;j<b;j++){
		        System.out.print(matrix[i][j]+" ");
		    }
		    
		        
		    }
		    else{
		        for(int j=b-1;j>=0;j--){
		        System.out.print(matrix[i][j]+" ");
		    }
		        
		    }
		    
		    System.out.println();
		}
    		
		
	}
}