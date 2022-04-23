class EvenOddNumber{
	
	public boolean findEvenOrOdd(int i){
		int no = i%2;
		if(no==0){
			return true;
		}
		else{
			return false;
		}
	}
	
}

public class ex5{
	public static void main(String args[]){
		
		EvenOddNumber SE = new EvenOddNumber();
		boolean result = SE.findEvenOrOdd(6);
		if(result==true){
			System.out.print("Even Number");
		}
		else{
			System.out.print("Odd Number");
		}
		
		
	}
}