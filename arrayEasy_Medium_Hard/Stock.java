package arrayEasy_Medium_Hard;

public class Stock {
	public static int stock(int arr[], int n) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);//7,
			max= Math.max(max, arr[i]- min);//
		}
//		int max= 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if (arr[j]>arr[i]) {
//				    max = Math.max(max, arr[j]-arr[i] );	
//				}		
//			}
//		}	
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {7,1,5,3,6,4};

		int n = arr.length;
		int ans=stock(arr,n);
		System.out.println(ans);
	}
}
