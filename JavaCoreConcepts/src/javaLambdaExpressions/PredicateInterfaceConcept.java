package javaLambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> func= x-> x>5;
		List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> collist= list.stream().filter(func).collect(Collectors.toList());
		
		System.out.println(collist);
		
		List<Integer> list2 =list.stream().filter(x-> x>5 && x<9).collect(Collectors.toList());
		
		System.out.println(list2);
		
		
		List<String> names= Arrays.asList("ashish", "ash","as", "kill");
		Predicate<String> nameexp = x->x.startsWith("ashi");
	List<String> str=names.stream().filter(nameexp.negate()).collect(Collectors.toList());
	
	System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
