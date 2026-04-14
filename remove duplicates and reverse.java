// Problem Statement

// You are given an array of integers of size N. Your task is to:

// Remove duplicate elements from the array
// Reverse the resulting collection of unique elements
// Print the final reversed list
// 📥 Input Format
// First line contains an integer N (size of array)
// Second line contains N space-separated integers
// 📤 Output Format
// Print the unique elements (after removing duplicates)
// Print the reversed list of unique elements
// 🔹 Constraints
// 1 ≤ N ≤ 10⁵
// -10⁴ ≤ array[i] ≤ 10⁴
// 🔸 Sample Input
// 6
// 1 2 3 2 4 1
// 🔸 Sample Output
// Unique elements: [1, 2, 3, 4]
// Reversed unique elements: [4, 3, 2, 1]

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
	    HashSet<Integer>lucky=new HashSet<>();
	    for(int num:arr){
	        lucky.add(num);
	    }
		System.out.println("result: "+lucky);
		System.out.println("after reverse");
		ArrayList<Integer>list=new ArrayList<>(lucky);
		Collections.reverse(list);
		System.out.println("result:"+list);
// 		System.out.println("Hello World");
	}
}