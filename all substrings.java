import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    for(int i=0;i<=a.length();i++){
	        for(int j=i+1;j<=a.length();j++){
	            System.out.println(a.substring(i,j));
	        }
	    }
		System.out.println();
	}
}