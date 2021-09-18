class Arithmetic
{
	int intresult;
	double dblresult;
	float floatresult;

	int sum(int x,int y)
	{
		intresult=x+y;
		return intresult;
	}
  	double sum(double x,double y)
	{
		dblresult=x+y;
		return dblresult;
	}
  	float sum(float x,float y)
	{
		floatresult=x+y;
		return floatresult;
	}
  	int div(int x,int y)
	{
		intresult=x/y;
		return intresult;
	}
  	double div(double x,double y)
	{
		dblresult=x/y;
		return dblresult;
	}
 	float div(float x,float y)
	{
		floatresult=x/y;
		return floatresult;
	}
  	int subtract(int x,int y)
	{
		intresult=x-y;
		return intresult;
	}
 	double subtract(double x,double y)
	{
		dblresult=x-y;
		return dblresult;
	}
  	float subtract(float x,float y)
	{
		floatresult=x-y;
		return floatresult;
	}
  	int multiply(int x,int y)
	{
		intresult=x*y;
		return intresult;
	}
  	double multiply(double x,double y)
	{
		dblresult=x*y;
		return dblresult;
	}
  	float multiply(float x,float y)
	{
		floatresult=x*y;
		return floatresult;
	}
  	void showInt()
	{
		System.out.println("The int Value : "+intresult);
	}
  	void showDouble()
	{
		System.out.println("The double Value : "+dblresult);	
	}
  	void showFloat()
	{
		System.out.println("The float Value : "+floatresult);
	}
}

public class TestArithmetic
{
	public static void main(String args[])
	{
		int a,b,c,d;
		float q,e,f,g;
		double m,n,o,p;
		Arithmetic nArith=new Arithmetic();

		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		Double i=Double.parseDouble(args[0]);
		Double j=Double.parseDouble(args[1]);
		Float k=Float.parseFloat(args[0]);
		Float l=Float.parseFloat(args[1]);
		
		a=nArith.sum(x,y);
		System.out.println("The Sum : "+a);
		b=nArith.div(x,y);
		System.out.println("The Division : "+b);
		c=nArith.subtract(x,y);
		System.out.println("The Subtraction : "+c);
		d=nArith.multiply(x,y);
		System.out.println("The Multiplication : "+d);
  		m=nArith.sum(i,j);
		System.out.println("The Sum : "+m);
  		n=nArith.multiply(i,j);
		System.out.println("The Multiplication : "+n);
		o=nArith.subtract(i,j);
		System.out.println("The Subtraction : "+o);
		p=nArith.div(i,j);
		System.out.println("The Division : "+p);
  		q=nArith.subtract(k,l);
		System.out.println("The Subtraction : "+q);
		e=nArith.sum(k,l);
		System.out.println("The Sum : "+e);
  		f=nArith.div(k,l);
		System.out.println("The Division : "+f);
  		g=nArith.multiply(k,l);
		System.out.println("The Multiplication : "+g);

		nArith.showInt();
		nArith.showDouble();
		nArith.showFloat();

	}
}