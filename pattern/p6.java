package pattern;

public class p6 {
static void pattern(int N) {
	for (int i = 0; i<N; i++) {//1
		for (int j = 1; j<N-i+1; j++) {
			System.out.print( j+" " );
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	int N;
	pattern(5);
}
}