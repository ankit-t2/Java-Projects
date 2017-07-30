package com.ankit.scala.caseclass

class TestClass (speed:Float){
	def showSpeed : Float = speed
	def accelerate(rate:Float) = println(f"Accelerating at $rate") 
}

object MainObject
{
	def main(args: Array[String]): Unit = {
		var testClass: TestClass = new TestClass(1.3f)
		println(testClass.showSpeed)
		testClass.accelerate(4f)

		println("Hello World".getClass.getName())
		
		var foo:String = """this is
							a multiline
							string"""
		println(foo)
		println(foo.stripMargin(' '))
		// Below doesnt work
		//testClass.showSpeed = 5f
	}
}