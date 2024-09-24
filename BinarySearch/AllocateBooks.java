package BinarySearch;

public class AllocateBooks {
	public static int Add(int arr[] , int mid ) {
		int cnt=1;
		int pages=0;
		for (int i = 0; i < arr.length; i++) {
			if(pages+arr[i]<=mid) {
				pages += arr[i];
			} else {
				cnt++;
				pages = arr[i];
			}
		}
		return cnt;
	}
	public static int place (  int arr[], int n , int NoStud) {
		int low = 49;
		int high = 172;//
		while (low<=high) {
			int mid = (low+high)/2;
			
			if (Add(arr, mid)<=NoStud) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return low;
	}	
	public static void main(String[] args) {
		int [] arr= {25,46,28,49,24};
		int n = arr.length;
		int NoStud = 4;
		System.out.println(place(arr, n, NoStud));
	}
}
