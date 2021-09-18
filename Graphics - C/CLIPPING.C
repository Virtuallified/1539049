#include<stdio.h>
#include<graphics.h>
float cxl,cxr,cyt,cyb;
code(float, float);
void clip(float, float, float, float);
void rect(float, float, float, float);
void main()
{
	float x1,y1,x2,y2;
	int g=0,d=DETECT;
	initgraph(&g,&d,"..\\bgi");
	settextstyle(1,0,1);
	outtextxy(40,15,"before clipping");
	printf("\n\n\n please enter the left,bottom,right,top of clip window");
	scanf("%f%f%f%f",&cxl,&cyb,&cxr,&cyt);
	rect(cxl,cyb,cxr,cyt);
	getch();
	printf("\n please enter the line(x1,y1,x2,y2) : ");
	scanf("%f%f%f%f",&x1,&y1,&x2,&y2);
	line(x1,y1,x2,y2);
	getch();
	cleardevice();
	settextstyle(1,0,1);
	outtextxy(40,15,"after clipping");
	clip(x1,y1,x2,y2);
	getch();
	closegraph();
}

void clip(float x1, float y1, float x2, float y2)
{
	int c,c1,c2; float x,y;
	c1=code(x1,y1);
	c2=code(x2,y2);
	while((c1!=0) || (c2!=0))
	{
		if ((c1&c2)!=0)
			goto out;
		c=c1;
		if(c==0)
			c=c2;
		if((c&1)==1)
		{
		  y=y1+(y2-y1)*(cxl-x1)/(x2-x1);
		  x=cxl;
		}
		else if((c&2)==2)
		{
		  y=y1+(y2-y1)*(cxl-x1)/(x2-x1);
		  x=cxr;
		}
		else if((c&8)==8)
		{
		  x=x1+(x2-x1)*(cyb-y1)/(y2-y1);
		  y=cyb;
		}
		else if((c&4)==4)
		{
		  x=x1+(x2-x1)*(cyt-y1)/(y2-y1);
		  y=cyt;
		}
		if (c==c1)
		{
			x1=x; y1=y; c1=code(x,y);
		}
		else
		{
			x2=x; y2=y; c2=code(x,y);
		}
	}
	out : rect(cxl,cyb,cxr,cyt);
	line(x1,y1,x2,y2);
}

code(float x,float y)
{
	int c=0;
	if (x<cxl)
		c=1;
	else if (x>cxr)
		c=2;
	if(y<cyb)
		c=c | 8;
	else if (y>cyt)
		c=c | 4;
	return c;
}

void rect(float xl, float yb, float xr, float yt)
{
	line(xl,yb,xr,yb);
	line(xr,yb,xr,yt);
	line(xr,yt,xl,yt);
	line(xl,yt,xl,yb);
}