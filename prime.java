// TCS-Style Question (Based on Your Code)
// 📝 Problem Statement:

// Write a program to print all numbers between two given integers A and B (inclusive) such that:

// The number itself is a prime number

// The sum of its digits is also a prime number

// 📥 Input:

// Two integers A and B

// 📤 Output:

// Print all such numbers satisfying both conditions

// 🔍 Example:

// Input:

// 10 50

// Output:

// 11 23 29 41 43 47
import java.util.*;
public class prime
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
// 		int count=0;
		
		
		for(int i=a;i<=b;i++){
		    if(i<=1){
		        continue;
		    }
		    boolean prime=true;
		    for(int j=2;j<=Math.sqrt(i);j++){
		        if(i%j==0){
		            prime=false;
		            break;
		        }
		    }
		    if(prime){
		        int num=i;
		        int sum=0;
		        while(num>0){
		            sum=sum+num%10;
		            num=num/10;
		        }
		        boolean sumprime=true;
		    if(sum<=1){
		        sumprime=false;
		      //  break;
		    }
		    else{
		        for(int k=2;k<=Math.sqrt(sum);k++){
		            if(sum%k==0){
		                sumprime=false;
		                break;
		            }
		        }
		    }
		    if(sumprime){
		        System.out.println(i);
		    }
		    }
		    
		}
		
		
	
	
		
	}
}