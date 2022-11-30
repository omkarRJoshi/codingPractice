package com.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {1,2,12,13,2,423,4,2,423,4,2};
		
		SelectionSort sort = new SelectionSort();
		System.out.print("before sort: ");
		sort.printArray(arr);
		
		sort.selectionSort(arr);
		
		System.out.print("After sort: ");
		sort.printArray(arr);

	}
	
	private void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
				
			}
			swap(arr, i, minIndex);
		}
	}
	
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
