// Question 4: Palindrome String (Ignore Spaces)
// Problem

// Write a Java program to check whether a given string is a palindrome, ignoring spaces and case sensitivity.

// Input Format

// A single string S

// Output Format

// Print "yes" if the string is a palindrome

// Print "no" otherwise

// Sample Input 1
// nurses run
// Sample Output 1
// yes
// Sample Input 2
// hello world
// Sample Output 2
// no
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String a=sc.nextLine();
		a=a.toLowerCase().replace(" ", "");
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            char ch=a.charAt(i);
            rev=rev+ch;
            
        }
        if(a.equals(rev)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
		
		
		
		
    		
		
	}
}