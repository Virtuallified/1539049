#include<graphics.h>
#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
void circledraw(int,int,int,int,int);
void BCDA(int,int,int,int);
void main()
{
	int gd=DETECT,gm;
	int col,r,xc,yc;
	initgraph(&gd,&gm,"c:\\turboc3\\bgi");
	printf("Enter the Radius :");
	scanf("%d",&r);
	printf("Enter the color:");
	scanf("%d",&col);
	printf("Enter the Center point :");
	scanf("%d %d",&xc,&yc);
	BCDA(xc,yc,r,col);
	getch();
	cleardevice();
	closegraph();
}
void circledraw(int xc,int yc,int x,int y,int col)
{
	putpixel(xc+x,yc+y,col);
	putpixel(xc-x,yc+y,col);
	putpixel(xc-x,yc-y,col);
	putpixel(xc+x,yc-y,col);
	putpixel(xc+y,yc+x,col);
	putpixel(xc-y,yc+x,col);
	putpixel(xc-y,yc-x,col);
	putpixel(xc+y,yc-x,col);

}
void BCDA(int xc,int yc,int r,int col)
{
	int x,y;
	double d;
	x=0;y=r;
	d=(5.0/4.0)-r;
	circledraw(xc,yc,x,y,col);
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
		circledraw(xc,yc,x,y,col);
	}
}