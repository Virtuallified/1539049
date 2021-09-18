#include<graphics.h>
#include<math.h>
#include<stdlib.h>
void main()
{
	int gd=DETECT,gm,x,y,x1,x2,x3,y1,y2,y3,tx,ty,Sx,Sy,dx1,dy1,dx2,dy2,ch;
	float o;
	initgraph(&gd,&gm,"..\\BGI");
	x=getmaxx()/2;
	y=getmaxy()/2;
	line(0,y,getmaxx(),y);
	line(x,0,x,getmaxy());
	printf("Enter the coordinates of the original Triangle:");
	scanf("%d%d%d%d%d%d",&x1,&y1,&x2,&y2,&x3,&y3);
	line(x+x1,y-y1,x+x2,y-y2);
	line(x+x2,y-y2,x+x3,y-y3);
	line(x+x3,y-y3,x+x1,y-y1);
	outtextxy(x+x1-80,y-50,"Before");
	printf("1 : for Translation:\n2 : for Scalling:\n3 : for Rotation:\n4 : for Reflexion\nEnter your choice: ");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1:
		{
			printf("Enter the two translating factor x & y: ");
			scanf("%d%d",&tx,&ty);
			x1=tx+x1;
			x2=tx+x2;
			x3=tx+x3;
			y1=ty+y1;
			y2=ty+y2;
			y3=ty+y3;
			setcolor(3);
			line(x+x1,y-y1,x+x2,y-y2);
			line(x+x2,y-y2,x+x3,y-y3);
			line(x+x3,y-y3,x+x1,y-y1);
			outtextxy(x+x1+50,y-50,"After");
			break;
		}
		case 2:
		{
			printf("Enter the two scalling factors Sx & Sy: ");
			scanf("%d%d",&Sx,&Sy);
			//x1=Sy*x1;
			x2=Sx*x2;
			x3=Sx*x3;
			y3=Sy*y3;
			setcolor(4);
			line(x+x1,y-y1,x+x2,y-y2);
			line(x+x2,y-y2,x+x3,y-y3);
			line(x+x3,y-y3,x+x1,y-y1);
			outtextxy(x+x2+50,y-50,"After");
			break;
		}
		case 3:
		{
			int xo,yo,xoo,yoo;
			printf("Enter the value of 0`: ");
			scanf("%f",&o);
			o=(o*3.14)/180;
			xo=(x1*(1-cos(o))+y1*sin(o))+x2*cos(o)-y2*sin(o);
			yo=(y1*(1-cos(o))-x1*sin(o))+x2*sin(o)+y2*cos(o);
			xoo=(x1*(1-cos(o))+y1*sin(o))+x3*cos(o)-y3*sin(o);
			yoo=(y1*(1-cos(o))-x1*sin(o))+x3*sin(o)+y3*cos(o);
			setcolor(5);
			line(x+x1,y-y1,x+xo,y-yo);
			line(x+xo,y-yo,x+xoo,y-yoo);
			line(x+xoo,y-yoo,x+x1,y-y1);
			outtextxy(x+xo-30,y-yo-30,"After");
			break;
		}
		case 4:
		{
			int n1;
			printf("Enter 1 for x axix | 2 for y axix | 3 for origin\nEnter:");
			scanf("%d",&n1);
			switch(n1)
			{
				case 1:
				{
					setcolor(GREEN);
					line(x+x1,y+y1,x+x2,y+y2);
					line(x+x2,y+y2,x+x3,y+y3);
					line(x+x3,y+y3,x+x1,y+y1);
					outtextxy(x+x1+150,y-y1+20,"After");
					break;
				}
				case 2:
				{
					setcolor(GREEN);
					line(x-x1,y-y1,x-x2,y-y2);
					line(x-x2,y-y2,x-x3,y-y3);
					line(x-x3,y-y3,x-x1,y-y1);
					outtextxy(x+x1-150,y-y2-20,"After");
					break;
				}
				case 3:
				{
					setcolor(GREEN);
					line(x-x1,y+y1,x-x2,y+y2);
					line(x-x2,y+y2,x-x3,y+y3);
					line(x-x3,y+y3,x-x1,y+y1);
					outtextxy(x+x1-150,y-y1+20,"After");
					break;
				}
				default:
				printf("Error");
				break;
			}
			break;
		}
	}
	getch();
}