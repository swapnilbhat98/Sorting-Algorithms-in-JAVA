/*
 TC : O(N^2)
 SC : O(1)
 
*/

import java.util.Scanner;

public class BubbleSort {
	private static void bubSort(int[] arr)
	{
		int len = arr.length;
		int i,j;
		for(i=0;i<len-1;i++)
		{
			for(j=0;j<len-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
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
		bubSort(arr);
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " ");
		

	}

}
