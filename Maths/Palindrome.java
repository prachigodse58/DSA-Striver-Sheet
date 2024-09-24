package Maths;

public class Palindrome {
	public static boolean p(int n) {
		int duplicate = n;
		int ReverseNum = 0;
		while (n > 0) {
			int LastDigit = n % 10;
			ReverseNum = (ReverseNum * 10) + LastDigit;
			n = n / 10;
		}
		if (duplicate == ReverseNum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n = 4554;
		if (p(n)) {
			System.out.println(n + " is a Palindrome");
		} else {
			System.out.println(n + " is not a Palindrome");
		}

	}
}
