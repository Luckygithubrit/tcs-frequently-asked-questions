// strong number is a number whose sum of the factorial of digits is equal to the original number. For example, 145 is a strong number because 1! + 4! + 5! = 145.

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
// 		int same=a;
        int temp=a;
		int sum=0;
		while(temp>0){
		    int d=temp%10;
		    int fact=1;
		
	
    		for(int i=1;i<=d;i++){
    		    fact=fact*i;
    		}
    		sum=sum+fact;
    		temp=temp/10;
		}
		
		
		

		if(sum==a){
		    System.out.println("yes");
		}
		else{
		    System.out.println("n0");
		}
// 		System.out.println(rev);
	}
}