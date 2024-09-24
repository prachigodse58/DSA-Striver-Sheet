package BinarySearch;

public class RotatedIndex {
	public static void R1(int [] arr, int n){
		int low= 0; int high = n-1;
		int ans = Integer.MAX_VALUE;
		while (low<=high) {
			int mid= (low+high)/2;
			//left
			if (arr[low]<arr[mid]) {
				ans = Math.min(ans, arr[low]);
				low = mid+1;
			} else if(arr[high]>arr[mid]){
			    ans= Math.min(ans, arr[high]);
				high = mid-1;
			}
		}
		System.out.println(ans);
		
	}
	public static void main(String[] args) {
		int arr[]= {7,8,9,3,4,5,6};
		int n = arr.length;
		R1(arr,n);
	}
}
