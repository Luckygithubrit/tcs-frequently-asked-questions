// Air Balloon / Lift Capacity Problem
// 📌 Problem
// Given weights of people
// Capacity = X
// Select maximum number of people
// Condition: total weight ≤ X
// 🧠 Key Idea (Greedy)

// 👉 To fit maximum people, always pick:

// smallest weights first

// Because:

// Small people → more can fit
// Big people → reduce count
// 🧪 Example
// Input
// weights = [40, 50, 60, 30]
// X = 100
// 🔍 Step-by-step
// 1️⃣ Sort
// [30, 40, 50, 60]
// 2️⃣ Pick greedily
// Take 30 → sum = 30
// Take 40 → sum = 70
// Next 50 → sum = 120 ❌ (exceeds)

// 👉 Stop here

// ✅ Output
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
	   
	    
	    Arrays.sort(arr);
	    System.out.println("sorted array is"+Arrays.toString(arr));
	    
	   // System.out.println(arr)
	   System.out.println("enter the target");
	   
	    
	    if(!sc.hasNextInt()){
	        System.out.println("error");
	        return;
	    }
	    int target=sc.nextInt();
	    int sum=0;
	    int count=0;
	    for(int i=0;i<arr.length;i++){
	        sum=sum+arr[i];
	        if(sum<=target){
	            sum=sum+arr[i];
	            count++;
	        }else{
	            break;
	        }
	    }
	    System.out.println("the capacity:"+count);
	}
}