package arrayEasy_Medium_Hard;

import java.util.HashMap;
import java.util.Map;

public class longestSubarray {
//	int arr[] = { 2, 3, 5, 1, 9 }; k=10
	public static int LongestSubArray(int arr[], long k) {
		//optimal
	    int n = arr.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = arr[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= arr[left];	
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += arr[right];
        }

        return maxLen;
    }
		
		//better
//		int n= arr.length;
//		Map<Long , Integer> preSumMap =new 	HashMap<>();
//		long sum= 0;
//		int maxLen =0;
//		for (int i = 0; i < n; i++) {
//			sum+=arr[i];
//			if (sum==k) maxLen = Math.max(maxLen, i+1);
//				
//			long rem = sum - k;
//			
//			if (preSumMap.containsKey(rem)) {
//		       int len = i - preSumMap.get(rem);
//		       maxLen = Math.max(maxLen, len);
//			}
//			
//			if (!preSumMap.containsKey(sum)) {
//				preSumMap.put(sum, i);
//			}
//			
//		}
//		return maxLen;
		//brute
//		int n = arr.length;
//		int len = 0;
//		for (int i = 0; i < n; i++) {
//			for (int j = i; j < n; j++) {
//				int sum = 0;
//				for (int K = i; K <= j; K++) {
//					sum += arr[K];
//				}
//				if (sum == k2)
//					len = Math.max(len, j - i + 1);
//			}
//		}
//		return len;
	
	

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 1, 9 };
		long k = 10;
		int ans = LongestSubArray(arr, k);
		System.out.print(" Longest Subarray is : " + ans);
	}
}
