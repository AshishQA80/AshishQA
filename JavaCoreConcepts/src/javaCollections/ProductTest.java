package javaCollections;

import java.util.Comparator;
import java.util.TreeSet;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Product> pr = new TreeSet<Product>(new Myproduct());
		pr.add(new Product(1, "b"));
		pr.add(new Product(2, "a"));

		for (Product p : pr) {
			System.out.println(p.id + " " + p.strName);

		}

	}

}

class Myproduct implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub

		int pp= p1.strName.compareTo(p2.strName);
		 
		 return pp;
	}

}