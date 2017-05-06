package string;

// sum of digit from string
import java.util.Scanner;

public class Testclass12 {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter a string");
		String s = scn.next();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= '0' && c <= '9') {
				sum += Integer.parseInt("" + c);
				//sum+=c;    this gives the adding of ascci value of digit and add
			}
		}
		System.out.print(sum);

	}
}
