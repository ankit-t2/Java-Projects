package test.java1;

import test.java1.Java1TestInterface.Tester;

public class TestClass2 {
	
	private static int i = 10;
	
	private void f()
	{
		System.out.println("Private field of outer class " + i);
	}
	
	class InnerClass
	{
		private int j = 5;
		void changeOuterClass()
		{
			i++;
			f();
		}
	}
	
	public void createInnerClass()
	{
		InnerClass ic1 = new InnerClass();
		ic1.changeOuterClass();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TestClass2 tc2 = new TestClass2();
//		tc2.createInnerClass();
//		TestClass2.InnerClass ic2 = tc2.new InnerClass();
//		ic2.changeOuterClass();
//		int a=ic2.j;
		
		
		Java1TestInterface jti = new TestClass1();
		new Tester();
		Tester.anotherFn(jti);
	}

}
