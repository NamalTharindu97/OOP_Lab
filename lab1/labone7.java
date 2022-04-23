import java.util.*;
public class labone7{
	public static void main(String args[]){
	
		int sum;
		double avg;
		
		Scanner SE = new Scanner(System.in);
		System.out.print("Enter number one :");
		int no1 = SE.nextInt();
		
		System.out.print("Enter number two :");
		int no2 = SE.nextInt();
		
		sum = no1 + no2;
		
        avg = (no1+no2) / 2;

        System.out.println("sum :" + sum + " avarage :" + avg);		
		
		
	
	}
}