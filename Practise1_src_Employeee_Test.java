package Employeee;

public class Test {
	
	public int intnum;
	public byte bytenum;
	public long longnum;
	public double doublenum;
	public float floatnum;
	public char charnum;
	public short shortnum;
	public boolean bool;
	 static int val=20;
	 
	 public static void sMethod() {
		 System.out.println("Calling the Method without creating an Object");
	 }

	public static void main(String[] args) {
		Test tt = new Test();
		Test tt2 = new Test();
		tt.intnum = 10;
		tt.val = 10;
	
		System.out.println("static: "+Test.val);
		System.out.println(tt.intnum);
		System.out.println("using tt2 object :"+tt2.intnum);
		System.out.println(tt.bytenum);
		System.out.println(tt.doublenum);
		System.out.println(tt.bool);
		
		System.out.println(tt.val);
		System.out.println(tt2.val);
		Test.sMethod();
		

	}

}
