package Basic_Hashing;

import java.util.Scanner;

public class Hasing1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size if an array");
		int n = sc.nextInt();
		System.out.println("Enter the array elelments ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// precompute
		int hash[] = new int[13];
		for (int i = 0; i < n; i++) {
			hash[arr[i]] += 1;
		}

		int q;
		System.out.println("Enter query size");
		q = sc.nextInt();
		System.out.println("enter queries");
		while (q-- != 0) {
			int number;
			number = sc.nextInt();
			// fetching
			System.out.println("Fetched elements :" + hash[number]);
		}
	}
}
