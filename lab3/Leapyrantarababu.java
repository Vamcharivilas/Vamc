package functions;

public class Leapyrantarababu {
 public static void main(String args[]) {
	 int year=2000;
	 if (isleapyr(year)) {
		 System.out.println("the give year is a leapyr:"+year);
		
	} else {
		System.out.println("the give year isnot a leapyr:"+year);
	}
 }

private static boolean isleapyr(int year) {
	// TODO Auto-generated method stub
	return  isDivisibleByFour(year) && ( !isDivisibleByHundred(year) || isDivisibleByFourHundred(year) );
}

private static boolean isDivisibleByHundred(int year) {
	// TODO Auto-generated method stub
	return year%100==0;
}

private static boolean isDivisibleByFourHundred(int year) {
	// TODO Auto-generated method stub
	return year%400==0;
}

private static boolean isDivisibleByFour(int year) {
	// TODO Auto-generated method stub
	return year%4==0;
}
}
