package pattern;

public class p18 {
	public static void p(int n) {
		for (int i = 0; i < n; i++) {

			for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {

				System.out.print(ch + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n;
		p(5);
	}
}
