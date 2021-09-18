
public class Armstrong
{
	public static void main(String args[])
	{
	int r,s=0,m,l;
	System.out.println("Enter a Digit");
	int n=Integer.parseInt(args[0]);
	m=n;
	while (m>0)
	{
		r=m%10;
		l=r*r*r;
		s+=l;  			/*s=s+l*/
		m/=10;			/*m=m/10*/
	}
	if (s==n)
	System.out.println(n+" is an Armstrong Number.");
	else
	System.out.println(n+" is not an Armstrong Number.");
}
}