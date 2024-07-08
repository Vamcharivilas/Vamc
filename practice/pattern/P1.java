package pattern;

import java.util.Scanner;

public class P1 {
//	Enter values of No.rows :
//		5
//		Enter values of No.columns :
//		5
//		*****
//		*****
//		*****
//		*****
//		*****
//wirte a program to print following pattern
	public static void main(String[] args) {//Scanner classwithin main
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of No.rows :");
		int r = sc.nextInt();
		System.out.println("Enter values of No.columns :");
		int c = sc.nextInt();
		for (int i = 0; i < r; i++) {//to print no of rows
			for (int j = 0; j < c; j++) {//to print values in colswise
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
