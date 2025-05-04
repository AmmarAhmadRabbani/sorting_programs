package bubblesort;

import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int arr[], int n) {

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the value of n:" + n);
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		bubbleSort(arr, n);
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
