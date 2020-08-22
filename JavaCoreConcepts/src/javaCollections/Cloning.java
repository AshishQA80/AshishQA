package javaCollections;

public class Cloning implements Cloneable{

	
	int a=10,b=20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Cloning cl= new Cloning();
		System.out.println(cl.a);
		System.out.println(cl.b);

		
		Cloning cl1= (Cloning)cl.clone();
		
		System.out.println(cl1.a);
		System.out.println(cl1.b);
		
		
					
	}

}
