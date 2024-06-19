package labs;

import java.util.Scanner;

public class SumOfOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size = sc.nextInt();
		int a[] = new int[size];//sizing  Array Dynamically by Scanner class
		System.out.println("Enter the Elements of Array:");

		for (int i = 0; i < a.length; i++) {//for used to get value of each index
			System.out.println("Enter the value of a[ " + i + "]");
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {// used for to display array
			if (a[i] % 2 == 1 && a[i] > 0) {// if used to check odd+ve
				sum += a[i];
			}
		}
		System.out.println(sum);
	}

}
