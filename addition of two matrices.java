import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1st array");
		int r=sc.nextInt();
		System.out.println("enter the 2nd array:");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int sum[][]=new int[r][c];
		
		System.out.println("enter the numbers");
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        a[i][j]=sc.nextInt();
		    }
		    
		    
		}
		System.out.println("enter the numbers");
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        b[i][j]=sc.nextInt();
		    }
		    
		    
		}
		
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        sum[i][j]=a[i][j]+b[i][j];
		    }
		    
		    
		}
		System.out.println("the sum matrix is:");
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(sum[i][j]+" ");
		    }
		    System.out.println();
		    
		    
		}
		
		
        
	   
		
	
		
		
		
		


	}
}