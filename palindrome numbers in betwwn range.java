import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
// 		int sum=0;
		for(int i=a;i<=b;i++){
		    int num=i;
		    int rev=0;
		    while(num>0){
		        
		    
    		    int temp=num%10;
    		    rev=rev*10+temp;
    		    num=num/10;
		    }
		    if(i==rev){
		        System.out.println(i);
		    }
		}
		
		
		
	
	
		
	}
}