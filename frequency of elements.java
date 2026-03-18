// TCS Coding Question: Frequency of Elements
// 📝 Problem Statement

// Given an integer array of size N, count the frequency of each element and print the result.

// 📌 Additional Requirement (Important for TCS)

// Print the elements in the order of their first appearance.

// 📥 Input Format

// First line: Integer N (size of array)

// Second line: N space-separated integers

// 📤 Output Format

// Print each element and its frequency

// Maintain insertion order

// 📌 Example
// Input
// 6
// 1 2 2 3 1 2
// Output
// 1 -> 2
// 2 -> 3
// 3 -> 1
// ⚠️ Twist (TCS Important)

// If you use normal HashMap, order may change ❌
// 👉 Use LinkedHashMap to preserve order ✅

// ✅ Final TCS Code
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

//         for(int num : arr){
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         for(int key : map.keySet()){
//             System.out.println(key + " -> " + map.get(key));
//         }
//     }
// }
// 🔥 Bonus TCS Variations (VERY IMPORTANT)
// 1️⃣ Find most frequent element
// Input: 1 2 2 3 1 2  
// Output: 2
// 2️⃣ Print only duplicates
// Output:
// 1 -> 2
// 2 -> 3
// 3️⃣ First non-repeating element
// Output: 3
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time");
		int a=sc.nextInt();
		sc.nextLine();
	    int arr[]=new int[a];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int num:arr){
		    if(map.containsKey(num)){
		        map.put(num,map.get(num)+1);
		    }
		    else{
		        map.put(num,1);
		    }
		        
		}
		System.out.println("enter the frequencies");
		for(int key:map.keySet()){
		    System.out.println(key+"->"+map.get(key));
		}
		
		
	
	
		
	}
}