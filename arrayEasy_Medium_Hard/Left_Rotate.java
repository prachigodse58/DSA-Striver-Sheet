package arrayEasy_Medium_Hard;
//left rotate an array by one

public class Left_Rotate {
	
	public static void rotate(int arr[], int n) {
		int first =arr[0];
		
		int i;
		for ( i=0;i < n-1; i++) {
			arr[i]=arr[i+1];
		}
	    arr[n-1]=first;
	}
	
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int n = arr.length;
	System.out.println("Before sorting :");
	for (int i = 0; i < n; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println("After sorting : ");
	rotate(arr ,n);
	for (int i = 0; i < n; i++) {
		System.out.print(arr[i] + " ");
	}
}
}
