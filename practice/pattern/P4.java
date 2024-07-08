package pattern;

import java.util.Scanner;

public class P4 {
//	Enter values of No.space :
//		-1
//		Enter values of No.star :
//		11
//		*********
//		 *******
//		  *****
//		   ***
//		    *
	//wirte a program to print following pattern
	public static void main(String[] args) {//Scanner classwithin main
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of No.space :");
		int space = sc.nextInt();
		System.out.println("Enter values of No.star :");
		int star = sc.nextInt();
		for (int i = 0; i < 5; i++) {//to print no of rows
			space++;
			star-= 2;
			for (int j = 0; j < space; j++) {//to print values in colswise

				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {//to print values in colswise

				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}

}
