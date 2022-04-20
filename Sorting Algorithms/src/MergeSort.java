/*
TC : O(NLogN)
Aux SC : O(N) --> Due to recursive stack
*/


import java.util.*;
public class MergeSort {
	private static void mrgSort(int[] arr)
	{
		int len = arr.length;
		if(len<2) return;
		int midIndex = len/2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[len - midIndex];
		
		for(int i=0;i<midIndex;i++)
		{
			leftHalf[i] = arr[i];
		}
		
		for(int i=midIndex;i<len;i++)
		{
			rightHalf[i-midIndex] = arr[i];
		}
		
		//Sort left half and right half
		mrgSort(leftHalf);
		mrgSort(rightHalf);
		
		//Merge
		merge(arr,leftHalf,rightHalf);
	}
	
	private static void merge(int[] arr, int[] leftHalf, int[] rightHalf)
	{
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		int i=0,j=0,k=0;
		
		while(i<leftSize && j<rightSize)
		{
			if(leftHalf[i]<=rightHalf[j])
			{
				arr[k] = leftHalf[i];
				i++;
			}
			else
			{
				arr[k] = rightHalf[j];
				j++;
			}
			
			k++;
		}
		
		while(i<leftSize)
		{
			arr[k] = leftHalf[i];
			i++;
			k++;
		}
		
		while(j<rightSize)
		{
			arr[k] = rightHalf[j];
			j++;
			k++;
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
		mrgSort(arr);
		for(int i=0;i<size;i++)
			System.out.print(arr[i] + " ");
		
		

	}

}
