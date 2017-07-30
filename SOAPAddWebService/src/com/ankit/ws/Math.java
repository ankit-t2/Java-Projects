package com.ankit.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface Math {

	@WebMethod
	public int add(int first, int second);
	
	@WebMethod
	public int subtract(int one, int two);

	@WebMethod
	public int multiply(int firstNumber, int secondNumber);
}
