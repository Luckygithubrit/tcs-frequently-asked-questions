// TCS Coding Question: LCM Using GCD
// 📝 Problem Statement:

// Given two integers A and B, compute their Least Common Multiple (LCM) using the concept of Greatest Common Divisor (GCD).

// 🔍 Key Relation

// L
// C
// M
// (
// 𝐴
// ,
// 𝐵
// )
// =
// 𝐴
// ×
// 𝐵
// gcd
// ⁡
// (
// 𝐴
// ,
// 𝐵
// )
// LCM(A,B)=
// gcd(A,B)
// A×B
// 	​


// 📥 Input Format:

// Two space-separated integers A and B

// 📤 Output Format:

// Print the LCM of the given numbers

// 🔍 Constraints:

// 1 ≤ A, B ≤ 10⁵

// 🧪 Sample Input 1:
// 4 6
// ✅ Sample Output 1:
// 12
// 🧪 Sample Input 2:
// 10 15
// ✅ Sample Output 2:
// 30

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=a;
		int y=b;
		while(b!=0){
		    int temp=b;
		    b=a%b;
		    a=temp;
		}
        int gcd=a;
        int lcm=(x*y)/gcd;
		System.out.println(lcm);
		
		
	}
}