package insertionsort;

import java.util.Scanner;

public class InsertionSort {

	public static void insertionSort(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && temp < arr[j]) {

				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = temp;

		}

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values of :" + n);
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		insertionSort(arr, n);
		for (int i : arr) {

			System.out.print(i + " ");
		}

	}

}
