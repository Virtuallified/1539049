//WAP to display only the sum of prime numbers between 1 to 100.

import java.util.Scanner;
public class Prime_100Sum
{
    public static void main(String args[])
    {
         int flag = 0, i, j,sum=0;
         System.out.println ("The prime numbers in between the entered limits are :");
         for(i = 1; i <= 100; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 //System.out.println(i);
                 sum=sum+i;
             }
         }
         System.out.println("Sum : "+sum);
    }
}