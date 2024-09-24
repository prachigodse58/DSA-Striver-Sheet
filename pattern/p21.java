package pattern;

public class p21 {
	public static void p(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i==0 || i==n-1 || j== n-1 || j==0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
public static void main(String[] args) {
	int n;
	p(5);
	
}
}
