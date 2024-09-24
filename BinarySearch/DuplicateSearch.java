package BinarySearch;

public class DuplicateSearch {
	public static int R1(int []arr , int n , int target) {
		int low =0;
		int high = n-1;
		int ans= -1;
		while (low<= high) {
			int mid = (low+high)/2;
			if (arr[mid]==target) {
				return mid;
			}
			if(arr[mid] == arr[low] && arr[low] == arr[high]) {
				low= low+1;
				high = high-1;
			}
			//left
			else if (arr[mid]>arr[low]) {
				if (arr[low]<=target && arr[mid]>target) {
					high= mid-1;
				}else {
					low= mid+1;
				}
			}//right
			else if (arr[mid]<arr[high]) {
				if (arr[high]>target && arr[mid]<=target) {
					low= mid+1;
				} else {
					high= mid-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8,9,1,2,3,4,4,4};
		int n = arr.length;
		int target = 4;
		System.out.println(R1(arr,n,target));
	}
}
