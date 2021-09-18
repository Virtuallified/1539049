public class Without_Divition
{
    public static void main(String args[]) {
        // initialize dividend and divisor
        int dividend = 13;
        int divisor = 4;
        // initialize quotient
        int quotient = 0;
        //loop till the divisor does not become smaller than dividend
        while(dividend >= divisor)
        {
            dividend = dividend - divisor;
            quotient++;
        }
        // print results
        System.out.println("Quotient is "+quotient);
        // result of last subtraction
        System.out.println("Remainder is "+dividend);
        }
}