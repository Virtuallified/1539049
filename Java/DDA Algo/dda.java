import java.applet.*;
import java.awt.*;
import java.util.*;

public class dda extends Applet
{
	double x1,y1,x2,y2,dx,dy,steps,x,y,k,xc,yc;
	Scanner sc=new Scanner(System.in);
	public dda()
	{
		System.out.println("Enter x1 x2");
		x1=sc.nextDouble();
		x2=sc.nextDouble();
		System.out.println("Enter x2 y2");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
	}
	public void paint(Graphics g)
	{
		try
		{
			dx=x2-x1;
			dy=y2-y1;
			if(Math.abs(dx)>Math.abs(dy))
			{
				steps=Math.abs(dx);
			}
			else
				steps=Math.abs(dy);
			xc=(dx/steps);
			yc=(dy/steps);
			x=x1;
			y=y1;
			for(k=1;k<=steps;k++)
			{
				x=x+xc;
				y=y+yc;
				g.fillOval((int)x,(int)y,5,5);
			}
		}
		catch(Exception e) {}
	}
}
/*
<applet code="dda.class" width="500" height="500">
</applet>
*/