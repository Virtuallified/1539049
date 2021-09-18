import java.io.*;
import java.util.*;
public class Without_Multiplication
    {
        public static void main(String args[])throws IOException{
        System.out.println("Enter the first number");
        BufferedReader obj = new BufferedReader(new InputStreamReader((System.in)));
        int a=Integer.parseInt(obj.readLine());
        System.out.println("Enter the Second number");
        int b=Integer.parseInt(obj.readLine());
        int c=0;
        for(int i=0;i<b;i++)
            c=c+a;
        System.out.println("The Product is : "+c);
    }
}