import java.util.Scanner;
import java.io.*;

/**
 * Created by Subhradip on 16/9/2016.
 *
 * ~~~ Matrix multiplication
 */
 
public class Matrix_Multiplication 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row's count in Matrix A");
        int r = sc.nextInt();
        System.out.println("Enter the column's count in Matrix A / row's count of Matrix B");
        int c = sc.nextInt();
        System.out.println("Enter the column's count in Matrix B");
        int b = sc.nextInt();

        int A[][] = new int[r][c];								// r = rows in A, c = columns in A
        int B[][] = new int[c][b];								// c = rows in B, b = columns in B

        System.out.println("Enter Matrix A Rowwise");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Matrix B Rowwise");
        for (int i = 0; i < B.length; i++) {					// B.length = length of rows in B
            for (int j = 0; j < B[0].length; j++) {				// B[0].length = length of columns in B
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Multiplied Matrix A x B = C: ");

        int C[][] = multiply(A,B);
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int[][] multiply(int[][] a, int[][] b) 
	{
        int C[][] = new int[a.length][b[0].length];				// a.length = length of rows in a , b[0].length = length of columns in b

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++)			//a[0].length = length of columns in a
                    C[i][j] = C[i][j] + a[i][k] * b[k][j];
            }
        }
        return C;
    }
}
