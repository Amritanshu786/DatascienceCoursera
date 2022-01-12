import java.util.*;

public class plusOneSubset {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int testing=0; testing<testCases; testing++)
		{
			int size = scan.nextInt();
			int arr[] = new int[size];
			for(int i=0; i<size; i++)
			{
				arr[i] = scan.nextInt();
			}
			int maxValue=Integer.MIN_VALUE;
			int minValue = arr[0];
			for(int i=0; i<size; i++)
			{
				if(maxValue<arr[i])
					maxValue = arr[i];
				if(minValue>arr[i])
					minValue = arr[i];
			}
			System.out.println(maxValue-minValue);
		}
		scan.close();
	}

}
