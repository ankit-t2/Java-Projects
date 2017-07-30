package com.ankit.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface="com.ankit.ws.Math")
public class MathImpl implements Math {

	@Override
	public int add(int first, int second) {
		
		return first + second;
	}

	@Override
	public int subtract(int one, int two) {
		
		return one-two;
	}

	@Override
	public int multiply(int firstNumber, int secondNumber) {
		
		return firstNumber*secondNumber;
	}

}
