package BinarySearch;

public class KthMissing {
	public static int missing(int arr[], int n, int k) {

		int low= 0; int high = n-1;
		while (low<=high) {
			int mid=(low+high)/2;
			int missin = arr[mid]-(mid+1); //1
			if (missin < k) {
				low= mid+1;
			} else {
				high = mid-1;
			}
		}
		return low+k;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,4,7,11};
		int n = arr.length;
		int k = 5;
		System.out.println(missing(arr,n, k));
	}
}
