// Problem Statement

// Given an array of integers, write a program to move all zeros to the end of the array while maintaining the relative order of non-zero elements.

// 📥 Input Format

// First line: Integer N (size of array)

// Second line: N space-separated integers

// 📤 Output Format

// Print the modified array after moving all zeros to the end

// 🧪 Example 1

// Input:

// 5
// 1 0 3 0 5

// Output:

// 1 3 5 0 0
// 🧪 Example 2

// Input:

// 6
// 0 0 1 2 3 0

// Output:

// 1 2 3 0 0 0
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the rows:");
	    int a=sc.nextInt();
	    int arr[]=new int[a];
	    System.out.println("enter the numbers:");
	    for(int i=0;i<arr.length;i++){
    	   arr[i]=sc.nextInt();
	    }
	    int count=0;
	    for(int i=0;i<arr.length;i++){
	        
	        if(arr[i]!=0){
	            if(i!=count){
	            
	            
    	            int temp=arr[i];
    	            arr[i]=arr[count];
    	            arr[count]=temp;
    	            
    	        }
	            count++;
	       }
	    }
	    System.out.println("after moving zeros:");
	    for(int num:arr){
	        System.out.print(num+" ");
	    }
	        
	    
	    
	}

}