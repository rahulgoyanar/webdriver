package encapsulation;

/* File name : EncapTest.java */
public class Testclass3 {

	private String name;
	private String idNum;
	private int age;

	public int getAge() //for geater
	{
		return age;
	}

	public String getName() //for geater
	{
		return name;
	}

	public String getIdNum() //for geater
	{
		return idNum;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(String newId) {
		idNum = newId;
	}
}
