package week3.day1;

public class Students 
{

	public void getStudentInfo(int id)
	{
		System.out.println("Student ID: "+ id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student ID: "+ id +" Student Name: "+name);
	}
	public void getStudentInfo(String email, long phoneNumber)
	{
        System.out.println("Student email: "+email+ " Student Phone: "+phoneNumber);		
	}
	
	public static void main(String[] args) 
	{
	
       Students newStudents = new Students();
       newStudents.getStudentInfo(13);
       newStudents.getStudentInfo(15, "Praisy");
       newStudents.getStudentInfo("abc@gmail.com", 9876543210l);
		

	}

}
