package test.java;

public class TestClass1 {
	int i = 10;
	class InnerTestClass1
	{
		public TestClass1 f()
		{
			System.out.println("In InnerTestClass1 " + i);
			return TestClass1.this;
		}
	}
	
	public String toString()
	{
		return ""+i;
	}
}
