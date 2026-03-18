import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count=0;
		
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
		        System.out.println(i);
		    }
		}
		
		
		
	
	
		
	}
}