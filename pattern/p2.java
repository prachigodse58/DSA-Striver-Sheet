package pattern;

public class p2 {
	 static void pattern(int N){
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	int N;
 pattern(5);
}
}