// 🧩 Question: Count Positive, Negative and Zero Elements
// Problem

// Write a Java program to count the number of:

// Positive numbers

// Negative numbers

// Zeroes

// in a given array.

// Input Format

// First line → integer N (size of array)

// Second line → N integers

// Output Format

// Print three integers:

// positive_count negative_count zero_count
// Sample Input
// 6
// 1 -2 0 4 -5 0
// Sample Output
// 2 2 2
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("enter the numbers");
		for(int i=0;i<a;i++){
		    arr[i]=sc.nextInt();
		}
		
		int positive=0;
		int negative=0;
		int zero=0;
		for(int i=0;i<a;i++){
		    if(arr[i]>0){
		        positive++;
		    }
		    else if(arr[i]<0){
		        negative++;
		    }
		    else{
		        zero++;
		    }
		}
		System.out.println(positive+" "+negative+" "+zero);
		
		
		
		
    		
		
	}
}