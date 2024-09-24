package arrayEasy_Medium_Hard;

import java.util.Arrays;
import java.util.HashMap;

public class Medium_twoSum {
	public static String twoSum(int n, int arr[], int target) {
		// optimal

		Arrays.sort(arr);
		int left = 0;
		int right = n - 1;

		while (left < right) {
			int sum = arr[left] + arr[right];

			if (sum == target) {
				return "yes";
			} else if (sum < target)
				left++;
			else
				right--;
		}
		return "No";

//		int[] ans = new int[2];
//		ans[0]=ans[1]=-1;
//		HashMap<Integer,Integer> mpp= new HashMap<>();
//		for (int i = 0; i < arr.length; i++) {
//			int num= arr[i];
//			int moreNeeded = target - num;
//			if (mpp.containsKey(moreNeeded)) {
//				return "Yes";
//				arr[0]=mpp.get(moreNeeded);
//				arr[1]=i;
//			    return ans;
//			}
//			mpp.put(arr[i], i);
//		}
//		return ans;
//		return "No";

		// Brute 2
//	       int[] ans = new int[2];
//	        ans[0] = ans[1] = -1;
//	        for (int i = 0; i < n; i++) {
//	            for (int j = i + 1; j < n; j++) {
//	                if (arr[i] + arr[j] == target) {
//	                    ans[0] = i;
//	                    ans[1] = j;
//	                    return ans;
//	                }
//	            }
//	        }
//	        return ans;

		// Brute part 1
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] + arr[j] == target) {
//					return "Yes";
//				}
//			}
//		}
//
//		return "No";
	}

	public static void main(String[] args) {
		// brute approach
		int n = 5;
		int[] arr = { 2, 6, 5, 8, 11 };
		int target = 14;
		String ans = twoSum(n, arr, target);
		System.out.println(ans);
//	        System.out.println(arr[0]+","+arr[1]);
//	        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
//	                           + ans[1] + "]");
//		String ans = twoSum(arr, n, target);

	}
}
