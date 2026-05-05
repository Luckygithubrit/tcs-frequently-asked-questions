import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int a=sc.nextInt();
		
		String arr[]=new String[a];
		System.out.println("enter the words");
		for(int i=0;i<=a;i++){
		    arr[i]=sc.nextLine();
		}
		String prefix=arr[0];
		for(int i=1;i<arr.length;i++){
		    while(arr[i].indexOf(prefix)!=0){
		        prefix=prefix.substring(0,prefix.length()-1);
		    }
		}
		System.out.println(prefix);
	}
}