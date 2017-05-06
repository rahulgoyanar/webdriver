package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {

	public static void main(String[] args) {
		Map m = new TreeMap();
		Map h = new HashMap();
		Map l = new LinkedHashMap();

		m.put("c", 0);
		m.put("android", 2);
		m.put("java", 1);

		System.out.println(m + "    tree map");

		h.put("c", 0);
		h.put("android", 2);
		h.put("java", 1);

		System.out.println(h + "    hash map");

		l.put("c", 0);
        l.put("android", 2);
		l.put("java", 1);
		System.out.println(l + "    linkedhashmap");
	}

}
