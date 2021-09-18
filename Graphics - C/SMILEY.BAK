#include<graphics.h>
#include<conio.h>
void main()
{
	int gd=DETECT,gm;
	int i,midx,midy;
	initgraph(&gd,&gm,"c:\\turboc3\\bgi");

		circle(300,200,150);     //face
		circle(220,150,40);      //right eyeball
		circle(210,150,10);      //left innerball
		circle(380,150,40);      //left eyeball
		circle(370,150,10);      //right innerball
		for(i=1;i<=10;i++)
		{
			circle(370,150,i);     //left filling
			circle(210,150,i);     //right filling
		}
		midx=getmaxx()/2;
		midy=getmaxy()/2;

		arc(300,midy,190,350,50);
		line(300,200,300,130);

	getch();
	closegraph();
}