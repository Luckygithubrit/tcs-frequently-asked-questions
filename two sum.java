// TCS Coding Question: Two Sum (Index Based)
// 📝 Problem Statement

// You are given an array of integers of size N and a target value T.
// Your task is to find any two distinct indices such that the sum of the elements at those indices equals the target.

// If such a pair exists, print their indices. Otherwise, print "not found".

// 📥 Input Format

// First line: Integer N (size of array)

// Second line: Integer T (target value)

// Third line: N space-separated integers (array elements)

// 📤 Output Format

// Print:

// the indexes are: i j

// (where i and j are the indices)

// If no pair exists, print:

// not found
// 🔒 Constraints

// 1 ≤ N ≤ 10⁵

// -10⁹ ≤ arr[i] ≤ 10⁹

// -10⁹ ≤ T ≤ 10⁹

// 📌 Example 1

// Input:

// 5
// 9
// 2 7 11 15 3

// Output:

// the indexes are: 0 1
// 📌 Example 2

// Input:

// 4
// 10
// 1 2 3 4

// Output:

// not found
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size:");
	    int a=sc.nextInt();
	    System.out.println("enter the target:");
	    int target=sc.nextInt();
	    boolean found=true;
	    int arr[]=new int[a];
	    System.out.println("enter the numbers:");
	    for(int i=0;i<arr.length;i++){
	        arr[i]=sc.nextInt();
	        
	    }
	    for(int i=0;i<arr.length;i++){
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[i]+arr[j]==target){
	                System.out.println("the indexes are: "+i+" "+j);
	                found=true;
	            }
	        }
	    }
	    if(!found){
	        System.out.println("not found");
	    }

	}
}