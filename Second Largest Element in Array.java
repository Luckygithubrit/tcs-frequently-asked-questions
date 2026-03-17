// Question: Second Largest Element in Array
// Problem

// Write a Java program to find the second largest element in an array.

// Input Format

// First line → integer N (size of array)

// Second line → N integers

// Output Format

// Print the second largest element

// Sample Input
// 5
// 4 7 2 9 5
// Sample Output
// 7


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
		int max=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>max){
		        second=max;
		        max=arr[i];
		    }
		    else if(arr[i]>second&&arr[i]!=max){
		        second=arr[i];
		       
		    }
		}
		if(second==Integer.MIN_VALUE){
		    System.out.println("no second largest");
		}
		else{
		    System.out.println("second largest number is:"+second);
		}
		
		
		
    		
		
	}
}