

class CompanionClass 
{
	CompanionClass.instanceCnt += 1;
	CompanionClass.printInstanceCount()
}

object CompanionClass
{
	var instanceCnt : Int = 0;
	
	def printInstanceCount():Unit = 
	{
		println(instanceCnt + " Instance created")
	}
}

object Main
{
	def main(args:Array[String]):Unit = 
	{
		for(i <- 1 to 10)
			new CompanionClass()
	}
}