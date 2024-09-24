package BinarySearch;

public class AgressiveCow {
	public static int min (int arr[], int cows) {
		int low=1;
		int high = 10;
		while (low<=high){
			int mid= (low+high)/2;
			if (placeCow(arr,cows, mid) == true ) {
				low= mid+1;
			} else {
				high = mid-1;
			}
		}
		return high;
	}
	public static boolean placeCow(int arr[], int cows,int mid) {
		int n =arr.length;
		int cnt= 1;
		int last = arr[0];
		for (int i = 1; i < n; i++) {
			if ((arr[i]-last )>=mid) {
				cnt++;
				last = arr[i];
			}
		}
		if (cnt>=cows ) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int arr[]= {0,3,4,7,9,10};
		int cows=4;
		System.out.println(min (arr, cows));
	}
}
