// Question: Fibonacci Series
// Problem

// Write a Java program to print the first N terms of the Fibonacci series.

// Input Format

// A single integer N

// Output Format

// Print N Fibonacci numbers

// Sample Input
// 5
// Sample Output
// 0
// 1
// 1
// 2
// 3

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int a=sc.nextInt();
		int first=0;
		int second=1;
		for(int i=1;i<=a;i++){
		    System.out.println(first+"");
		    int temp=first+second;
		    first=second;
		    second=temp;
		    
		}
		
		
		
		
		
    		
		
	}
}