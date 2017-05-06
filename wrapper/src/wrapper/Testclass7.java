package wrapper;

public class Testclass7 {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 9, 10, 15,30,2,32 };
		System.out.println(binarysearch(arr, 15));
		System.out.println(binarysearch(arr, 5));
		System.out.println(binarysearch(arr, 14));
		System.out.println(binarysearch(arr, 32));
		System.out.println(binarysearch(arr, 30));
	}

	public static int binarysearch(int[] a, int x) {

		int f = 0;
		int l = a.length - 1;
		int m;
		while (f <= l) {
			m = (f + l) / 2;
			if (x == a[m])
				return m;
			else if (x > a[m])
				f = m + 1;
			else
				l = m - 1;
		}
		
		return - 1;
	}

}
