package functions;

public class Palindrome {

	 public static void main(String[] args) {
	        int number = 121;

	        boolean isPalindrome = isPalindrome(number);

	        if (isPalindrome) {
	            System.out.println(number + " is a palindrome number.");
	        } else {
	            System.out.println(number + " is not a palindrome number.");
	        }
	    }

	public static boolean isPalindrome(int number) {
		// TODO Auto-generated method stub
		int reversedNumber = reverseNumber(number);
        return number == reversedNumber;
	}

   public static int reverseNumber(int num) {
		// TODO Auto-generated method stub
		int rev= 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
	}
}
