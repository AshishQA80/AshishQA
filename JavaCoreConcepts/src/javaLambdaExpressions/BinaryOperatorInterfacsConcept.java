package javaLambdaExpressions;

import java.util.function.BinaryOperator;

public class BinaryOperatorInterfacsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Represents an operation upon two operands (parameters) of the same type, 
		producing a result of the same type as the operands. 
		This is a specialization of BiFunction for the case 
		where the operands and the result are all of the same type.*/
		
		
		BinaryOperator<Integer> fun= (a,b)-> a+b;
		
		int x=fun.apply(90, 10);
		System.out.println(x);
		
		
		
	}

}
