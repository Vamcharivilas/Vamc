package sample;
import java.util.Iterator;
import java.util.Scanner;
public class Mulitiplytable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number:");
		int num = sc.nextInt();
		System.out.println("MUltipication Table for"+num+":");
		for(int i=1;i<=10;i++) {
			System.out.println(num+ " * " +i +" = "+(num * i));
		}
	}

}
