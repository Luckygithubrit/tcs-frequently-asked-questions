// Question: Spiral Order Traversal of Matrix
// Problem

// Given a matrix of size N × M, print all elements of the matrix in spiral order.

// Input Format

// First line → two integers N and M

// Next N lines → each line contains M integers

// Output Format

// Print all elements in spiral order (space separated)

// Sample Input
// 4 4
// 1  2  3  4
// 5  6  7  8
// 9 10 11 12
// 13 14 15 16
// Sample Output
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int a=sc.nextInt();
		System.out.println("enter the columns");
		int b=sc.nextInt();
		int spiral[][]=new int[a][b];
		System.out.println("enter the numbers");
		for(int i=0;i<a;i++){
		    for(int j=0;j<b;j++){
		        spiral[i][j]=sc.nextInt();
		    }
		}
		int top=0;
		int bottom=a-1;
		int left=0;
		int right=b-1;
		System.out.println("spiral matrix is:");
		while(top<=bottom&&left<=right){
		    for(int i=left;i<=right;i++){
		        System.out.print(spiral[top][i]+" ");
		    }
		    top++;
		    for(int i=top;i<=bottom;i++){
		        System.out.print(spiral[i][right]+" ");
		    }
		    right--;
		    if(top<=bottom){
		        for(int i=right;i>=left;i--){
    		        System.out.print(spiral[bottom][i]+" ");
    		    }
    		    bottom--;
		    }
		    if(left<=right){
		        for(int i=bottom;i>=top;i--){
    		        System.out.print(spiral[i][left]+" ");
    		    }
    		    left++;
		    }
		  //  System.out.println();
		    
		}
		
		
		
		
		
		
    		
		
	}
}