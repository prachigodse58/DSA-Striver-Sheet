package BinarySearch;

public class PeakElement {
	public static int R1(int arr[], int n) {
		if (arr[0]>arr[1]) return arr[0];
		if (arr[n-1]>arr[n-2]) return arr[n-1];
		int low = 1; int high = n-2;
		while (low<=high) {
			int mid= (low+high)/2;
			if (arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) return arr[mid];
			if (arr[mid-1] < arr[mid]) {
				low= mid+1;
			} else{
				high= mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,10,13,7,6,5,4,2,1,0,16,44};//0/p-10
		int n = arr.length;
		System.out.println(R1(arr,n));
	}
}
