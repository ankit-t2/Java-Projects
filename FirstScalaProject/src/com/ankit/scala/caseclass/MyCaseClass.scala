package com.ankit.scala.caseclass

case class MyCaseClass (var empId:Int, var empName:String, var empAddr:String)

object Main
{
	def main(args: Array[String]): Unit = 
	{
		val m1 = new MyCaseClass(100, "Ankit", "Somewhere")
		val m2 = new MyCaseClass(200, "Ankit1", "Somewhere1")
		
		println(m1==m2)
		
		val m3 = m1.copy()
		println(m3==m1)
		println(m1)
		println(m3)
		
		m3.empId = 400
		println(m1)
		println(m3)
		println(m3==m1)
		
		val m4 = m1
		println(m1)
		println(m4)
		
		m4.empId = 500
		println(m1)
		println(m4)
		
	}
}