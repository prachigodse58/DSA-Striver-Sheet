package pattern;

public class p7 {
	
	static void pattern (int N) {
		for (int i = 0; i <N; i++) {
			//space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			//star
			for (int j = 0; j < 2*N-(2*i+1); j++) {
				System.out.print("*");
			}
			//space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
//	int N;
	pattern(5);
}
}
