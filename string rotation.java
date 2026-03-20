// Question:

// Given two strings S1 and S2, check whether S2 is a rotation of S1.

// 📥 Input:

// First line: String S1

// Second line: String S2

// 📤 Output:

// Print "Yes" if S2 is rotation of S1

// Otherwise print "No"

// 🔍 Example 1:

// Input:

// waterbottle
// erbottlewat

// Output:

// Yes
// 🔍 Example 2:

// Input:

// hello
// llohe

// Output:

// Yes
// 🔍 Example 3:

// Input:

// abc
// acb

// Output:

// No



import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter 1st string");
	    String a=sc.nextLine();
	    System.out.println("enter 2nd String");
	    String b=sc.nextLine();
	    
	    if(a.length()!=b.length()){
	        System.out.println("not rotation");
	        return;
	    }
	    String temp=a+a;
	    if(temp.contains(b)){
	        System.out.println("rotation");
	    }
	    else{
	        System.out.println("not rotational");
	    }
	   // System.out.println();
		
	}
	
}