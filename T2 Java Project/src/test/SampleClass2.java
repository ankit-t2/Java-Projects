package test;

import java.util.TreeSet;

public class SampleClass2 {

	public static void main(String[] args) 
	{
//		float f = 1.23f;
//		float i = f % 10000007;
//		System.out.println(i);
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(4);
		ts.add(2);
		ts.add(7);
		System.out.println(ts.first());
		System.out.println(ts.lower(5));
	
	}       

}
