// Problem Statement

// You are given an array of integers of size N.
// Your task is to:

// Remove duplicate elements while maintaining the order of first occurrence
// Print the resulting array
// Print the reversed version of the array after removing duplicates
// 📥 Input Format
// First line: Integer N (size of array)
// Second line: N space-separated integers
// 📤 Output Format
// First line: Array after removing duplicates
// Second line: Reversed array
// 🔍 Example 1

// Input

// 6
// 1 2 2 3 4 3

// Output

// [1, 2, 3, 4]
// 4 3 2 1
// 🔍 Example 2

// Input

// 7
// 5 5 5 2 2 1 3

// Output

// [5, 2, 1, 3]
// 3 1 2 5

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of the of the array");
	    
		
		if(!sc.hasNextInt()){
		    System.out.println("error");
		    return;
		}
		
		int b=sc.nextInt();
		System.out.println("enter the numbers");
		int arr[]=new int[b];
		for(int i=0;i<b;i++){
		    if(!sc.hasNextInt()){
	            System.out.println("error");
	            return;
	        }
		    arr[i]=sc.nextInt();
		}
		Set<Integer> a=new HashSet<>();
		List<Integer> result=new ArrayList<>();
		
		for(int i=0;i<b;i++){
		    if(!a.contains(arr[i])){
		        a.add(arr[i]);
		        result.add(arr[i]);
		    }
		}
		System.out.println("after removing duplictes:");
		System.out.println(result);
		System.out.println("reverse array");
		for(int i=result.size()-1;i>=0;i--){
		    System.out.print(result.get(i)+" ");
		}
		
	   
	    
	    
	}
}