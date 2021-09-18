#include<graphics.h>
void main()
{
	int gd=DETECT,gm;
	int x[4],y[4],px,py,i;
	double t;
	printf("Enter four control points of bezier curve: ");
	for (i=0;i<4;i++)
		scanf("%d%d",&x[i],&y[i]);
	initgraph(&gd,&gm, "..\\bgi");

	for(t=0;t<=1;t+=0.001)
	{
		px=(1-t)*(1-t)*(1-t)*x[0]+3*t*(1-t)*(1-t)*x[1]+3*t*t*(1-t)*x[2]+t*t*t*x[3];
		py=(1-t)*(1-t)*(1-t)*y[0]+3*t*(1-t)*(1-t)*y[1]+3*t*t*(1-t)*y[2]+t*t*t*y[3];
		putpixel(px,py,WHITE);
		delay(10);
	}
	getch();	cleardevice();	closegraph();
}