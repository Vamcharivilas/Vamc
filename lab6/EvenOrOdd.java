package Conditional;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		int i =sc.nextInt();
		if(i/2==0) {
			System.out.println("give Number"+i+"even");
		}
		else {
			System.out.println("give Number"+i+"odd");
		}
	}

}
