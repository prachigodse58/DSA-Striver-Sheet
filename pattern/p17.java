package pattern;

public class p17 {
	public static void p(int n) {
		//space
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n-i-1; j++) {
				System.out.print(" ");
			}
		
		//letters1
			char ch='A';
			int breakpoint= (2*i+1)/2;
			for (int j= 0; j< 2*i+1;j++) {
				System.out.print(ch);

				if (j<=breakpoint) ch++;
				else ch--;
			}
		//space
			for (int j =0 ; j < n-i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	int n;
	p(5);
}
}
