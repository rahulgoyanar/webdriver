package wrapper;

public class Testclass1 {
	public static void main(String[] args) {
		Object[] arr = new Object[5];
		arr[0] = "rahul";
		arr[1] = 10;
		arr[2] = new Boolean(true);
		int i = ((Integer) arr[1]).intValue();

		System.out.println(arr[0]);
		System.out.println(arr[2]);
		System.out.println(i);
	}
}
