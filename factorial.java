question: Write a program to find the factorial of a number.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
// 		int same=a;
		int sum=1;
		for(int i=1;i<=a;i++){
		    sum=sum*i;
		}
		System.out.println(sum);
		
		

// 		if(sum==a){
// 		    System.out.println("yes");
// 		}
// 		else{
// 		    System.out.println("n0");
// 		}
// 		System.out.println(rev);
	}
}