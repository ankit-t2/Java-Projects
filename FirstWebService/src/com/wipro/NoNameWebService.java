package com.wipro;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author an268536
 */
@WebService(serviceName = "NoNameWebService")
public class NoNameWebService {

    /** This is a sample web service operation */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello and welcome " + txt + " !";
    }
}
