class student{
	private int mark1;
	private int mark2;
	private int mark3;
	private double avg;
	private String name;
	private String ID;
	
	public student(){
		mark1=0;
		mark2=0;
		mark3=0;
		name = "NO name";
		ID = "NO ID";
	}
	public student(int pmark1,int pmark2 , int pmark3 , String pname , String pID){
		mark1 = pmark1;
		mark1= pmark2;
		mark3 = pmark3;
		name = pname;
		ID = pID;
	}
	public double calcavg(){
		avg = (mark1+mark2+mark3)/3;
		return avg;
	}
	public void printdetail(){
		System.out.print("Avarage :"+avg+"\nName :"+name+"\nID :"+ID);
	}
	
}


public class tute2{
	public static void main(String args[]){
     student student1 = new student();
	 
	 student1.student(50,50,50,"namal","it2020");
	 student1.printdetail();
		
	}
}