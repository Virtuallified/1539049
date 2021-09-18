import java.util.Scanner;

/**
 * Created by Subhradip on 13/9/2016.
 */
public class Special_Char_Find_n_Insert_ASCII
{
    public static void main(String args[])
    {
        System.out.println("Enter the characters/digits/special chars/white spaces");
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        int num,wp=0,up=0,lo=0,dg=0,ws=0,sp=0;
        for (int i = 0; i < ch.length(); i++)
        {
            num = ch.charAt(i);
            if 	(num == 32)					//(num == 32)  ASCII Value
            {
                System.out.println("Whitespace");
                wp++;
            }
            else if (num >=65 && num <=90 )
            {
                System.out.println("UpperCase");
                up++;
            }
            else if (num >=97 && num <=122 )
            {
                System.out.println("LowerCase");
                lo++;
            }
            else if (num >=48 && num <=57 )
            {
                System.out.println("Digits");
                dg++;
            }
            else if ((num >=33 && num <=47) || (num >=58 && num <=64) || (num >=91 && num <=96) || (num >=123 && num <=127))
            {
                System.out.println("Special Characters");
                sp++;
            }
        }
    }
}