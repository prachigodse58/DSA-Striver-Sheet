package arrayEasy_Medium_Hard;

import java.util.ArrayList;
import java.util.Iterator;

public class moveZeroToEnd {

	public static int[] move(int arr[], int n) {
		int j = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}
		// no Non zero number
		if (j == -1) {
			return arr;
		}
		for (int i = j + 1; i < n; i++) {
			if (arr[i] != 0) {
				// swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
		int n = 10;
		System.out.println("Before rotating :");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("After rotating : ");
		move(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		// BRUTE FORCE METHOD

//	public static int[]  move(int arr[], int n ) {
//		
//		ArrayList<Integer> temp = new ArrayList<Integer>();
//		
//		for (int i = 0; i < n; i++) {
//			if (arr[i] != 0) {
//				temp.add(arr[i]);
//			}
//		}
//			int nz = temp.size();
//		for (int i = 0; i < nz; i++) {
//			arr[i]= temp.get(i);
//		}
//        for (int i = nz; i < n; i++) {
//			arr[i]= 0;
//		}
//        return arr;
//		}
//	
//	
//public static void main(String[] args) {
//	
//	int arr[] = {1,0,2,3,2,0,0,4,5,1 };
//	int n = arr.length;
//	System.out.println("Before rotating :");
//	for (int i = 0; i < n; i++) {
//		System.out.print(arr[i] + " ");
//	}
//	System.out.println();
//	System.out.println("After rotating : ");
//	move(arr, n);
//	for (int i = 0; i < n; i++) {
//		System.out.print(arr[i] + " ");
//	}
//	
	}
}
