import java.util.Scanner;
public class Task2
{
    public static void main(String args[]) 
    {
        int n, i, j, gap = 1;
        n = 5;
        gap = n-1;
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= gap; i++) 
            {
                System.out.print(" ");
            }
            gap--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        gap = 1;
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= gap; i++) 
            {
                System.out.print(" ");
            }
            gap++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
