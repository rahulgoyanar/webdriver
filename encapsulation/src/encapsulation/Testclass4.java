package encapsulation;

public class Testclass4 {
	public static void main(String[] args) {

		Testclass3 encap = new Testclass3();
		encap.setName("James");
		encap.setAge(20);
		encap.setIdNum("12343ms");

		System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge() + "    ID ;"+encap.getIdNum());
	}

}
