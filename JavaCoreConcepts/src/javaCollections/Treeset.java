package javaCollections;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>(new Myclass());
		ts.add("d");
		ts.add("c");
		ts.add("a");
		ts.add("b");
		// ts.add(null);// will give Null pointer exception as NUll cannot be comapared
		// ts.add(1);
		System.out.println(ts);

		TreeSet<Integer> i = new TreeSet<Integer>(new Myclass2());
		i.add(4);
		i.add(2);
		i.add(1);
		i.add(3);
		System.out.println(i);
	}

}

class Myclass implements Comparator<String> {

	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub

		return -s1.compareTo(s2); // desc order

	}

}

class Myclass2 implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub

		return -i1.compareTo(i2);
	}

}
