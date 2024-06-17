package pack2;
import pack1.*;
public class Pro extends A { // Accessing protected member within another Package 
	// As a Subclass (inhertiance )

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pro p = new Pro();
		p.display();
		System.out.println(p.a);
	}

}
