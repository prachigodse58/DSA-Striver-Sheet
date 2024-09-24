package Maths;

public class Prime {
	
	public static boolean p(int n) {
		int count= 0;
		for (int i = 1; i < Math.sqrt(n); i++) {
			if (n%i==0) {
				count = count + 1;
				if (n/i != i) {
					count = count+1;
				}	
			}
		}
		if (count==2) {
			return true;
		} else {
			return false;
		} 
	}
public static void main(String[] args) {
	int n=17;
	boolean primeNumber = p(n);
	if (primeNumber) {
		System.out.println(n+ " is Prime");
	} else {
		System.out.println(n+ " is not Prime");
	}
	
}
}
