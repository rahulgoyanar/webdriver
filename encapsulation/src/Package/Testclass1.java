package Package;

//aggregation :store one obj into another obj
class Address {
	String city;
	String state;
	String country;

	Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}

	void display() {
		System.out.println(city + "," + state + "," + country + ".");
	}
}

class student {
	String name;
	int Rollno;
	Address adr;

	public student(String name, int rollno, Address adr) {
		this.name = name;
		this.Rollno = rollno;
		this.adr = adr;
	}

	void display() {
		System.out.println("name:" + name);
		System.out.println("Rollno:" + Rollno);
		System.out.println("Address:");
		adr.display();
	}
}

public class Testclass1 {
	public static void main(String[] args) {
		Address a1 = new Address("bang", "gwl", "india");
		student s1 = new student("rahul", 720, a1);
		s1.display();
	}
}
