package BinarySearch;

public class Bouquet {
	public static int Max(int arr[]) {
		int maxi= Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			maxi = Math.max(maxi, arr[i]);
		}

		return maxi;
	}
	public static int Min(int arr[]) {
		int min= Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		return min;
	}
	public static boolean possible(int arr[], int Bouqu, int adj, int day) {
		int cnt=0;
		int NoofBouq = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] <= day ) {
				cnt++;
			}else {
				NoofBouq+=(cnt/adj);
				cnt=0;
			}
		}
		NoofBouq+=(cnt/adj);
		return NoofBouq>=Bouqu ;
	}
	public static int Garden (int arr[], int Bouqu, int adj) {
		int low = Min(arr); int high = Max(arr);
		int day= (low+high)/2;
		if ((adj*Bouqu)>Max(arr)) {
			return -1;
		}
		while (low<=high) {
			day = (low+high)/2;
			if(possible(arr,Bouqu, adj,day)) {
				high = day-1;
			}else {
				low= day+1;
			}
		}
		return low;

	}
	public static void main(String[] args) {
		int arr[] = {7,7,7,7,13,11,12,7};
		int Bouqu = 2;
		int adj = 3 ;
		System.out.println(Garden( arr, Bouqu ,adj));
	}
}
