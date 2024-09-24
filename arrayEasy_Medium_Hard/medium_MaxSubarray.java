package arrayEasy_Medium_Hard;



public class medium_MaxSubarray {
	public static long maxSubarray(int[] arr , int n) {
	     long maxi = Long.MIN_VALUE;
	     int sum =0;
	     
	     for (int i = 0; i < n; i++) {
			sum+=arr[i];
			
			if (sum>maxi) {
				maxi= sum;
			}
			
			if (sum<0) {
				sum=0;
			}
		}
	     return maxi;
	}
public static void main(String[] args) {
	int arr[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	int n = arr.length;
	long ans = maxSubarray(arr , n);
	System.out.println(ans);
}
}