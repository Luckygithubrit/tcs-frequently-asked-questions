import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
// 		int count=0;
		
		for(int i=a;i<=b;i++){
		    int sum=(i/10)+(i%10);
		    if(sum>1){
		        boolean prime=true;
		        for(int j=2;j<sum;j++){
		            if(sum%j==0){
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
}