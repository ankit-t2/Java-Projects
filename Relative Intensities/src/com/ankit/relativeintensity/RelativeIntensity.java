package com.ankit.relativeintensity;

public class RelativeIntensity {

	/**
	 * Finds GCD of 2 numbers.
	 * @param number1
	 * @param number2
	 * @return
	 */
	private static int gcd(int number1, int number2) 
	{
	    if(number2 == 0)
	    {
	        return number1;
	    }
	    return gcd(number2, number1%number2);
	}
	
	private static int getGCD(int[] a)
	{
	    int result = a[0];
	    for(int number: a)
	        result = gcd(result, number);
	    return result;
	}
	
	public static void main(String[] args) 
	{
		int[] numbers = {12,24,32};
		System.out.println(getGCD(numbers));
		System.out.println(gcd(24,16));

	}

}
