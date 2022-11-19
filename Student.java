package org.student;
import org.department.Department;

public class Student extends Department
{

	public void studentName()
	{
		System.out.println("Student Name: Priya");
	}
	public void studentDept() 
	{
		System.out.println("Student Department: Maths");
	}
	private void studentId() 
	{
	   System.out.println("Student ID: 13");	
	}
	
	public static void main(String[] args) 
	{
		
        Student newStudent = new Student();
        newStudent.collegeName();
        newStudent.collegeCode();
        newStudent.collegeRank();
        newStudent.departmentName();
        newStudent.studentName();
        newStudent.studentDept();
        newStudent.studentId();
		
	}

}
