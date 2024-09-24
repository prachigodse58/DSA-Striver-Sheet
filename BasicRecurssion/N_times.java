package BasicRecurssion;

import java.util.Scanner;

//Print recurssion N times
public class N_times {

	public static int p(int i, int n) {
		if (i > n)
			return n;
		System.out.println(i);
		//i++;
		p(i+1, n);
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n : ");
		int n = sc.nextInt();
		p(1, n);// 3
	}
}
