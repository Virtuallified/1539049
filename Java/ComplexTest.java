class Complex
{
	int real;
	int img;
	Complex()
	{
		real=0;
		img=0;
	}
	Complex(int r, int i)
	{
		real=r;
		img=i;
	}
	Complex (Complex com)
	{
		real=com.real;
		img=com.img;	
	}
	void showComplex()
	{
		System.out.println(real+"+"+img+"i");
	}
	Complex addComplex(Complex C2)
	{
		Complex C=new Complex();
		C.real=real+C2.real;
		C.img=img+C2.img;
		C.showComplex();
		return C;
	}
	Complex substractComplex(Complex C2)
	{
		Complex C=new Complex();
		C.real=real-C2.real;
		C.img=img-C2.img;
		C.showComplex();
		return C;
	}
	Complex multiplyComplex(Complex C2)
	{
		Complex C=new Complex();
		C.real=real*C2.real+img*C2.img;
		C.img=img*C2.real+real*C2.img;
		C.showComplex();
		return C;
	}
}
public class ComplexTest
{
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);

		Complex C1=new Complex();
		Complex C2=new Complex(x,y);
		Complex CC=new Complex(C2);
		Complex CX;

		C1.showComplex();
		C2.showComplex();
		CC.showComplex();
		
		System.out.println("Complex Addition :");
		CX=C1.addComplex(C2);
		System.out.println("Complex Multiplication : ");
		CX=C1.substractComplex(C2);
		System.out.println("Complex Subtraction : ");
		CX=C1.multiplyComplex(C2);
	}

}