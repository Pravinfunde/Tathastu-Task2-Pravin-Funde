 import java.util.Scanner;
class Task2
{
  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        int p = (int)(factorial(a) / factorial(a - b));
        int c = (int)(factorial(a) 
                      / (factorial(a - b) * factorial(b)));
        System.out.println("Permutation = " + p);
        System.out.println("Combination = " + c);
    }
	  static long factorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }
}
