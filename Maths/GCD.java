package Maths;

public class GCD {
	public static int p(int a, int b) {
		while (a > 0 && b > 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		if (a == 0) {
			return b;
		} else {
			return a;
		}
	}

	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		int gcd = p(a, b);
		System.out.println("gcd is " + gcd);
	}
}
