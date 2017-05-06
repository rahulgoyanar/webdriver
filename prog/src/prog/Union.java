package prog;

public class Union {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 3, 4, 5 };

		String s = "";
		for (int i = 0; i <= a.length-1; i++) {
			for (int j = 0; j <= b.length-1; j++) {
				if (a[i] == b[j]) {
					s = s + a[i];
				} else {
					s = s+a[i]  + b[j];
					
					
				}
				
			}
			
		}
		System.out.println(s);
	}

}
