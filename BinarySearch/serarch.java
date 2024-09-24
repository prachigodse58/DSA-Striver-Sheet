package BinarySearch;

public class serarch {
	public static int b2( int[] arr,int low ,int high, int target ) {
		
		if(low>high) 
			return -1;
		int mid = (low + high)/2;
		if(arr[mid]== target) return mid;
		if (arr[mid]<target) return b2(arr, mid+1, high , target);
		if (arr[mid]>target) return b2(arr , mid-1 , high , target);
		return -1;
		
	}
	
	
//	public static int b(int[] arr , int n, int target) {
//		int low=0 ;
//		int high = n-1;
//		while (low <= high) {
//			int mid= (low+high)/2;
//			if (arr[mid]==target) return mid;
//			else if (arr[mid]<target) {
//				low= mid + 1;
//				mid= (low+high)/2;
//			}
//			else { high = mid-1;
//			       mid = (low + high)/2;
//			}	
//		}	
//		return -1;
//	}
 public static void main(String[] args) {
	int [] arr = {1,2,3,4,5,6,7,8,9,10};
	int target = 13;
	int n= arr.length;
	int low = 0;
	int high = n-1;
	int ans =b2(arr,low, high, target);
	System.out.println("Index of targeted element="+ans);
}
}
