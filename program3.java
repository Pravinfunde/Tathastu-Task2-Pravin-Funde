import java.util.Scanner;
class Task2{  
	 public static void main(String args[]){  
		  int i,fact=1;  
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter Number");
		  int number = sc.nextInt();//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
			  fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
} 
