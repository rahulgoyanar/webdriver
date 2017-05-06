package collection;

public class Testclass1 {

	public static void main(String[] args) {
		String s = "java is very easy";
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
			sb.append(" ");
		}

		System.out.println(sb);

	}
}