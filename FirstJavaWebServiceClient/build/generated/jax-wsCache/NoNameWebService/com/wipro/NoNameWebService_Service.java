
package com.wipro;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b04 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NoNameWebService", targetNamespace = "http://wipro.com/", wsdlLocation = "http://localhost:8080/FirstWebService/NoNameWebService?wsdl")
public class NoNameWebService_Service
    extends Service
{

    private final static URL NONAMEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException NONAMEWEBSERVICE_EXCEPTION;
    private final static QName NONAMEWEBSERVICE_QNAME = new QName("http://wipro.com/", "NoNameWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/FirstWebService/NoNameWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NONAMEWEBSERVICE_WSDL_LOCATION = url;
        NONAMEWEBSERVICE_EXCEPTION = e;
    }

    public NoNameWebService_Service() {
        super(__getWsdlLocation(), NONAMEWEBSERVICE_QNAME);
    }

    public NoNameWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), NONAMEWEBSERVICE_QNAME, features);
    }

    public NoNameWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, NONAMEWEBSERVICE_QNAME);
    }

    public NoNameWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NONAMEWEBSERVICE_QNAME, features);
    }

    public NoNameWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NoNameWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NoNameWebService
     */
    @WebEndpoint(name = "NoNameWebServicePort")
    public NoNameWebService getNoNameWebServicePort() {
        return super.getPort(new QName("http://wipro.com/", "NoNameWebServicePort"), NoNameWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NoNameWebService
     */
    @WebEndpoint(name = "NoNameWebServicePort")
    public NoNameWebService getNoNameWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wipro.com/", "NoNameWebServicePort"), NoNameWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NONAMEWEBSERVICE_EXCEPTION!= null) {
            throw NONAMEWEBSERVICE_EXCEPTION;
        }
        return NONAMEWEBSERVICE_WSDL_LOCATION;
    }

}
