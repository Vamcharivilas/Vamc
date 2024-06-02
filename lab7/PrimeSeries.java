package labs;

import java.util.Scanner;

public class PrimeSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit number: ");
		int limit = sc.nextInt();

		System.out.println("Prime No are:");

		for (int i = 2; i <= limit; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}
	public static boolean isPrime(int i) {
		if (i <= 1) {
			return false;
		}
		for (int j = 2; j <= i/2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
