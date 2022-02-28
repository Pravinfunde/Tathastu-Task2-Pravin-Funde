import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.lang.Math;
class Task2
{
	public static void main(String[] args)
	{
		double num1, num2;
		char op;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter the numbers");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			System.out.println("choose operation : "+"\n + : addition"+"\n- : substraction"+"\n* : multiply"+"\n/ : Division");
			op = sc.next().charAt(0);
			double o = 0;
			switch (op) {
			// case to add two numbers
			case '+':
				o = num1 + num2;
				break;
			// case to subtract two numbers
			case '-':
				o = num1 - num2;
				break;
			// case to multiply two numbers
			case '*':
				o = num1 * num2;
				break;
			// case to divide two numbers
			case '/':
				o = num1 / num2;
				break;
			default:
				System.out.println("Enter valid operator");
				break;
			}
			if(op!=0)
			{
				System.out.println();
				System.out.println(num1 + " " + op + " " + num2
								+ " = " + o);	
			}
		}while(op!=0);
	}
}
