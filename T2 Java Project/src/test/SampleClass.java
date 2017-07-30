package test;

import java.math.BigInteger;

public class SampleClass {

	public static void main(String[] args) {

		int i = 999999999;
		int j = 999999999;
		
		long a = 1234567890;
		long b = 1345678901;
		
		BigInteger k = BigInteger.valueOf(i).multiply(BigInteger.valueOf(j));
		
		long l = i + j;
		long m = a + b;
		
		System.out.println("BigInt * BigInt " + k);
		System.out.println("Long of Int+Int " + l);
		System.out.println("Long of Long + Long " + m);
		System.out.println("Integer Max Value " + Integer.MAX_VALUE);
		System.out.println("Long Max Value " + Long.MAX_VALUE);
		System.out.println(Long.valueOf(Integer.MAX_VALUE) * Long.valueOf(Integer.MAX_VALUE));
		System.out.println(BigInteger.valueOf(Long.MAX_VALUE).multiply(BigInteger.valueOf(Long.MAX_VALUE)));
		System.out.println(2^5);
		
	}

}
