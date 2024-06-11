package labs;



class UserManage{
	public  static void  authenticate(String username, String password) {
		System.out.println(username+" YOUR login successful.");
	}
	public   static void authenticate(String email, long phoneno) {
		System.out.println(email+"  YOUR  login successful using EmailId.");
	}
	public static void  authenticate(long phoneno,int pin) {
		System.out.println(phoneno+" YOUR login successful using phoneNo.  ");
	}
	public   static void authenticate(String email, int pin) {
		System.out.println(email+"  YOUR  login successful using EmailId.");
	}
	public   static void authenticate(long phoneno,String password) {
		System.out.println(phoneno+"  YOUR  login successful using PhoneNo.");
	}
	
}
 class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserManage u =  new UserManage();
		u.authenticate(9866710852l, 141711);
		u.authenticate("viraj111@gmail.com",9866710852l);
		u.authenticate("@Villain_hypnotic_urge", "*************");
		u.authenticate("hasinipandithi@gmail.com", 12112);
		u.authenticate(9855710825l, "^^^^^^^^^^^^");

	}

}
