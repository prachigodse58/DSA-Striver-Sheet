package pattern;

public class p14 {
	public static void p(int n) {
		
		for (int i = 1; i <= n; i++) {
			char ch ='A';
			for (int j = 1; j <=i ; j++) {
            	System.out.print( ch + " ");
				ch++;
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n;
		p(5);
	}
}
