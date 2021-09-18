package Stats;

public class StatsOperations
{
	int a[];
 	public void average(int a,int b,int c )
 	{
 		float avg=(a+b+c)/3;
 		System.out.println("Average of Three Number is " +avg);
 	}
 	public void median(int a1,int b,int c)
 	{
 		a=new int[3];
 		a[0]=a1;
 		a[1]=b;
 		a[2]=c;
 		System.out.println("Sort number");
 		for(int i=0;i<3;i++)
		{
    			for(int j=0;j<3-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int  x=a[j];
					a[j]=a[j+1];
					a[j+1]=x;
				}
			}
			System.out.print("  " +a[i]+ "\n");
		}
		int med=(a.length+1)/2;
		System.out.println("Median of index is " +a[med-1]);
	}
}