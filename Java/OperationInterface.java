import java.util.Scanner;

interface IntOperations
{
		void positive(int a);
		void negative(int a);
		void even(int a);
		void odd(int a);
		void prime(int a);
		void factorial(int a);
		void sum(int a);

}

class MyNumber implements IntOperations
{
	private int n;
	
	MyNumber()
	{
		n=0;
	}
	
	MyNumber(int n)
	{
		this.n = n;
	}
	
	public void positive(int n)
	{
		if(n>0)
			System.out.println("\nNumber is Positive");
	}	
	
	public void negative(int n)
	{
		if(n<0)
			System.out.println("\nNumber is Negative");

	}
	
	public void even(int n)
	{
		if(n%2==0)
		    System.out.println("\nNumber is even");
	}	
	
	public void odd(int n)
	{
		if(n%2 !=0)
		    System.out.println("\nNumber is odd");

	}
	
        public void prime(int n)
        {
                int i,j=0;

                for(i=2;i<n;i++)
                {
                        if(n%i==0)
                                j=1;
                }
                if(j == 0 || n == 1)
                        System.out.println("\n"+ n + " is Prime");
                else
                        System.out.println("\n"+ n + " is not Prime");
        }	
	
	
        public void factorial(int n)
        {
                int fact=1,i,no=n;
                if(no < 0)
                {
                        no=no-no-no;
                        System.out.println("n == "+ no);

                }
                for(i=1;i<n+1;i++)
                {
                        fact=fact*i;
                }

                System.out.println("\nFactorial is "+fact);
        }	
		
        public void sum(int n)
        {
                int sum=0,no=n;
   
                while(no != 0)
                {
                        sum=sum+(no%10);
                        no=no/10;
                }

                System.out.println("\nSum of digits "+sum);

        }
	
	
	
} 

public class OperationInterface
{
	public static void main(String arg[])
	{
		IntOperations io; int no,decsn;
		MyNumber num = new MyNumber();
		Scanner sc=new Scanner(System.in);
		int ans=1;
		io= num;
		no= Integer.parseInt(arg[0]);

		while(ans==1)

		{
			
			System.out.println("Choose Operations below");

			System.out.println("Choose : 1 For (Positive/Negative)");
			System.out.println("Choose : 2 For (Even/Odd)");
			System.out.println("Choose : 3 For (Prime)");
			System.out.println("Choose : 4 For (Factorial)");
			System.out.println("Choose : 5 For (Sum Of Digits)");
			decsn=sc.nextInt();


			switch(decsn)
			{
				case 1:
					io.positive(no);
					io.negative(no);
					break;
				case 2:
					io.even(no);
					io.odd(no);
					break;
				case 3:
					io.prime(no);;
					break;
				case 4:
					io.factorial(no);
					break;
				case 5:
					io.sum(no);
					break;
				default:
					System.out.println("Wrong choice.. input the right one");
					break;
				
			}

			
			System.out.println("Proceed yes or no ...1 for yes 0 for no");
			ans=sc.nextInt();


		}
	}
}




















