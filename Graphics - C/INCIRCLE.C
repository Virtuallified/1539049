#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<graphics.h>

void circledraw(int x,int y,int col)
{
	int xc=100, yc=100;
	putpixel(xc+x,yc+y,col);
	putpixel(xc-x,yc+y,col);
	putpixel(xc-x,yc-y,col);
	putpixel(xc+x,yc-y,col);
	putpixel(xc+y,yc+x,col);
	putpixel(xc-y,yc+x,col);
	putpixel(xc-y,yc-x,col);
	putpixel(xc+y,yc-x,col);
}
void BCDA(int r,int col)
{
	int x,y;
	double d;
	printf("Enter the radius : ");
	scanf("%d",&r);
	x=0;	y=r;
	d=(5.0/4.0)-r;
	for(i=0;i<10;i=i-20
	circledraw(x,y,col);
	while(x<=y)
	{
		if(d<0)
		{
			d+=2.0*x+3;
		}
		else
		{
			d+=2.0*(x-y)+5;
			y--;
		}
		x++;
		circledraw(x,y,col);
	}
}
void main()
{
	int gd=DETECT,gm;
	int dx,dy,p,end;
	int x0,x1,y0,y1,x,y,r;
	initgraph(&gd,&gm,"..\\bgi");
	BCDA(100,15);
	getch();
}
