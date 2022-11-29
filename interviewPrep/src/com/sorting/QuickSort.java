package com.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {21,2,12,13,24,3,43,42,4,3,35,6,43,6,457,21,2,12,13,24,3,43,42,4,3,35,6,43,6,457};
		QuickSort sort = new QuickSort();
		
		System.out.print("before sort: ");
		sort.printArray(arr);
		
		sort.quickSort(arr, 0, arr.length - 1);
		
		System.out.print("After sort: ");
		sort.printArray(arr);

	}
	
	
	private void quickSort(int[] arr, int l, int r) {
		if(l >= r) {
			return;
		}
		
		int pivot = partition(arr, l, r);
		quickSort(arr, l, pivot - 1);
		quickSort(arr, pivot + 1, r);
	}
	
	private int partition(int[] arr, int l, int r) {
		int pivot = l;
		
		int lessThanCurr = 0;
		
		for(int i = l + 1; i <= r; i++) {
			if(arr[i] <= arr[pivot]) {
				lessThanCurr++;
			}
		}
		pivot += lessThanCurr;
		swap(arr, l, pivot);
		
		while(l < pivot && r > pivot) {
			while(arr[l] < arr[pivot]) {
				l++;
			}
			while(arr[r] > arr[pivot]) {
				r--;
			}
			
			if(l < pivot && r > pivot) {
				swap(arr, l, r);
				l++;
				r--;
			}
		}
		
		return pivot;
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
