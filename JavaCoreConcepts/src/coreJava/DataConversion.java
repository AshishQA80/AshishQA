package coreJava;

public class DataConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "12.71";

		// System.out.println(s);
		double r = Double.valueOf(s); // string to double conversion
		// System.out.println(r);

		double[] x = new double[(int) (r)]; // Storing into Array

		for (double e = 0; e < x.length; e++)

		{

			System.out.println(r);
		}

	}

}
