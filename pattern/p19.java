package pattern;

public class p19 {
	public static void p(int n) {
		// pattern 1
		for (int i = 0; i < n; i++) {
			// star
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			// space
			for (int j = 0; j < 2 * i; j++) {
				System.out.print(" ");
			}
			// star
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		// pattern2
		for (int i = 0; i < n; i++) {
			// star
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			// space
			for (int j = 0; j < 2 * (n - i) - 2; j++) {
				System.out.print(" ");
			}
			// star
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n;
		p(5);
	}
}
