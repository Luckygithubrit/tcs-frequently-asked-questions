import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the rows:");
	    int a=sc.nextInt();
	    int arr[]=new int[a];
	    System.out.println("enter the numbers:");
	    for(int i=0;i<arr.length;i++){
    	   arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    int count=0;
	    for(int i=0;i<arr.length;i++){
	        
	        if(arr[i]==0){
	            
	            
	            
    	            int temp=arr[i];
    	            arr[i]=arr[count];
    	            arr[count]=temp;
    	            
    	        
	                count++;
	       }
	    }
	  
	    System.out.println("after moving zeros  order:");
	    for(int num:arr){
	        System.out.print(num+" ");
	    }
	        
	    
	    
	}

}