// Question: Maximum Subarray Sum
// Problem

// Given an array of integers, write a Java program to find the maximum sum of a contiguous subarray.

// Input Format

// First line → integer N (size of array)

// Second line → N integers

// Output Format

// Print the maximum subarray sum

// Sample Input
// 9
// -2 1 -3 4 -1 2 1 -5 4
// Sample Output
// 6
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
		int current=0;
		for(int i=0;i<a;i++){
		    current=current+arr[i];
		    if(current>max){
		        max=current;
		    }
		    if(current<0){
		        current=0;
		    }
		}
		System.out.println("max subarray sum is:"+current);
		
		
    		
		
	}
}