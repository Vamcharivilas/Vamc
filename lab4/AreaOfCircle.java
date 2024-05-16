package functions;
import java.util.Scanner;
public class AreaOfCircle {
         public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 String userInput;
		 do{
	            System.out.println("Do you want to find the area of a circle? YES(press enter)");
	            userInput = sc.nextLine().toUpperCase(); // Convert input to uppercase for case-insensitive comparison
	        } 
	        while((userInput.equals("YES")));
	        System.out.println("enter the value of radius r is :");
	  	  double r = sc.nextDouble();
	  	  System.out.println(areaOfCircle(r));
         }
	      public static double areaOfCircle( double r){
	      	Double pi = 3.14;
	            double a=pi*r*r;
	  		return a;
	      	}
}
