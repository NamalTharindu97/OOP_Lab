import java.util.*;
public class ex3{
	public static void main(String args[]){
	
    Scanner SE = new Scanner(System.in);
    
	System.out.print("Enter Length width height :");
	int len = SE.nextInt();
	int wid = SE.nextInt();
	int hei = SE.nextInt();
	
	int volume = len * wid * hei ;
	
	System.out.println("length : " +len+ "\nwidth : "+wid+"\nHeight : "+hei+ "\nCube volume is " + volume);
	
	}
}