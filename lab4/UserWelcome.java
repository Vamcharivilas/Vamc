package functions;

import java.util.Scanner;

public class UserWelcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Name :");
		String Name = sc.nextLine();
		sc.close();
		String WelcomeMessage = " YOUR MOST Welcome" + Name + "!";
		System.out.println(WelcomeMessage);

	}

}
