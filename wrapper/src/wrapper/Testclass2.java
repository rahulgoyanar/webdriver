package wrapper;
//linear search
public class Testclass2 {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 5, 6, 8, 4, 2 };
		System.out.println(linearSearch(arr, 4));
		System.out.println(linearSearch(arr, 8));
		System.out.println(linearSearch(arr, 10));

	}

	public static int linearSearch(int[] a, int n) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				return i;
			}
		}
		return -1;
	}
}
