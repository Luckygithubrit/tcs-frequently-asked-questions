// armstrong number is a number that is equal to the sum of the cubes of its digits. For example, 153 is an armstrong number because 1^3 + 5^3 + 3^3 = 153.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int same=a;
        // int temp=a;
		int sum=0;
		while(a>0){
		    int temp=a%10;
		    sum=sum+(temp*temp*temp);
		    a=a/10;
		    
		}
		
		
		

		if(sum==same){
		    System.out.println("yes");
		}
		else{
		    System.out.println("n0");
		}
// 		System.out.println(rev);
	}
}