package javaLambdaExpressions;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Interface Function<T,R> Type Parameters: T - the type of the input to the
		 * function R - the type of the result of the function
		 */

		Function<String, Integer> func = Name -> Name.length();

		int size = func.apply("AshishB");
		System.out.println(size);

		// function chaning

		Function<Integer, Integer> func2 = x -> x * 2;

		int size2 = func.andThen(func2).apply("BarrowA");

		System.out.println(size2);

	}

}
