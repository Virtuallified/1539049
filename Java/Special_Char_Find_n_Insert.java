import java.util.Scanner;

/**
 * Created by Subhradip on 12/9/2016.
 */
class Letters
{
    private char arr[] = new char[50];
    private int i=0;
    void insert(char n)
    {
        arr[i]=n;
        i++;
    }
    void show()
    {
        while(i>=0)
        {
            System.out.println("Letters are :\n" +arr[i]);
            i--;
        }
    }
}
class UpperCase
{
    char arr[] = new char[50];
    private  int i=0;
    void insert(char n)
    {
        arr[i]=n;
        i++;
    }
    void show()
    {
        while(i>=0)
        {
            System.out.println("UpperCase are :\n" +arr[i]);
            i--;
        }
    }
}
class LowerCase
{
    char arr[] = new char[50];
    private  int i=0;
    void insert(char n)
    {
        arr[i]=n;
        i++;
    }
    void show()
    {
        while(i>=0)
        {
            System.out.println("LowerCase are :\n" +arr[i]);
            i--;
        }
    }
}
class Digits
{
    char arr[] = new char[50];
    private  int i=0;
    void insert(char n)
    {
        arr[i]=n;
        i++;
    }
    void show()
    {
        while(i>=0)
        {
            System.out.println("Digits are :\n" +arr[i]);
            i--;
        }
    }
}
class WhiteSpace
{
    char arr[] = new char[50];
    private  int i=0;
    void insert(char n)
    {
        arr[i]=n;
        i++;
    }
    void show()
    {
        while(i>=0)
        {
            System.out.println("WhiteSpaces are :\n" +arr[i]);
            i--;
        }
    }
}
class SpecialChar
{
    char arr[] = new char[50];
    private  int i=0;
    void insert(char n)
    {
        arr[i]=n;
        i++;
    }
    void show()
    {
        while(i>=0)
        {
            System.out.println("Special Characters are :\n" +arr[i]);
            i--;
        }
    }
}
public class Special_Char_Find_n_Insert
{
    public static void main(String args[])
    {
        System.out.println("Enter the characters/digits/special chars/white spaces");
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        Letters le = new Letters();
        UpperCase up = new UpperCase();
        LowerCase lo = new LowerCase();
        Digits dg = new Digits();
        WhiteSpace ws = new WhiteSpace();
        SpecialChar sp = new SpecialChar();
        for(int i=0;i<ch.length();i++)
        {
            if (Character.isLetter(ch.charAt(i)))
                le.insert(ch.charAt(i));
            else if (Character.isLowerCase(ch.charAt(i)))
                lo.insert(ch.charAt(i));
            else if (Character.isUpperCase(ch.charAt(i)))
                up.insert(ch.charAt(i));
            else if (Character.isDigit(ch.charAt(i)))
                up.insert(ch.charAt(i));
            else if (Character.isWhitespace(ch.charAt(i)))
                ws.insert(ch.charAt(i));
            else if (!Character.isLetterOrDigit(ch.charAt(i)) && !Character.isSpaceChar(ch.charAt(i)))
                sp.insert(ch.charAt(i));
        }
        le.show();
        dg.show();
        up.show();
        lo.show();
        ws.show();
        sp.show();
    }
}
