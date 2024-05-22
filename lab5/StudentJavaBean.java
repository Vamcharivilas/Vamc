package field;

import java.io.Serializable;

class Student implements Serializable {
	private String studname;
	private int rollno;
	private boolean active;
	public char[] getActive;

	Student() {
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}

class StudentJavaBean {
	public static void main(String args[]) {
		Student s = new Student();
		s.setStudname("Vamshi");
		System.out.println(s.getStudname());
		s.setRollno(55);
		System.out.println(s.getRollno());
		s.setActive(true);
		System.out.println(s.isActive());
	}
}
