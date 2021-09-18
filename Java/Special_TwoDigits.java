//Enter a 2 Digit no. and find if its a special no. or not.
/*  Ex. Special no = 59
    5 + 9 = 14
    5 x 9 = 45
    14 + 45 = 59 (Same special no.) */
import java.util.*;

public class Special_TwoDigits
{
    public static void main(String[] args) {
        int n,r,q,temp,sum,pro;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 2 digit no.");
        n = sc.nextInt();
        temp=n;
        r = n%10;
        q = n/10;
        sum = r+q;
        pro = r*q;
        n=sum+pro;
        if(temp == n)
            System.out.println("Its a Special 2 Digit no.");
        else
            System.out.println("Not a Special 2 Digit no.");
    }
}