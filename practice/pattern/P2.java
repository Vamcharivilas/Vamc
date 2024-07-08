package pattern;

import java.util.Scanner;

public class P2 {
//	Enter values of No.rows :
//		5
//
//		*
//		**
//		***
//		****
//		*****
	//wirte a program to print following pattern
	public static void main(String[] args) {//Scanner classwithin main
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of No.rows :");
		int r = sc.nextInt();
		for (int i = 0; i <= r; i++) {//to print no of rows
			for (int j = 0; j < i; j++) {//to print values in colswise
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
