import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1st array");
		int a=sc.nextInt();
		
		int arr[]=new int[a];
		System.out.println("enter the numbers");
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the size of 2nd array");
		int b=sc.nextInt();
		
		int arr1[]=new int[b];
		System.out.println("enter the numbers");
		for(int i=0;i<arr1.length;i++){
		    arr1[i]=sc.nextInt();
		}
		
		HashSet<Integer> set=new HashSet<>();
		for(int num:arr){
		    set.add(num);
		}
		for(int num:arr1){
		    if(set.contains(num)){
		        System.out.println(num+"");
		    }
		}
        
	   
		
	
		
		
		
		


	}
}