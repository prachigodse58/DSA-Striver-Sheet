package BinarySearch;

public class minBinarySearch {
	public static int R1(int[] arr, int n){
		int low = 0; int high = n-1;
		int ans = Integer.MAX_VALUE;
		while (low<=high) {
			int mid=(low+high)/2;
//			if (arr[low]< arr[high]) {
//				return arr[low];
//			}
			if (arr[mid]>=arr[low]) {
				ans = Math.min(ans, arr[low]);
				low = mid+1;
			}else if (arr[mid]<=arr[high]) {
				ans = Math.min(ans,arr[mid]);
				high =mid-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {7,8,9,3,4,5,6};
		int n = arr.length;
		System.out.println(R1(arr,n));
	}
}
