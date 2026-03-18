// Majority Element (TCS / Interview Important)
// 📝 Problem:

// Find the majority element in an array.

// 👉 Majority element = element that appears more than n/2 times

// 🔍 Example:

// Input:

// [2, 2, 1, 2, 3, 2, 2]

// Output:

// 2


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
		    int count=0;
		    for(int j=0;j<arr.length;j++){
		        if(arr[i]==arr[j]){
		            count++;
		        }
		    }
		    
		    if(count>a/2){
		        System.out.println("majority element is:"+arr[i]);
		        return;
		    }
		}
		
		System.out.println("no majority");
	
	
		
	}
}