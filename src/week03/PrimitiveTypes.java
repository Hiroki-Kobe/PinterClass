package week03;

// Visibility

public class PrimitiveTypes {
	int id = 12;
		
	
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		
//		int i1; // -- declaration
//		i1 = 0; // -- initialization ~ init
		
		int i1 = 0; //--declare+ init

		int i2, i3, i4;
		i2 = -10;
				
		float f1 = 0;
		float f2 = 0.0f;
		double d3 = 0.0;
		double d4 = 0.0d;
		
		double number = i1 + d3;
		boolean b1 = true;
		boolean b2 = false;
//		boolean b3 = 0;
		
		String s1 = "Hi!";
		String msg = s1 + i1;		
//		int msg = s1 + i1; // -- ERROR!
		
		System.out.println(msg + b1);

	}

}
