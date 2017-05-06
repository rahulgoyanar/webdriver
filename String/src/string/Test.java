package string;

//import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// static Scanner scn = new Scanner(System.in);
		String s = "abcdefghijklmnopqrstuvwxyz";
		// System.out.println("Enter no");
		// int str = scn.Intnext();
		Abc(s);

	}

	public static void Abc(String k) {
		// StringBuilder sb = new StringBuilder();
		String rev = "";
		for (int i = k.charAt(0); i >= k.charAt(25); i++) {
			rev += k.charAt(i);
			System.out.println(rev);

		}
	}
}
