package pattern;

import java.util.Iterator;

public class p12 {
	public static void p(int n) {
		int space = 2 * (n - 1);
		for (int i = 1; i <= n; i++) {
			// number
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			// space
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			// number
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			space -= 2;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n;
		p(4);
	}
}
