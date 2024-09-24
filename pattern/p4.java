package pattern;

import java.util.Iterator;

public class p4 {
	static void pattern(int N) {
		for (int i = 1; i <=N; i++) {//1,2, 3,4
			for (int j = 1; j <=i; j++) {//1,1 2,123,1234
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	int N;
	pattern(5);
}
}
