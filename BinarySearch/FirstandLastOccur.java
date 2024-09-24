package BinarySearch;

public class FirstandLastOccur {
	public static void f3(int[] arr , int n , int target) {
		//first
		int first =-1;
		int low = 0; int high = n-1;
		while(low<=high) {
			int mid= (low+high)/2;
			if (arr[mid]==target) {
				first = mid;
				high= mid-1;
			}else if(arr[mid]<target) {
				low = mid+1;
				
			}else {
				high = mid-1;
			}
			}
		System.out.println(first);
		}
		
	
	public static void f2(int[] arr , int n , int target) {
		//last
		int last =-1;
		int low = 0; int high = n-1;
		while(low<=high) {
			int mid= (low+high)/2;
			if (arr[mid]==target) {
				last = mid;
				low= mid+1;
			}else if(arr[mid]>target) {
				high = mid-1;
				
			}else {
				low = mid+1;
			}
			}
		System.out.println(last);
		}
		
	
//	public static void f1(int[] arr , int n , int target) {
//		int first = -1;
//		int last = -1;
//		for (int i = 0; i < n; i++) {
//			if (arr[i]==target) {
//				if (first== -1) {
//					first = i;
//				}last=i;
//			}
//		}
//		System.out.println(first +" "+ last);
//	}
	public static void main(String[] args) {
		int arr[] = {1,3,5,8,8,8,10,14,19};
		int target = 8;
		int n = arr.length;
//		f1(arr, n, target);
		f2(arr, n, target);
		f3(arr, n, target);
	}
}
