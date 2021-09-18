#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<graphics.h>
#include<math.h>

void plot(int x,int y);
int xc,yc;
void main()
{
	int gd=DETECT,gm,x,y;
	char ch;
	long int rx,ry;
	float p,px,py,tworx2,twory2,rx2,ry2;
	initgraph(&gd,&gm,"..\\bgi");
	start:
	line(320,0,320,480);
	line(0,240,640,240);
	gotoxy(1,1);
	printf("Enter the centre of Ellipse(x,y) : ");
	scanf("%d%d",&xc,&yc);
	printf("Enter the Major & Minor Axis of Ellipse(x,y): ");
	scanf("%ld%ld",&rx,&ry);
	//clrscr();
	ry2=ry*ry;
	rx2=rx*rx;
	twory2=2*ry2;
	tworx2=2*rx2;
	x=0;
	y=ry;
	plot(x,y);
	p=(ry2-rx2*ry+(0.25*rx2));
	px=0;
	py=tworx2*y;
	while(px<py)
	{
		x++;
		px=px+twory2;
		if(p>=0)
		{
			y--;
			py=py-tworx2;
		}
		if(p<0)
		       p=p+ry2+px;
		else
			p=p+ry2+px-py;
		plot(x,y);
	}
	p=(ry2*(x+0.5)*(x+0.5)+rx2*(y-1)*(y-1)-rx2*ry2);
	while(y>0)
	{
		y--;
		py=py-tworx2;
		if(p<=0)
		{
			x++;
			px=px+twory2;
		}
		if(p>0)
			p=p+rx2-py;
		else
			p=p+rx2-py+px;
		plot(x,y);
	}
	gotoxy(40,24);
	printf("Esc to quit, any other key to reddraw");
	ch=getch();
	if(ch!=27)
	{
		clearviewport();
		goto start;
	}
	closegraph();
}
void plot(int x,int y)
{
	putpixel(xc+x+320,240-yc+y,WHITE);
	putpixel(xc-x+320,240-yc+y,WHITE);
	putpixel(xc+x+320,240-yc-y,WHITE);
//	putpixel(xc+x+320,240-yc-y,WHITE);
	putpixel(xc-x+320,240-yc-y,WHITE);
}