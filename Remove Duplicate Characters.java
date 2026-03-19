TCS Coding Question: Remove Duplicate Characters
📝 Problem Statement:

Given a string S, remove all duplicate characters while maintaining the original order of characters.

Return the modified string containing only the first occurrence of each character.

📥 Input Format:

A single string S

📤 Output Format:

Print the string after removing duplicate characters

🔍 Constraints:

1 ≤ length of string ≤ 10⁵

String may contain alphabets, digits, and special characters

🧪 Sample Input 1:
programming
✅ Sample Output 1:
progamin
🧪 Sample Input 2:
aabbcc123!!
✅ Sample Output 2:
abc123!


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String a=sc.nextLine();
		String result="";
		for(int i=0;i<a.length();i++){
		    char ch=a.charAt(i);
		    if(result.indexOf(ch)==-1){
		        result=result+ch;
		    }
		}
		System.out.println("string after removing duplicates:"+result);
		
	}
}