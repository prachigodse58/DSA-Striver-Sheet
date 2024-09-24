package BinarySearch;

public class SingleElement {
	public static int R1(int arr[], int n) {
		int low = 1;
		int high = n-2;
		if (arr[0]!=arr[1]) return arr[0];
		if(arr[n-1]!=arr[n-2] ) return arr[n-1];
		while (low<=high) {
			int mid=(low+high)/2;
			if (arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) {
				return arr[mid];
			} //left
			else if((mid%2 == 0 && arr[mid]==arr[mid+1]) || (mid%2 ==1 && arr[mid]==arr[mid-1]) ){
				low = mid+1;
			}else {
				high= mid-1;
			}
		}
		return -1;

	}
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,4,5,5,6,6,7,7};
		int n = arr.length;
		System.out.println(R1(arr,n));
	}
}
