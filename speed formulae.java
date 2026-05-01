// TCS Question
// A vehicle travels a certain distance. Given the distance in kilometers and the time taken in minutes, calculate the average speed in km/h.
// Input Format:

// First line: An integer dis — distance in kilometers
// Second line: An integer time — time in minutes (must be between 1 and 60)

// Output Format:

// Print the average speed in km/h (as an integer, truncated)
// Print error if time is less than 1 or greater than 60

// Constraints:

// 1 ≤ dis ≤ 10000
// 1 ≤ time ≤ 60


import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
		
		int dis=sc.nextInt();
		
		
		int time=sc.nextInt();
		if(time<1||time>60){
		    System.out.println("error");
		}
		double b=time/60.0;
		
		int speed=(int)(dis/b);
		System.out.println(speed);
		
	
	}
}
