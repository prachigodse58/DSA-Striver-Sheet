package BasicRecurssion;

import java.util.Scanner;

//reverse
public class Reverse {
	public static void p(int i, int n) {
		if (i < 1) {
			return;
		}
		System.out.println(i);
		p(i - 1, n);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n :");
		int n = sc.nextInt();
		p(n, n);// 3
	}
}
