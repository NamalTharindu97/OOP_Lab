import java.io.*;
public class ex4{
	public static void main(String args[]){
		
	BufferedReader SE = new SE(new InputStreamReader(System.in));
		System.out.print("Enter Length width height :");
	    int len = SE.readInt();
	    int wid = SE.readInt();
	    int hei = SE.readInt();
		
		int volume = len * wid * hei ;
		
		System.out.println("Volume is " + volume);
		
	}
}