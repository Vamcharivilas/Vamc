package field;

 final public class FinalVariable {     
	 //final class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           final int i =10;//final variable primitive
           final String f=  "FINAL KEY WORD";//final variable Non primitive
           System.out.println(i);
           System.out.println(f);
           display();
	}
  final public static void display() {
	  System.out.println("this is the final method");
  }
}
