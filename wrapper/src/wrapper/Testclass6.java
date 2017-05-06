package wrapper;
//bubble sort
public class Testclass6 {
	public static void Sort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++)

		{
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
	}

	public static void main(String[] args) {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		int[] arr = { 1, 3, 15, 8, 25, 9,0,49 };
		Sort(arr);
		for (int e : arr) {
			System.out.println(e);
		}
	}
}
