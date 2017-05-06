package prog;

import java.util.Collections;
import java.util.Arrays;
public class demo1 {
	public static void main(String[] args) {
		Integer[]arr={1,2,8,11,22,433,6};
		Arrays.sort(arr,Collections.reverseOrder());
		if (arr.length<2)
		{
			System.out.println("array has less then 2 element");
		
		}
		else
		{
			System.out.println("two max number are "+arr[0]+"and"+arr[1]);
		}
	}

}
