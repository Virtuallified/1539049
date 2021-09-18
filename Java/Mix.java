//Divide Two Numbers Without Using Division and Modulus Operator

void main(){
   int a,b,i=0;
   clrscr();
   printf("Enter the devident and devider");
   scanf("%d%d",&a,&b);
   while(a>=b){
      a=a-b;
      i++;
   }

   printf("qoutient is :%d \n remainder : %d",i,a);
   getch();
}

//Multiplying 2 numbers without using the * operator

import java.io.*;
import java.util.*;
class dani_add{
        public static void main(String args[])throws IOException{
        System.out.println("Enter the first number");
        BufferedReader obj = new BufferedReader(new InputStreamReader((System.in)));
        int a=Integer.parseInt(obj.readLine());
        System.out.println("Enter the Second number");
        int b=Integer.parseInt(obj.readLine());
        int c=0;
        for(int i=0;i<b;i++){
                c=c+a;
        }
        System.out.println("The Product is"+c);
        }
}


//Multiplication of two integers using bitwise operators

#include<stdio.h>

main()
{
    int a, b, result;
    printf("\nEnter the numbers to be multiplied:");
    scanf("%d%d", &a, &b);       // a > b
    result = 0;
    while (b != 0)               // Iterate the loop till b == 0
    {
        if (b & 01)               // Bitwise & of the value of b with 01
        {
            result = result + a;  // Add a to result if b is odd .
        }
        a<<=1;                    // Left shifting the value contained in 'a' by 1
                                  // Multiplies a by 2 for each loop
        b>>=1;                    // Right shifting the value contained in 'b' by 1.
    }
    printf("nResult:%d",result);
}

//Subtract two numbers without using arithmetic operators

#include<stdio.h>
 
int subtract(int x, int y)
{
    while (y != 0)							// Iterate till there is no carry
    {
        int borrow = (~x) & y;				// borrow contains common set bits of y and unset
											// bits of x
             
        x = x ^ y;							// Subtraction of bits of x and y where at least
											// one of the bits is not set
        
        y = borrow << 1;					// Borrow is shifted by one so that subtracting it from
											// x gives the required sum
    }
    return x;
}
int main()									// Driver program
{
    int x = 29, y = 13;
    printf("x - y is %d", subtract(x, y));
    return 0;
}