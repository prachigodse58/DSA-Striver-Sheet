package BinarySearch;

public class RotateSearch {
	public static int R1(int []arr, int n , int target) {
		int low = 0; int high = n-1;
		int ans = -1;
		while(low<=high) {
			int mid = (low + high)/2;
			if (arr[mid]==target) {
				ans=mid;
                break;
			}//left
			else if (arr[low] <=arr[mid]) {
				if (arr[mid]>=target && target >= arr[low]) {
					high = mid-1;
				} else {
					low = mid+1;
				}

			}//right 
			else if (arr[high] >= arr[mid]) {
				if (arr[mid] <= target && target <= arr[high]) {
					low = mid+1;
				} else {
					high = mid -1;
				}

			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {7,8,9,1,2,3,4,5,6};
		int n = arr.length;
		int target = 6;
		System.out.println(R1(arr,n,target));
	}
}
