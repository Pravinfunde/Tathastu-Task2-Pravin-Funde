 import java.util.Scanner;
class Task2
{
    public static void main(String args[])
    {
        String input, temp = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string to check:");
        input = s.nextLine();
        int n = input.length();
        for(int i = n - 1; i >= 0; i--)
        {
            temp = temp + input.charAt(i);
        }
        if(input.equalsIgnoreCase(temp))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
} 
