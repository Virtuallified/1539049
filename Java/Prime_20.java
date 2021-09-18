//WAP to take 20 numbers as input and display only prime numbers.

import java.util.*;

public class Prime_20
{
    public static void main(String args[]) 
    {
        int i,j,k=0,n,a[],b[],flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        a = new int[3];
        b = new int[3];
        for (i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for (i=0;i<a.length;i++)
        { 
            for(j=2;j<a.length;j++)
            {
                if(a[i]%j == 0)
                    flag = 0;
                else
                    flag = 1;
            }
            if(flag == 1)
                System.out.println("Prime No.s are : "+a[i]);
        }
    }
}