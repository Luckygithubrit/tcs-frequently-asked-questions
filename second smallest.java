// 🧩 Question: Second Smallest Element in Array
// Problem

// Write a Java program to find the second smallest element in an array.

// Input Format

// First line → integer N (size of array)

// Second line → N integers

// Output Format

// Print the second smallest element

// If it does not exist → print

// No second smallest element
// Sample Input
// 5
// 4 7 2 9 5
// Sample Output
// 4


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("enter the numbers");
		for(int i=0;i<a;i++){
		    arr[i]=sc.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]<min){
		        second=min;
		        min=arr[i];
		    }
		    else if(arr[i]<second&&arr[i]!=min){
		        second=arr[i];
		       
		    }
		}
		if(second==Integer.MAX_VALUE){
		    System.out.println("no second largest");
		}
		else{
		    System.out.println("second largest number is:"+second);
		}
		
		
		
    		
		
	}
}