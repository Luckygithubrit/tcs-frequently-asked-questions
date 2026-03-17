// Question: Valid Palindrome (Ignore Spaces & Symbols)
// Problem

// Write a Java program to check whether a given string is a palindrome.

// 👉 Conditions:

// Ignore spaces

// Ignore special characters

// Ignore case sensitivity

// Input Format

// A single string S

// Output Format

// Print "yes" if palindrome

// Print "no" otherwise

// Sample Input 1
// a man a plan a canal panama
// Sample Output 1
// yes
// Sample Input 2
// race a car
// Sample Output 2
// no
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		String a=sc.nextLine();
		a=a.toLowerCase().replace(" ", "");
        String rev="";
        boolean palindrome=true;
        int left=0;
        int right=a.length()-1;
    
        if(left<right){
            if(a.charAt(left)!=a.charAt(right)){
                palindrome=false;
            }
        }
        if(palindrome){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
		
		
		
		
    		
		
	}
}