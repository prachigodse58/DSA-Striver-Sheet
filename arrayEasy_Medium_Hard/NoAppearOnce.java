package arrayEasy_Medium_Hard;

import java.util.HashMap;
import java.util.Map;

public class NoAppearOnce {
	public static int appear(int[] arr) {
		
		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];	
			
		}
		return xor;
		
		//better approach 2
//		HashMap<Integer, Integer> mpp = new HashMap<>();
//		for (int i = 0; i < arr.length; i++) {
//			int value =mpp.getOrDefault(arr[i], 0);
//			mpp.put(arr[i],value+1);
//		}
//		
//		for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
//			if(it.getValue()==1) {
//				return it.getKey();
//			}
//		}
		//better
//		int n = arr.length;
//		int maxi = arr[0];
//		
//		for (int i = 0; i < n; i++) {
//			maxi = Math.max(arr[i], maxi);
//		}
//		int hash[] = new int[maxi + 1];
//		for (int i = 0; i < hash.length; i++) {
//			hash[arr[i]]++;
//		}
//		for (int i = 0; i < hash.length; i++) {
//			if (hash[arr[i]]==1) {
//				return arr[i];
//				}
//		}
		//brute
//		for (int i = 0; i < arr.length; i++) {
//			int count = 0;
//			int num = arr[i];
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j] == num) {
//					count++;
//				} else {
//				}
//			}
//			if (count == 1)
//				return num;
//		}
//		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 1, 2 };
		int ans = appear(arr);
		System.out.print(ans);
	}
}
