public class ReverseNum
{
	public static void main(String args[])
	{
	int i,m,s=0,r;
	int n=Integer.parseInt(args[0]);
	m=n;
	while (m>0)
	{
		r=m%10;
		s=10*s+r;
		m=m/10;
			
	}
		System.out.println("The reverse will be : " +s);
	}
}