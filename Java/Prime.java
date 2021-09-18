public class Prime
{
public static void main(String args[])
 {
 int p,i,chk=0;
 p=11;
 for (i=2;i<p;i++)
 {
	if (p%i==0) 
	{
	chk=1;
	break;
	 }
 }
 if (chk==1) 
 {
 System.out.println("This Number is not a Prime No.");
 }
 else 
 System.out.println("This Number is a Prime No.");
}
}