/*
 TC : O(N^2)
 SC : O(1)
 */
import java.util.Scanner;

public class SelectionSort {
	private static void selecSort(int[] arr)
	{
		int len = arr.length;
		for(int i=0;i<len-1;i++)
		{
			int min = i;
			for(int j=i+1;j<len;j++)
			{
				if(arr[j]<arr[min])
				{
					min = j;
				}
			}
			
			if(min != i)
			{
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array before sorting");
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("Array after sorting");
	    selecSort(arr);
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " ");
		

	}

}
