package arrayEasy_Medium_Hard;

public class LinearSearch {
	public static int linear(int[] arr,int num, int n) {
		for (int i = 0; i < n; i++) {
			if (arr[i]==num) {
				return i;
			}
		}
		return -1;
				 
	}
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	int n = arr.length;
	int num = 4 ;
	System.out.println("Before finding element :");
	for (int i = 0; i < n; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	System.out.println("element is on index  : ");
	
	System.out.println(linear(arr , num, n));
	
}
}
