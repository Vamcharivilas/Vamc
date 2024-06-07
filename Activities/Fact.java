package labs;


import java.util.Scanner;

public class Fact {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter the number to get factorial:");
        int num=sc.nextInt();		
         int fact=1,i=1;
         for(i=1;i<=num;i++) {
      	   fact*=i;
      	  
         }
         System.out.println(fact);
         
	}

	}

