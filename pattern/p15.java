package pattern;

public class p15 {
	public static void p(int n) {
		for (int i = 0; i < n; i++) {			
			for (char ch= 'A'; ch<= 'A'+(n-i-1);ch++) {
				System.out.print(ch+" ");
				
			}
//		for (int i = 1; i <= n; i++) {
//			char ch='A';
//			for (int j= n; j>= i;j--) {
//				System.out.print(ch+" ");
//				ch++;
//			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	int n;
	p(5);
}
}
