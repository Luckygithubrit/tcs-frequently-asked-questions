// Question: Sum of Cubes of Digits
// Problem

// Write a Java program to find the sum of cubes of digits of a given number.

// Input Format

// A single integer N

// Output Format

// Print the sum of cubes of its digits

// Sample Input
// 123
// Sample Output
// 36
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		long sum=0;
		while(a>0){
		    int temp=a%10;
		    sum=sum+(long)temp*temp*temp;
		    a=a/10;
		}
		System.out.println("result is:"+sum);
    		
		
	}
}