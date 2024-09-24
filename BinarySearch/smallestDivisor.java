package BinarySearch;

public class smallestDivisor {
	public static int max(int arr[]) {
		int maxi= Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			maxi = Math.max(maxi, arr[i]);
		}
		return maxi;
	}
	public static int sum(int arr[], int mid) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+= Math.ceil((double)(arr[i])/(double)(mid));
		}		
		return sum;
	}
	public static int divisor(int[] arr, int threshold) {
		int low = 1;
		int high =max(arr);
		
		while(low<=high) {
			int mid = (low+high)/2;//(1,2,3,4,5,6,7,8,9)
			if (sum(arr, mid)<=threshold) {
				
				high= mid-1;
			}else {
				low= mid+1;
			}
		}
		return low;
		
	}
public static void main(String[] args) {
	int arr[]= {1,2,5,9};
	int threshold= 6;
	System.out.println(divisor(arr, threshold));
}
}
