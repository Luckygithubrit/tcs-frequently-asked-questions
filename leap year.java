import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		int a=sc.nextInt();
		
		if(a%400==0||(a%4==0&&a%100!=0)){
		    System.out.println("it is leap");
		}
		else{
		    System.out.println("not");
		}

// 		System.out.println(c);
		
		
	}
}