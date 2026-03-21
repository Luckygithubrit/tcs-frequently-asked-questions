import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
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