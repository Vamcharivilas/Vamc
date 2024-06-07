package conditionalStatements;

import java.util.Scanner;

public class Reverse {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number to reverse:");
            int num=sc.nextInt();
            int rev=0;
            while (num!=0) {
				int result=num%10;
				rev=rev*10+result;
				num=num/10;
			
			}
            System.out.println("the reverse of a given value:"+rev);
	}

}
