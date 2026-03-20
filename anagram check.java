import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the 1st string");
	    String a=sc.nextLine();
	    System.out.println("enter the 2nd string");
	    String b=sc.nextLine();
	    if(a.length()!=b.length()){
	        System.out.println("not anagram");
	        return;
	    }
	    char ch1[]=a.toCharArray();
	    char ch2[]=b.toCharArray();
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    if(Arrays.equals(ch1,ch2)){
	        System.out.println("yes");
	    }
	    else{
	        System.out.println("no");
	    }
	   // System.out.println();
		
	
	
}
	
}