import java.util.Scanner;
class Task2 {  
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String input = sc.nextLine();
		System.out.println(reverseWord(input));
	}
	static String reverseWord(String str){  
		String words[]=str.split("\\s");  
		String reverseWord="";  
		for(String w:words){  
			StringBuilder sb=new StringBuilder(w);  
			sb.reverse();  
			reverseWord+=sb.toString()+" ";  
		}  
		return reverseWord.trim();  
	}  
} 
