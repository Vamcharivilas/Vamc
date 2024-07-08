package pattern;

import java.util.Scanner;

public class P5 {
//	Enter values of No.space :
//		10
//		Enter values of No.star1 :
//		5
//		Enter values of No.star2 :
//		5
//		*****          *****
//		*****          *****
//		*****          *****
//		*****          *****
//		*****          *****
	//wirte a program to print following pattern
	public static void main(String[] args) {//Scanner classwithin main
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of No.space :");
		int space = sc.nextInt();
		System.out.println("Enter values of No.star1 :");
		int star1 = sc.nextInt();
		System.out.println("Enter values of No.star2 :");
		int star2 = sc.nextInt();
		for (int i = 0; i < 5; i++) {//to print no of rows
			for (int j = 0; j < star1; j++) {//to print values in colswise
				System.out.print("*");
			}
			for (int j = 0; j < space; j++) {//to print values in colswise
				System.out.print(" ");
			}
			for (int j = 0; j < star2; j++) {//to print values in colswise
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
