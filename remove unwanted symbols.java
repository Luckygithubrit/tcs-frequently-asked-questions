// 💻 TCS Coding Question: Remove Special Characters

// Problem Statement:

// You are given a string that may contain alphabets, digits, and special characters. Your task is to remove all the special characters from the string and print the cleaned string.

// Only letters (A–Z, a–z) and digits (0–9) should remain.

// 📥 Input Format:

// A single line string S

// 📤 Output Format:

// Print the modified string after removing all special characters

// 🔍 Constraints:

// 1 ≤ length of string ≤ 10⁵

// 🧪 Sample Input 1:
// Hello@123#World!
// ✅ Sample Output 1:
// Hello123World
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		String a=sc.nextLine();
		
		String b=a.replaceAll("[^A-Za-z0-9]","");
		System.out.println(b);
	}
}