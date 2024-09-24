package arrayEasy_Medium_Hard;

import java.util.ArrayList;
import java.util.Arrays;
// Optimal method usinf Dutch National Algorithm
public class mediuym_sort123 {
	public static void sortArray(ArrayList<Integer> arr,int n){
		int low = 0, mid= 0 , high= n-1;
		while(mid <= high) {
			// swap mid and low
			if(arr.get(mid)==0) {
			int temp = arr.get(mid);
			arr.set(mid, arr.get(low)) ;
			arr.set(low, temp);
			
			low++;
			mid++;
		}
			else if(arr.get(mid)==1) {
			mid++;
		}else {
			//swap miid and high
			int temp = arr.get(mid);
			arr.set(high, arr.get(mid) );
			arr.set(mid, arr.get(temp));
			
			high--;
		}
		}
		
	}
public static void main(String[] args) {
	int n= 6;
	ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
	sortArray(arr, n);
	for (int i = 0; i < n; i++) {
		System.out.print(arr.get(i)+" ");
	}
	System.out.println();
}
}
