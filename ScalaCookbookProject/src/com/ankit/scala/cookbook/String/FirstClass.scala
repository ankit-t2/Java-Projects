package com.ankit.scala.cookbook.String

object FirstClass {

	def main(args: Array[String]): Unit = {
		
		var str : String = "eggs, milk, butter, coco buffs";
		str.split(",").map(_.trim()).foreach {x=>println("|" + x + "|") }
	}
}