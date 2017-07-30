package test.java;

public class TestClass2 extends TestClass1 implements TestInterface{

	private final int i;
	
	public TestClass2(int k)
	{
		i = 1;
		System.out.println("In TestClass2 "+i);
	}
	
	public int f()
	{
		return 1;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface tc7 = new TestClass2(7);
		System.out.println("hello " + TestInterface.i);
		TestClass1.InnerTestClass1 tc2 = new TestClass1().new InnerTestClass1();
		TestClass1 tc1 = tc2.f();
		System.out.println(tc1);
	}

}