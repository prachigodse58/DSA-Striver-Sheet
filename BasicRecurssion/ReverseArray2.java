package BasicRecurssion;

import java.util.Iterator;

public class ReverseArray2 {
	static void print(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	static void reverse(int arr[], int n) {
		int p1 = 0;
		int p2 = n - 1;
		while (p1 < p2) {
			int temp = arr[p1];
			arr[p1] = arr[p2];
			arr[p2] = temp;
			p1++;
			p2--;
		}
		print(arr, n);
	}

	public static void main(String[] args) {
		int n = 5;
		int arr[] = { 1, 2, 3, 1, 4 };
		reverse(arr, n);
	}
}
