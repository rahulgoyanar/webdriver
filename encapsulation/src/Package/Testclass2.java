package Package;

class emp {
	String name;

	emp(String n) {
		name = n;
	}

	public String Tostring() {
		return "emp(name:" + name + "}";
	}
}

public class Testclass2 {
	public static void main(String[] args) {
		emp e1 = new emp("rahul");
		System.out.println(e1);
	}
}