package pattern;

public class p5 {
static void pattern(int N) {
	for (int i = 0; i<N; i++) {//1
		for (int j = N; j>i ; j--) {
			System.out.print( " * ");//54321
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	int N;
	pattern(5);
}
}