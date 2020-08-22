package javaCollections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		// Sorted TreeSet

		TreeSet<Integer> St = new TreeSet<Integer>();

		for (int i = 1; i <= 10; i++)

		{

			St.add(i);
		}

		System.out.println(St);

		SortedSet<Integer> ss = St.subSet(4, 8);
		TreeSet<Integer> ss1 = new TreeSet<Integer>(ss);

		System.out.println(ss1);

		SortedSet<Integer> headset = St.headSet(5);

		TreeSet<Integer> ss2 = new TreeSet<Integer>(headset);
		System.out.println(ss2);

		SortedSet<Integer> tailset = St.tailSet(8);
		TreeSet<Integer> ss3 = new TreeSet<Integer>(tailset);
		System.out.println(ss3);

		int o = St.first();

		System.out.println(o);
		
		int i=St.last();
		
		System.out.println(i);
		
		int removesLastElement= St.pollLast();

		System.out.println(removesLastElement);
		int size=St.size();
		System.out.println(size);
		
	}

}
