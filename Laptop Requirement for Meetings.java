// TCS Coding Question: Laptop Requirement for Meetings
// 📌 Problem Statement

// A company is conducting multiple meetings. Each meeting requires one laptop.
// You are given the start time and end time of each meeting.

// 👉 Find the minimum number of laptops required so that no meeting has to wait.

// 📥 Input Format
// First line: Integer N (number of meetings)
// Next N lines: Two integers → start time and end time
// 📤 Output Format
// Print a single integer → minimum laptops required
// 🔍 Example

// Input

// 3
// 1 4
// 2 5
// 7 9

// Output

// 2

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
		
		int a=sc.nextInt();
		System.out.println("enter the numbers");
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
		    if(!sc.hasNextInt()){
	            System.out.println("error");
	            return;
	        }
		    arr[i]=sc.nextInt();
		}
		System.out.println("enter the target");
		if(!sc.hasNextInt()){
	            System.out.println("error");
	            return;
	        }
		int k=sc.nextInt();

		int count=0;
		for(int i=0;i<arr.length;i++){
		    if(k<=arr[i]){
		        count++;
		    }
		  //  else{
		  //      break;
		  //  }
		}
		System.out.println(count);
		
	   
	    
	    
	}
}