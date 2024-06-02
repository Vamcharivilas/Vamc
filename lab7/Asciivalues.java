package labs;

import java.util.Scanner;

public class Asciivalues {
		
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
           System.out.println("Enter charater to get Ascii key value:");
           char ch = sc.next().charAt(0);
            int Asciivalue= (int)ch; 
           System.out.println(Asciivalue);
	}

}
