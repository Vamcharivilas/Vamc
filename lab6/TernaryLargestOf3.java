package Conditional;

import java.util.Scanner;

public class TernaryLargestOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values of a,b,c:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
	    int largest=a>b?(a>c?a:c):(b>c?b:c);
	    System.out.println("LargestNO is:"+largest);
	}

}
