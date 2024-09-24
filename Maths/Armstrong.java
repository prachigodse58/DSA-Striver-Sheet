package Maths;

public class Armstrong {
	public static int armstrong(int n) {
		int sqr=0;
		while (n>0) {
		int LastDigit = n% 10;
		sqr = sqr+(LastDigit* LastDigit);
		n=n/10;
		}
		return sqr;
	}
public static void main(String[] args) {
	int  n=1213;
	System.out.println("Armstrong Number is :"+armstrong(n));
}
}
