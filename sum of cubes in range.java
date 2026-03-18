// Sum of Cubes of Digits in a Range

// Problem Statement:

// Write a Java program to calculate the sum of cubes of all digits of all numbers in a given range [a, b] (inclusive).

// Your program should:

// Read two integers a and b representing the starting and ending numbers of the range.

// For each number in the range, calculate the cube of each digit.

// Sum all these cubes and print the final sum.

// Input Format:
// Two integers a and b separated by space

// Example Input:

// 10 12
// Output Format:
// Sum of cubes in range: <sum>

// Example Output:

// Sum of cubes in range: 10

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the of a");
		int a=sc.nextInt();
		System.out.println("enter the of b");
		int b=sc.nextInt();
		long sum=0;

		for(int i=a;i<=b;i++){
		    int num=i;
		    while(num>0){
    		    int temp=num%10;
    		    sum=sum+num*num*num;
    		    num=num/10;
		    }
		}
		System.out.println("sum of cubes in range:"+sum);
		
		}
		

	
	
}