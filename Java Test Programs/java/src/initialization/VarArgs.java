package initialization;

//: initialization/VarArgs.java
// Using array syntax to create variable argument lists.

class A {
	int i;
	public A(int number)
	{
		i=number;
	}
	public String toString()
	{
		return "A"+i;
	}
}

public class VarArgs {
  static void printArray(Object[] args) {
    for(Object obj : args)
      System.out.print(obj + " " + obj.getClass() + " ");
    System.out.println();
  }
  public static void main(String[] args) {
    printArray(new Object[]{
      new Integer(47), new Float(3.14), new Double(11.11)
    });
    printArray(new Object[]{"one", "two", "three" });
    printArray(new Object[]{new A(1), new A(2), new A(3)});
  }
} /* Output: (Sample)
47 3.14 11.11
one two three
A1 A2 A3
*///:~
