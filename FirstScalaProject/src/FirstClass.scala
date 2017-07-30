

class FirstClass (val name:String, val age:Int)
{
	println("ankit")	
	def test(): Unit =
	{
			println("Test Message");
			println(name + " " + age)
	}
}

object TestFirstClass
{
	def main(args: Array[String]): Unit =
	{
		val m = new FirstClass("Ankit",5)
		m.test()
		MyObject.testFn()
	}
}

class TestSecondClass
{
	def main(args: Array[String]): Unit =
	{
		println("hello world")
	}
}

object TestThirdClass
{
	def main(args: Array[String]): Unit =
	{
		println("hello world")
	}
}

object MyObject
{
	def testFn():Unit =
	{
		println("static object call")
	}
}