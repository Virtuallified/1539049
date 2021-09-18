class Box
{
	double width;
	double height;
	double lenght;

	void getDimension(double w,double h,double l)
	{
		width=w;
		height=h;
		lenght=l;
	}
	double showVol()
	{	
		double v;
		v=width*height*lenght;
		return v;
	}
	double BoxArea()
	{
		double a;
		a=2*height*lenght;
		return a;
	}
}
public class BoxVolArea
{
	public static void main(String args[])
	{
		double x,y,s; 
		Box nbox=new Box ();
		Double i=Double.parseDouble(args[0]);
		Double j=Double.parseDouble(args[1]);
		Double k=Double.parseDouble(args[2]);
		
		nbox.getDimension(i,j,k);
		x=nbox.showVol();
		y=nbox.BoxArea();

		System.out.println("The Volumn will be : " +x);
		System.out.println("The Area will be : " +y);
	}
}