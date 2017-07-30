package com.ankit.cxf;

import javax.jws.WebService;

@WebService
public interface ICalculator {

	public int add(int i, int j);
	public int sub(int i, int j);
}
