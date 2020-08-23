package javaLambdaExpressions;

public class LambdaExpressions {

	public static void main(String[] args) {
		// lambda can have only one abstract method
		
		
		webPage wp = (a, b) -> System.out.println(a + b);
		webPage wp2 = (c, d) -> System.out.println(c * d);

		wp.msg(1, 2);

		wp2.msg(7, 4);

	}

}
