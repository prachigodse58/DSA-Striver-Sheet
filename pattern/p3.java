package pattern;

public class p3 {
	static void pattern(int N) {
		for(int i = 1;i<=N;i++) {//1,2,3
           for (int j = 1; j <=i ; j++) {//1,1 2,1 2 3,
			System.out.print(j+" ");
		}
           System.out.println();
		}
	}
public static void main(String[] args) {
	int N;
	pattern(5);
}
}
