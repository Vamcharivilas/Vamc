package labs;

class Vehicle {
	String brand, model;
	int year;

	void drive() {
		System.out.println(brand + " " + model + "Seuzzzzzzzzzzzz" + year);
	}
}

class Car extends Vehicle {
	String colour;

	void honk() {
		System.out.println(colour + " Car loud noise  horn tvu! kick!");
	}
}

public class MainCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.brand = "BMW";
		c.model = "RR";
		c.year = 1999;
		c.colour = "RED";
		c.drive();
		c.honk();
	}

}
