package Maths;

import java.util.Scanner;

public class Reverse_Digit {
	public static int p() {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to get Reverse : ");
		n=sc.nextInt();
		int reverseNum=0;
		while(n>0) {
			int LastDigit=n%10;
			reverseNum= (reverseNum*10)+LastDigit;
			n=n/10;
		}
		return reverseNum;			
	}
public static void main(String[] args) {
	System.out.println("Reverse number is :"+p());
}
}
