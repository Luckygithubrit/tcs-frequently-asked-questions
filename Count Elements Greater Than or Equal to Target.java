// Problem Statement

// You are given an array of integers of size N and a target value T.
// Your task is to count how many elements in the array are greater than or equal to T.

// 📥 Input Format
// First line contains an integer N (size of array)
// Second line contains N space-separated integers
// Third line contains an integer T (target value)
// 📤 Output Format
// Print a single integer representing the count of elements ≥ T
// 🔹 Constraints
// 1 ≤ N ≤ 10⁵
// -10⁴ ≤ array[i] ≤ 10⁴
// -10⁴ ≤ T ≤ 10⁴
// 🔸 Sample Input
// 5
// 2 7 4 9 1
// 5
// 🔸 Sample Output
// 2
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size:");
	    int a=sc.nextInt();
	    System.out.println("enter the number:");
	    int arr[]=new int[a];
	    for(int i=0;i<a;i++){
	        arr[i]=sc.nextInt();
	    }
	    int count=0;
	    System.out.println("enter the target:");
	    int target=sc.nextInt();
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]>=target){
	            count++;
	        }
	        
	    }
		System.out.println("the count is:"+count);
	}
}