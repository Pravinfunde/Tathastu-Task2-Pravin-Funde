import java.util.Scanner;
class Task2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = sc.nextInt();
		int arr[];
		arr = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		if (isMirrorInverse(arr))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	static boolean isMirrorInverse(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {

			// If condition fails for any element
			if (arr[arr[i]] != i)
				return false;
		}
		// Given array is mirror-inverse
		return true;
	}
}
