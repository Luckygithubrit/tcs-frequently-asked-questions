import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size");
	    int a=sc.nextInt();
	    int arr[]=new int[a];
	    System.out.println("enter the numbers");
	    for(int i=0;i<a;i++){
	        arr[i]=sc.nextInt();
	    }
	    int left=0;
	    int right=a-1;
	    while(left<right){
	        int temp=arr[left];
	        arr[left]=arr[right];
	        arr[right]=temp;
	        left++;
	        right--;
	    }
	    System.out.println("reverse matrix is:");
	for(int num:arr){
	    System.out.print(num+" ");
	}
	    
	   // System.out.println();
		
	
	
}
	
}