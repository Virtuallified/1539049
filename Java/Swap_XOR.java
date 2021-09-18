/*Swap 2 integers without using third variable and arithmetic operator.*/

import java.io.*;
import java.util.*;

class xor
{
	public static int[] swap(int a,int b)
	{
		a=a^b;
		b=a^b;
		a=a^b;
		
		return new int[] {a,b};
	}
}
public class Swap_XOR
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int x = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int y = sc.nextInt();
		
		xor sp = new xor();
		int result[] = sp.swap(x,y);
		
		System.out.println("Swapping : " + result[0] +" <--> "+ result[1]);
		
	}
}