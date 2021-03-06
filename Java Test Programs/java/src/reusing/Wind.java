package reusing;

//: reusing/Wind.java
// Inheritance & upcasting.

class Instrument {
	private void test()
	{
		System.out.println("In test");
	}
	public void play() {}
	static void tune(Instrument i) {
    // ...
		i.test();
 	}
}

// Wind objects are instruments
// because they have the same interface:
public class Wind extends Instrument {
  public static void main(String[] args) {
    Wind flute = new Wind();
    Instrument.tune(flute); // Upcasting
  }
} ///:~
