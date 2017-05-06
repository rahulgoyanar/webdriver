package string;

public class Testclass14 {
	public static void main(String[] args) {
		String s = "banana";
		//for (int i = 0; i < s.length(); i++) {
			//char c = s.charAt(i);
			int p = (s.length() - s.replace("n", "").length());
		
			System.out.println(p);

		

	}
}