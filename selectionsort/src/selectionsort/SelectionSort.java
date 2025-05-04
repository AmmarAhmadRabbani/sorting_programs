package selectionsort;

import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int arr[], int n) {
		for (int i = 0; i <= n - 1; i++) {
			int min = i;
			for (int j = i; j <= n - 1; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}

			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter the size of an array:");
		int n = scanner.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the value of" + n + " :");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();

		}

		selectionSort(arr, n);
	}

}
