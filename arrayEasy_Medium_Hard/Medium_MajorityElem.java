package arrayEasy_Medium_Hard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Medium_MajorityElem {
	public static int MajorityElem(int[] v) {
		// Moore's Voting Algorithm
		int e1= 0;
		int cnt = 0;
		int n= v.length;
		for (int i = 0; i < v.length; i++) {
			
			if( cnt == 0) {
				e1= v[i];
				cnt=1;
			} else if(e1==v[i])cnt++;
			else cnt++;
		}
		//checking if the stored element is majority element 
		int cnt1= 0;
		for (int i = 0; i < n; i++) {
			if(v[i]==e1) {
				cnt1++;
			}
			if (cnt1>(n/2)) {
				return e1;
			}
			
		}
		
		
		//using HASHMAP
//		int n = v.length;
//		HashMap<Integer, Integer> mpp = new HashMap<>();
//		for (int i = 0; i < n; i++) {
//			int value = mpp.getOrDefault(v[i], 0);
//			mpp.put(v[i], value + 1);
//		}
//
//		for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
//			if (it.getValue() > (n / 2)) {
//				return it.getKey();
//			}
//
//		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
		int ans = MajorityElem(arr);
		System.out.print(ans + " is Majority Element  ");
	}
}
