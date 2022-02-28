 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Task2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> al = new ArrayList<>();
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		System.out.println(al);
		System.out.println("Enter a position to remove element");
		int p = sc.nextInt();
		al.remove(p-1);
		System.out.println(al);
	}
}
