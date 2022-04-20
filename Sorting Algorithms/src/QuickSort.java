/*
 TC : Worst Case - O(N^2) :- this occurs when the pivot is always the smallest/largest element in array
      Best Case - O(NlogN)
 
 SC : O(1)
 */

import java.util.Scanner;

public class QuickSort {
	
	public static void quickSrt(int[] arr, int low, int high)
	{
		if(low < high)
		{
			int pivotIndex = partition(arr, low, high);
			quickSrt(arr, low, pivotIndex-1);
			quickSrt(arr,pivotIndex+1, high);
			
		}
	}
	
	public static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp1 = arr[i];
		arr[i] = arr[high]; //arr[high] is the pivot
		arr[high] = temp1;
		
		return i; //pivot index
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
		quickSrt(arr,0,size-1);
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " ");
		

	}

}
