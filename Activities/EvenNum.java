package sample;
import java.util.Scanner;
public class EvenNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit to be :");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			if (i%2==0) {
				sum+=i;
				System.out.println(i);
			}
					}
		System.out.println("sum Of EvenNum :"+sum);
	}
}
			
		
		

	


