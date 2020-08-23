package javaLambdaExpressions;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	getText(()-> "ash");
	
		

	}

	public static void getText(Supplier<String> str)
	{
		
		System.out.println(str.get().length());
		
	}
	
}
