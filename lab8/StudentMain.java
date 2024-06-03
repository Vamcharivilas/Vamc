package labs;
class Person{
	 String name;
	 int age;
	
	 void speak(){
		 System.out.println(name+" Heyyy Speaking");
	 }
}
class Student extends Person {
	 
	String grade;

	  public void study() {
	    System.out.println(name + " is studying hard for grade " + grade + " ");
	  }
	}
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s = new Student();
		 s.age=21;
		 s.grade="A1";
		 s.name="VAMC";
		 s.speak();
		 s.study();
	}

}
