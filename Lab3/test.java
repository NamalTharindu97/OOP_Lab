class student{
	String name;
	String ditno;
	String address;
	
	public student(){
		
	}
	public student(String name , String ditno , String address){
			this.name = name;
	        this.ditno = ditno;
	        this.address = address;
	}
}
public class test{
	public static void main(String args[]){
	  student student1 = new student();
	  student student2 = new student();
	  
	  student1.name = "namal";
	  student1.ditno = "It1231233";
	  student1.address = "hgsthethge";
	  
	  student2.name = "tharindu";
	  student2.ditno = "it2342243";
	  student2.address = "gearggger";
	  
	  System.out.println(student1.name+ student1.ditno + student1.address);
	  System.out.println(student2.name+ student2.ditno + student2.address);
	  
	  student student3 = new student("namal","it4234324","agregaergeg");
	  System.out.println();
	  
  
 }
}

