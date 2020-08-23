package javaLambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionMethodRefrences {

	public static void main(String[] args) {
		// lambda exp
		
		List<String> name= Arrays.asList("ab","abc","abcd");
		
		name.forEach(str -> System.out.println(str)); 
		
		// method reference
		
		name.forEach(System.out:: println);

	}

}
