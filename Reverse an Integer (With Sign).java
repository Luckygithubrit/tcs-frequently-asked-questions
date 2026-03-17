// 🧩 Question: Reverse an Integer (With Sign)
// Problem

// Write a Java program to reverse the digits of a given integer while preserving its sign.

// Input Format

// A single integer N

// Output Format

// Print the reversed integer

// Sample Input 1
// 1234
// Sample Output 1
// 4321
// Sample Input 2
// -567
// Sample Output 2
// -765
// Sample Input 3
// 1000
// Sample Output 3
// 1

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		
		int sign=a<0?-1:1;
		a=Math.abs(a);
		int rev=0;
		while(a>0){
		    int temp=a%10;
		    rev=rev*10+temp;
		    a=a/10;
		}
		rev=rev*sign;
		System.out.println(rev);
		
		
		
    		
		
	}
}