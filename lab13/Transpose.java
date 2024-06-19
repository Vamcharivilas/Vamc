package labs;

import java.util.Iterator;
import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of rows and column:");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
     int a[][]=new int[rows][cols];
     for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.println("enter the value of each index ["+i+"]["+j+"]");
			a[i][j]=sc.nextInt();
		}
	}
 	for (int i = 0; i <rows; i++) {
		for (int j = 0; j <cols; j++) {
			System.out.print(a[i][j]+"  ");
			
		}
		System.out.println();
	}
 	System.out.println("To get Transpose given matrix is :");
 	int b[][] = new int[cols][rows];
 	for (int i = 0; i <cols; i++) {
	 for (int j = 0; j <rows; j++) {
		b[i][j]= a[j][i];
		 System.out.print(b[i][j]+"  ");
	}
	 System.out.println();
	}
	}
}
