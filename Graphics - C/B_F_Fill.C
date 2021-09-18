#include<stdio.h>
#include<conio.h>
#include<graphics.h>

void FloodFill (int x, int y, int newcolor, int oldcolor)
{
	int color;
	color=getpixel(x,y);
	if(color==oldcolor)
	{
		setcolor(newcolor);
		putpixel(x,y, newcolor);
		delay(3);
		FloodFill(x+1,y, newcolor, oldcolor);
		FloodFill(x-1,y, newcolor, oldcolor);
		FloodFill(x,y+1, newcolor, oldcolor);
		FloodFill(x,y-1, newcolor, oldcolor);
	}
}
void BoundryFill(int x, int y, int ncolor, int ecolor)
{
	int current;
	current=getpixel(x,y);
	if(current!=ecolor && current!=ncolor)
	{
	       //	setcolor(ncolor);
		putpixel(x,y, ncolor);
		delay(3);
		BoundryFill(x+1,y, ncolor, ecolor);
		BoundryFill(x-1,y, ncolor, ecolor);
		BoundryFill(x,y+1, ncolor, ecolor);
		BoundryFill(x,y-1, ncolor, ecolor);
	}
}
void main()
{
	int gd=DETECT,gm,x,y,nc;
	initgraph(&gd, &gm,"..//bgi");
	printf("Enter the coordinate of(x,y):");
	scanf("%d%d%d",&x,&y,&nc);
       //	printf("Enter new color : ");
       //	scanf("%d", &ncolor);
	circle(x,y,30);
	FloodFill(x,y,nc,BLACK);
	BoundryFill(x,y,2,BLACK);
	getch();
	closegraph();
}
