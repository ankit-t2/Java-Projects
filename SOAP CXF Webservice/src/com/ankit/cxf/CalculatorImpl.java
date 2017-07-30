package com.ankit.cxf;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://cxf.ankit.com/", portName = "CalculatorImplPort", serviceName = "CalculatorImplService")
public class CalculatorImpl implements ICalculator {

	public CalculatorImpl() {

	}

	@Override
	@WebMethod(operationName = "addOper")
	public int add(int i, int j) {

		return i+j;
	}

	@Override
	@WebMethod(operationName = "sub")
	public int sub(int i, int j) {

		return i-j;
	}

}
