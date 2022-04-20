/*
 TC : O(N^2)
 SC : O(1)
*/

import java.util.*;

public class InsertionSort {
	
	private static void insertSort(int[] arr)
	{
		int len = arr.length;
		for(int i=1;i<len;i++)
		{
			int currentValue = arr[i];
			
			int j=i-1;
			while(j>=0 && arr[j]>currentValue)
			{
				arr[j+1] = arr[j]; // shifting by 1
				j--;
			}
			arr[j+1] = currentValue;
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
		insertSort(arr);
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " ");
		

	}

}
