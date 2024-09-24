package BinarySearch;

public class LowerBound {
	public static void L3(int arr[], int n , int target) {
		int low = 0; int high = n-1;
		int lowerbound = n;
		int upperbound= -1 ;
		while (low<=high) {
			int mid =(low +high)/2;
			if(arr[mid]==target) {
				upperbound = mid;
				lowerbound = mid;
				break;
			}
			if(arr[mid]<target) {
				upperbound = mid;
				low = mid+1 ;
			}
			if(arr[mid]>target){
				lowerbound = mid;
				high = mid-1 ;

			}
		} 

		System.out.println(lowerbound);
		System.out.println(upperbound);
	}
	//	public static int L2(int arr[], int n , int target) {
	//		int low = 0; int high = n-1;
	//		int upperbound= -1;
	//		while (low<=high) {
	//			int mid =(low +high)/2;
	//			if(arr[mid]==target) {
	//				upperbound = mid;
	//				break;
	//			}
	//			else if(arr[mid]<target) {
	//				upperbound = mid;
	//				low = mid+1 ;
	//			}else {
	//				high = mid-1 ;
	//			}
	//		} 
	//		return upperbound;
	//	}

	//	public static int L1(int arr[], int n , int target) {
	//		int low = 0; int high = n-1;
	//		int lowbound= n;
	//		while (low<=high) {
	//			int mid =(low +high)/2;
	//			if(arr[mid]==target) {
	//				lowbound = mid;
	//				break;
	//			}
	//			else if(arr[mid]>target) {
	//				lowbound = mid;
	//				high = mid-1;
	//			}else {
	//				low = mid+1;
	//			}
	//		} 
	//		return lowbound;

	//}
	public static void main(String[] args) {
		int arr[]= {1,2,3,3,5,8,8,9,9,10};
		int n = arr.length;
		int target = 7;
		//		int ans = L1(arr, n , target);
		//		int ans = L2(arr, n , target);
		L3(arr, n , target);

	}
}
