package javaLambdaExpressions;

import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Consumer<String> str= x-> System.out.println(x);
		
		str.accept("this is consumer that returns void");
	}

}
