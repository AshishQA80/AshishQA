package javaCollections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer, TestProduct> Pro = new LinkedHashMap<Integer, TestProduct>();

		Pro.put(1, new TestProduct(111, "soap"));
		Pro.put(2, new TestProduct(112, "jeans"));
		Pro.put(113, new TestProduct(113, "phone"));

		// get all the entries

		Set<Entry<Integer, TestProduct>> p = Pro.entrySet();

		Iterator<Entry<Integer, TestProduct>> u = p.iterator();

		while (u.hasNext()) {

			Entry<Integer, TestProduct> t = u.next();
			TestProduct pr = t.getValue();

			// System.out.println(pr.PID +" "+ pr.PName);
			if (pr.PID == 111)
				u.remove();

		}
		for (Entry<Integer, TestProduct> tt : Pro.entrySet()) {
			TestProduct TP = tt.getValue();
			System.out.println(TP.PID + " " + TP.PName);

		}

	}

}
