package functions;

import java.util.Scanner;

public class OnlineBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            double Balance=1000000.0;
            while(true) {
            	System.out.println("SBI online BankingAppliczation");
            	System.out.println("1.Deposite");
            	System.out.println("2.WithDraw");
            	System.out.println("3.CheckBalance");
            	System.out.println("4.Exit");
            	System.out.println("Enter Your choice :");
            	int choice = sc.nextInt();
            	switch (choice) {
				case 1:
					double depositeAmount=getDeposit(sc);
					Balance=Balance+depositeAmount;
					System.out.println("Deposited Amount:"+ depositeAmount + ". New balance: " + Balance);
			      	break;
				case 2:
					double WithDrawAmount = getWithDrawAmount(sc,Balance);
					if (WithDrawAmount > 0) {
			            Balance -= WithDrawAmount;
			            System.out.println("Withdrawn Amount :" + WithDrawAmount + ". New balance: " + Balance);
			          }
			          break;
				case 3:
			          System.out.println("Your current balance is: " + Balance);
			          break;
				case 4:
			          System.out.println("Thank you for using the SBI Banking Application.");
			          sc.close();
			          return;

				default:
					 System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                
					break;
				}
	    }
	}
public static double getWithDrawAmount(Scanner sc, double Balance) {
		// TODO Auto-generated method stub
		System.out.println("enter the Amount to be WithDraw :");
		double Amount=sc.nextDouble();
		if (Amount <= 0) {
		      System.out.println("Deposit amount must be positive.");
		      return getDeposit(sc);
		    }
		else if(Amount > Balance) {
			System.out.println("Insufficient Balance Available ");
			return 0;
		}
		return Amount;
}
public static double getDeposit(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("enter the Amount to be Deposit");
		double Amount = sc.nextDouble();
		 if (Amount <= 0) {
		      System.out.println("Deposit amount must be positive.");
		      return getDeposit(sc);
		    }
		return Amount;
	}
}
