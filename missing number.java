import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		int n=arr.length+1;
		int total=n*(n+1)/2;
		for(int num:arr){
		    total=total-num;
		}
		System.out.println("missing number is:"+total);
	
	
		
	}
}