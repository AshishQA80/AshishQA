package javaCollections;

import java.util.TreeMap;

public class TestTreeMap {

	
	public static void main(String ash[])
	{
		
		TreeMap<String,Integer> tm= new TreeMap<String, Integer>();
		tm.put("boss", 1);
		tm.put("ass", 2);
		tm.put("luck", 3);
		
		//System.out.println(tm); // sorting based on the KEY
		
		
		TreeMap<Integer, String> tm1= new TreeMap<Integer, String>();
		tm1.put(44, "aas");
		tm1.put(22, "ba");
		tm1.put(33, "cat");
		
		//System.out.println(tm1);
		
		TreeMap<Integer, String> tm2= new TreeMap<Integer, String>();
		
		tm2.putAll(tm1);
		System.out.println(tm2);
		
		
	}
	
}
