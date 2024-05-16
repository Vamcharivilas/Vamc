package functions;

import java.util.Scanner;

public class AddSubMultDivi2No {
	public  static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	 
    System.out.println("enter the value a :");
    int a =sc.nextInt();
    System.out.println("enter the value b :");
    int b=sc.nextInt();
    int c=0;
    c=a+b;
    System.out.println("Sum of "+a+"+"+b+"="+c);
    System.out.println("*************");
     c=a-b;
    System.out.println("Subtract of "+a+"-"+b+"="+c );
    System.out.println("*************");
    c=a*b;
   System.out.println("Multipication of "+a+"*"+b+"="+c );
   System.out.println("*************");
   c=a%b;
  System.out.println("Division of "+a+"%"+b+"="+c );
}
}
