public class GradeCase
{
 public static void main(String args[])
 {
  int temp,g=0;
  temp=95;
  if (temp>90) g=1;
  else if (temp>=81 && temp<=90) g=2;
  else if (temp>=71 && temp<=80) g=3;
  else if (temp>=61 && temp<=70) g=4;
  else if (temp>=51 && temp<=60) g=5;
  if (temp<50) g=6;
  switch (g) 
   { 
   case 1 :
	System.out.println("You have got : O");
	break;
   case 2 :
	System.out.println("You have got : E");
	break;
   case 3 :
	System.out.println("You have got : A");
	break;
   case 4 : 
	System.out.println("You have got : B");
	break;
   case 5 : 
	System.out.println("You have got : C");
	break;
   default : 
	System.out.println("You have got : F");
   }
 }
}
	  