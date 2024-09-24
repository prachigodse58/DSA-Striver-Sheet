package BasicRecurssion;

import java.util.Scanner;

//1 to n backtack
public class BasicBacktrack {
	public static void f(int i , int n){
		if (i<1) {
			return;
		}
		f(i-1,n);
		System.out.println(i);
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value :");
	int n = sc.nextInt();
	f(n,n);
}
}
