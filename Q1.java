package A5;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		System.out.println("Enter an integer from 2 to 100: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		isPrime(n);
		scan.close();
	}
	public static void isPrime(int n) {
		for (int i = 1; i < n; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++)
				if (i%j == 0) {
					isPrime = false;
					break;
				}
			if (isPrime == true)
				System.out.println(i);
		}
	}

}
