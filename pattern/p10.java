package pattern;

public class p10 {

	public static void p(int n) {

		for (int i = 1; i <= 2 * n - 1; i++) {// 1<9,2<8,3<7,4<6,5<5I
			int star = i;// star=5
			if (i > n) // 6>5,7>5...
				star = 2 * n - i;// 4,3,2,1

			for (int j = 1; j <= star; j++) {
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
