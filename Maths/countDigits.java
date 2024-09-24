package Maths;

public class countDigits {	
//
	public static int p(int n) {
		int count = 0;
		while (n > 0) {
			int last_digit = n % 10;
			count = count + 1;
			n=n/10;
		}
		return count;

	}

	public static void main(String[] args) {
		int n=7789;		
		System.out.println( "N :"+ n);
		int digits= p(n);
		System.out.println("Digits: "+ digits);
	}
}
