package test.java1;


public class TestClass1 implements Java1TestInterface{

	@Override
	public String f() {
		// TODO Auto-generated method stub
		return "Inside TestClass1 f()";
	}
	public Java1TestInterface testFunction(boolean condition)
	{
		Java1TestInterface j1TC = null;
		if(condition)
		{
//			class InnerTestClass1 implements Java1TestInterface
//			{
//				int innerClassIntVariable = 47;
//				public int f()
//				{
//					return innerClassIntVariable;
//				}
//				
//				public String toString()
//				{
//					return "Inner class return new one " + innerClassIntVariable;
//				}
//			}
//		
//			j1TC = new InnerTestClass1();
		}
		return j1TC;
	}	
	
//	protected InnerTestClass1 getInnerTestClass1()
//	{
//		return new InnerTestClass1();
//	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 tc1 = new TestClass1();
		System.out.println(tc1.testFunction(true));
	}
}
