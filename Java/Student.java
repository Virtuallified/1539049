class StudentInfo
{
	int rollNo; 
	String name;
	String course;
	int marks;

	void getStudentDetails(int r,String n,String c) 
	{
		rollNo=r; 
		name=n;
		course=c;
		System.out.println("Roll No. "+rollNo+"Name: "+name+" Course : "+course);
	}
	void getAverage(int p,int o,int d)
	{
		int avg=(p+o+d)/3;
		System.out.println("Got in PPL : "+p);
		System.out.println("Got in OS: "+o);
		System.out.println("Got in DS : "+d);
		System.out.println("The Average marks : "+avg);
	}
	/*void getAggregateAvg( )
	{
		
	}*/
}
public class Student
{
	public static void main(String args[])
	{

		StudentInfo S1=new StudentInfo();
		StudentInfo S2=new StudentInfo();
		StudentInfo S3=new StudentInfo();
		StudentInfo S4=new StudentInfo();
		StudentInfo S5=new StudentInfo();
		
		S1.getAverage(50,50,80);
		S2.getAverage(59,75,90);
		S3.getAverage(71,62,58);
		S4.getAverage(51,62,73);
		S5.getAverage(91,52,83);
		S1.getStudentDetails(001,Ram,MCA);
		S2.getStudentDetails(002,Mick,MCA);
		S3.getStudentDetails(003,Rick,MCA);
		S4.getStudentDetails(004,Josh,MCA);
		S5.getStudentDetails(005,Subh,MCA);
	}
}