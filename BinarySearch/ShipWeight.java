package BinarySearch;

public class ShipWeight {
	
	public static int capacity(int wei[], int mid) {
		int load=0;
		int days= 1;
	  for (int i = 0; i < wei.length; i++) {
		  if ((wei[i]+load)>mid) {
			days=days+1;
			load=wei[i];
		}else {
			load+=wei[i];
		}
	}	
	  return days;
	}
	public static int a(int wei[], int Noofday) {
		int low = 10;int high= 55;
		while (low<=high) {
			int mid= (low+high)/2;
			if(capacity(wei, mid)<=Noofday) {
				high = mid-1; 
			}else {
				low= mid+1;
			}
		}
		return low;
	}
public static void main(String[] args) {
	int wei[] = {1,2,3,4,5,6,7,8,9,10};
	int Noofday= 5;
	System.out.println(a(wei, Noofday));
}
}
