package pack1;
// ACCESSING PROTECTED members within the Same PACKAGE 
class B extends A{
	void displaypro() {
		System.out.println("From B");
	}
}




public class Proctected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b  = new B();
		System.out.println(b.a);
        b.display();
        b.displaypro();
	}

}
