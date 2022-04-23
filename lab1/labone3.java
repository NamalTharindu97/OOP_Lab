import java.util.Scanner;
public class labone3{
	public static void main(String args[]){
    System.out.print("Enter your Age\t:");
	Scanner ob = new Scanner(System.in);
	int age = ob.nextInt();
	
	if(age<18){
		System.out.println("you are child");
	}
	else if(age>18){
		System.out.println("you are Adult");
	}
	
    		
	}
}