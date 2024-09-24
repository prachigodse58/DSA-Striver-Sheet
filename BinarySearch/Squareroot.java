package BinarySearch;

public class Squareroot {
	public static int S1(int arr[], int n , int x) {
		int low = 0;
		int high = n-1;
		int ans = 0;
		while (low<high) {
			int mid= (low+high)/2;
			if ((mid*mid)<=x) {
				ans= mid;
				low=mid+1;
			} else {
				high = mid-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};//0/p-10
		int n = arr.length;
		int x = 28;
		System.out.println(S1(arr,n , x));
	}
}
