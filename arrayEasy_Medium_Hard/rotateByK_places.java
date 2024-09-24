package arrayEasy_Medium_Hard;

public class rotateByK_places {
	public static void reverse(int arr[], int start, int end) {
		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void rotate(int arr[], int n, int k) {
		// reverce from 0 to 4
		reverse(arr, 0, n - k - 1);
		// reverse from 5 to 6
		reverse(arr, n - k, n - 1);
		// reverse whole array
		reverse(arr, 0, n - 1);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int k = 2;
		System.out.println("Before rotating :");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("After rotating : ");
		rotate(arr, n, k);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

//	public static void rotate(int[] arr, int n, int k) {
//		// saving index 0 and 1
//		int[] temp = new int[k];
//		for (int i = n - k; i < n; i++) {
//			temp[i - n + k] = arr[i];
//		}
//		// shifting from index 2 to 7
//		for (int i = n - k - 1; i >= 0; i--) {
//			arr[i + k] = arr[i];
//		}
//		for (int i = 0; i < k; i++) {
//			arr[i] = temp[i];
//		}
//	}
//
//	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
//		int n = arr.length;
//		int k = 2;
//		System.out.println("Before rotating :");
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		System.out.println("After rotating : ");
//		rotate(arr, n, k);
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
}
