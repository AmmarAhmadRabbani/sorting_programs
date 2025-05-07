package mergesort;

import java.util.Scanner;

// Divide and Merge
public class MergeSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values of :" + n);
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		mergeSort(arr, 0, n - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void merge(int[] arr, int left, int mid, int right) {

		int low = mid - left + 1;
		int high = right - mid;

		int leftArray[] = new int[low];
		int rightArray[] = new int[high];
		for (int i = 0; i < low; i++)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < high; j++)
			rightArray[j] = arr[mid + 1 + j];

		int i = 0, j = 0;

		int k = left;
		while (i < low && j < high) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < low) {
			arr[k++] = leftArray[i++];
//			i++;
//			k++;
		}

		while (j < high) {
			arr[k++] = rightArray[j++];
//			j++;
//			k++;
		}

	}

	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {

			int mid = (left + right) / 2;
			mergeSort(arr, left, mid); // left half
			mergeSort(arr, mid + 1, right); // right half
			merge(arr, left, mid, right); // merging sorted halves
		}
	}

}
