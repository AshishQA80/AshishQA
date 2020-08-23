package javaLambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Represents an operation on a single operand that produces 
		a result of the same type as its operand. 
		This is a specialization of Function for the case 
		where the operand and result are of the same type.*/
		
		
		UnaryOperator<String> nameCase= S -> S.toUpperCase();
		String sname=nameCase.apply("ashish");
		System.out.println(sname);
		
		
		List<String> list= new ArrayList<String>();
		
		list.add("java");
		list.add("JS");
		list.add("API");
		
		list.replaceAll(ele ->ele + " "+ "Ashish");
		
		System.out.println(list);
		
		
		
		
		
		
		
	}

}
