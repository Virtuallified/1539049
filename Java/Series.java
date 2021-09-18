/**
 * @author Subhradip D.
 * @create date 2019-07-28 00:23:42
 * @modify date 2019-07-28 00:23:42
 * @desc [description]
 */
/* WAP TO PRINT A SERIES */
class SeriesA
// 1 + 1/2 + 1/3 + .... + 1/N
{
    void series() {
        System.out.println("1 + 1/2 + 1/3 + .... + 1/N");
        double sum = 0;
        for (double i = 1; i <= 20; i++) {
            sum = sum + 1 / i;
            System.out.println("Series is : " + sum);
        }
    }
}

class SeriesB
// 1 + 1/3 + 1/5 + .... + 1/N
{
    void series() {
        System.out.println("1 + 1/3 + 1/5 + .... + 1/N");
        double sum = 0;
        for (double i = 1; i <= 21; i = i + 2) {
            sum = sum + 1 / i;
            System.out.println("Series is : " + sum);
        }
    }
}

class SeriesC
// 1! + 2! + 3! + .... + n!
{
    int fact = 1, sum = 0;

    void series() {
        System.out.println("1! + 2! + 3! + .... + N!");
        for (int i = 1; i <= 5; i++) {
            fact = fact * i;
            System.out.println(i + "!");
            sum = sum + fact;
        }
        System.out.println("The sum value is : " + sum);
    }
}

class blank {
    public void blank() {
        System.out.println("");
    }
}

public class Series {
    public static void main(String args[]) {
        blank x = new blank();
        SeriesA objA = new SeriesA();
        SeriesB objB = new SeriesB();
        SeriesC objC = new SeriesC();
        objA.series();
        x.blank();
        objB.series();
        x.blank();
        objC.series();
        x.blank();
    }
}