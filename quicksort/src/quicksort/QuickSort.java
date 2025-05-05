package quicksort;

import java.util.Scanner;

public class QuickSort {

	public static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			// Find pivot index
			int pivot = partition(arr, low, high);

			// Recursively sort elements before and after partition
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
		}

	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // the last element as pivot
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the value of :" + n);
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		quickSort(arr, n, n);
		for (int i : arr) {

			System.out.print(i + " ");
		}

	}

}
