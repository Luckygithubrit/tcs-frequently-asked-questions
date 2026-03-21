// TCS Coding Question: Electricity Bill Calculation
// 📌 Problem Statement

// A company wants to calculate the electricity bill of a customer based on the number of units consumed.

// The billing is done using the following slab system:

// First 2 units → ₹100 per unit
// Next 3 units (units 3 to 5) → ₹50 per unit
// Remaining units (above 5) → ₹20 per unit
// ❗ Conditions:
// If the number of units is less than or equal to 0, print "Invalid Input"
// 📥 Input

// A single integer N representing the number of units consumed.

// 📤 Output

// Print the total electricity bill.

// 🧪 Sample Input 1
// 6
// ✅ Sample Output 1
// 370
// 🧪 Sample Input 2
// 3
// ✅ Sample Output 2
// 250

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
    if(!sc.hasNextInt()){
		    System.out.println("invalid");
		    return;
		}
		
		int total=0;
		if(a<=0){
		    System.out.println("invalid");
		    return;
		}
		if(a<=2){
		    total=a*100;
		    
		}
		else if(a<=5){
		    total=(2*100)+(a-2)*50;
		    
		}
		else{
		    total=(2*100)+(3*50)+(a-5)*20;
		}
		System.out.println(total);
	}
	
}