package BasicRecurssion;

//fibonaci series
public class multipleRZecurssion {
	public static int f(int n) {
		if (n <= 1)
			return n;
		int last = f(n - 1);
		int start = f(n - 2);
		return (start + last);
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(f(n));
	}
}
