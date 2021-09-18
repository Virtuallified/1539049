public class GreaterValuein3
{
public static void main(String args[])
{
int a,b,c;
a=56;b=60;c=22;
if (a>b)
{	
   if (a>c)
   {
   System.out.println("The greater value will be: " +a);
   }
   else
   {
   System.out.println("The greater value will be: " +c);
   }
}
else
   if (b>c)
   {
   System.out.println("The greater value will be: " +b);
   }
   else
   {
   System.out.println("The greater value will be: " +c);
   }
}
}