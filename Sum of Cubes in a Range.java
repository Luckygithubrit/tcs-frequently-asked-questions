// Question: Sum of Cubes in a Range
// Problem

// Write a Java program to find the sum of cubes of all numbers between two integers (inclusive).

// Input Format

// First line → integer A (starting number)

// Second line → integer B (ending number)

// Output Format

// Print the sum of cubes from A to B

// Sample Input
// 2
// 4
// Sample Output
// 99


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println("enter the 2nd number");
		int b=sc.nextInt();
		long sum=0;
		for(int i=a;i<=b;i++){
		    sum=sum+(long)i*i*i;
		}
		System.out.println("result is:"+sum);
    		
		
	}
}