// TCS Coding Question: Subarray with Target Sum

// Problem Statement:

// Write a Java program that finds a contiguous subarray in a given array of integers whose sum equals a target value.

// Your program should:

// Read an integer n representing the size of the array.

// Read n integers — the elements of the array.

// Read an integer target — the sum you need to find.

// Find the first contiguous subarray whose sum equals the target.

// Print the starting and ending indices of the subarray (0-based indexing) and the elements of the subarray.

// If no such subarray exists, print "Not found".

// Input Format:
// 5
// 1 2 3 7 5
// 12

// First line → size of the array (n)

// Second line → elements of the array separated by space

// Third line → target sum

// Output Format:
// Found from index: 1 to 3
// 2 3 7

// Print the indices of the first matching subarray.

// Print the elements of the subarray in the next line.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int a=sc.nextInt();
		
		int arr[]=new int[a];
		System.out.println("enter the numbers");
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		    
		}
        System.out.println("enter the target");   
		int target=sc.nextInt();
// 		int current=0;
		for(int i=0;i<arr.length;i++){
		    int current=0;
		    for(int j=i;j<arr.length;j++){
		        current=current+arr[j];
		        if(current==target){
		            System.out.println("found from index:"+i+"to"+j);
		            for(int k=i;k<=j;k++){
		                System.out.print(arr[k]+" ");
		            }
		            return;
		    }
		    }
		    
		    
		}
		System.out.println("not found");
		
		}
		

	
	
}