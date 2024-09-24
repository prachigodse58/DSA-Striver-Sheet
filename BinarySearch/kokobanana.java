package BinarySearch;

public class kokobanana {
	public static int findMax(int arr[], int n) {
		int maxi = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			maxi = Math.max(maxi, arr[i]);
		}
		return maxi;
	}
	public static int f(int arr[], int n, int mid) {
		int totalHours = 0;
		for (int i = 0; i < n; i++) {
			totalHours += (int)Math.ceil((double)arr[i] / mid);
		}
		return totalHours;
	}
	public static int k(int arr[], int hours, int n) {
		int low = 1; 
		int high = findMax(arr, n); 
		while (low <= high) {
			int mid = (low + high) / 2;
			int totalHours = f(arr, n, mid);

			if (totalHours <= hours) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low; 
	}
	public static void main(String[] args) {
		int arr[] = {3, 6, 7, 11};
		int n = arr.length;
		int hours = 8;
		System.out.println(k(arr, hours, n));
	}
}
