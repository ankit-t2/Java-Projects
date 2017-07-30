package test.java1;

public interface Java1TestInterface {

	String f();
	class Tester
	{
		Tester()
		{
			System.out.println("Inside Tester constructor");
		}
		
		static void anotherFn(Java1TestInterface jti)
		{
			System.out.println(jti.f());
		}
	}
}
