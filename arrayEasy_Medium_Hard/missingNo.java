package arrayEasy_Medium_Hard;

public class missingNo {
	public static int missing(int[] arr, int n) {
		//2nd optimal
		
		
		//optimal : by using summation 
		int summa = (n*(n+1))/2;
		int s2=0;
		
		for (int i = 0; i < n-1; i++) {
			s2+=arr[i];
		}
		int diff= summa - s2;
		return diff;
		//better
//		int hash[]= new int[n+1]; 
//		
//		for (int i = 0; i < n-1; i++) 
//			hash[arr[i]]++;
//			
//		for (int i = 1; i <= n; i++) {
//			if (hash[i]==0) {
//				return i;
//			}
//		}
		
// brute force
//		for (int i = 1; i <= n; i++) {
//			int flag = 0;
//			for (int j = 0; j < n - 1; j++) {
//				if (arr[j] == i) {
//					flag = 1;
//					break;
//				}
//			}
//			if (flag == 0)
//				return i;
//
//		}
		// this following line will never execute
//		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5 };
		int n = 5;
		int ans = missing(arr, n);
		System.out.print(" Missing Number is :" + ans);
	}
}
