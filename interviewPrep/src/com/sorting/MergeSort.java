package com.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {1,2,34,23,4,324,32,44,23,42,34};
		MergeSort mergeSort = new MergeSort();
		System.out.print("before sort: ");
		mergeSort.printArray(arr);
		
		mergeSort.initiate(arr);
		
		System.out.print("After sort: ");
		mergeSort.printArray(arr);
	}
	private void initiate(int[] arr) {
		partitioner(0, arr.length - 1, arr);
	}
	private void partitioner(int l, int r, int[] arr) {
		if(l < r) {
			int mid = (r + l) / 2;
			partitioner(l, mid, arr);
			partitioner(mid + 1, r, arr);
			merge(l, mid, r, arr);
		}
	}
	
	private void merge(int l, int mid, int r, int[] arr) {
		int n1 = mid  - l + 1;
		int n2 = r - mid;
		
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			arr1[i] = arr[l + i];
		}
		
		for(int i = 0; i < n2; i++) {
			arr2[i] = arr[mid + 1 + i];
		}
		
		int i = 0, j = 0, k = l;
		while(i < n1 && j < n2) {
			if(arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				i++;
			}
			else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
		
	}
	
	private void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
