package Maths;

import java.util.ArrayList;

public class Divisor {
	public static ArrayList<Integer> findDivisors(int n) {
		ArrayList<Integer> divisors = new ArrayList<>();
		int sqrtN = (int) Math.sqrt(n);
		for (int i = 1; i <= sqrtN; ++i) {
			if (n % i == 0) {
				divisors.add(i);
				if (i != n / i) {
					divisors.add(n / i);
				}
			}
		}
		return divisors;
	}

	public static void main(String[] args) {
		int number = 12;
		ArrayList<Integer> divisors = findDivisors(number);

		System.out.print("Divisors of " + number + " are: ");
		for (int divisor : divisors) {
			System.out.print(divisor + " ");
		}
		System.out.println();
	}
}
