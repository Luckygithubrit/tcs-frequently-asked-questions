// Question: Character Triangle Pattern
// Problem

// Write a Java program to print a right-angled triangle pattern using a given character.

// Input Format

// An integer N → number of rows

// A character C → symbol to print

// Output Format

// Print a triangle where:

// Row 1 → 1 character

// Row 2 → 2 characters

// …

// Row N → N characters

// Sample Input
// 5
// *
// Sample Output
// *
// **
// ***
// ****
// *****


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println("enter the symbol");
		
		char b=sc.next().charAt(0);
		for(int i=1;i<=a;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(b+"");
		    }
		    System.out.println();
		}
		
    		
		
	}
}