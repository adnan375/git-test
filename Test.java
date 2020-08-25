package github;

public class Test {
	public static void main (String []args ) {
		Adder a =new Adder();
		System.out.println ("My superclass is :Arithmetic");
		System.out.println(a.add(10,32) + " " + a.add(7,6) + " " + a.add(10,10));
	}

}
