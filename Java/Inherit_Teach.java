import java.util.Scanner;
/**
 *
 * @author Subhradip
 */
class Person
{
    String name;
}
class Teacher extends Person
{
    int id;
    double basic,da,hra;
    String subject,name;

    void Tea_Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name :");
        super.name=sc.next();
        System.out.println("Enter ID :");
        id=sc.nextInt();
        System.out.println("Enter Basic :");
        basic=sc.nextDouble();
        System.out.println("Enter DA :");
        da=sc.nextDouble();
        System.out.println("Enter HRA :");
        hra=sc.nextDouble();
        System.out.println("Enter Subject :");
        subject=sc.next();
    }

    void Tea_display()
    {
        System.out.println("Name :"+super.name);
        System.out.println("ID :"+id);
        System.out.println("Basic :"+basic);
        System.out.println("DA :"+da);
        System.out.println("HRA :"+hra);
        System.out.println("Subject :"+subject);
    }
}
class Student extends Person
{
    int roll,year;
    String course,name;
    void Stu_Input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name :");
        super.name=sc.next();
        System.out.println("ROLL :");
        roll=sc.nextInt();
        System.out.println("Year :");
        year=sc.nextInt();
        System.out.println("Course :");
        course=sc.next();
    }
    void Stu_display()
    {
        System.out.println("Name :"+super.name);
        System.out.println("ROLL :"+roll);
        System.out.println("Year :"+year);
        System.out.println("Course :"+course);
    }
}

public class Inherit_Teach 
{
    
        public static void main(String[] args) 
        {
            Teacher T=new Teacher();
            T.Tea_Input();
            T.Tea_display();
            Student S=new Student();
            S.Stu_Input();
            S.Stu_display();
        }
    
}
