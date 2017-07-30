
package com.wipro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wipro package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAccountBalanceResponse_QNAME = new QName("http://wipro.com/", "getAccountBalanceResponse");
    private final static QName _GetAccountBalance_QNAME = new QName("http://wipro.com/", "getAccountBalance");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wipro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccountBalance }
     * 
     */
    public GetAccountBalance createGetAccountBalance() {
        return new GetAccountBalance();
    }

    /**
     * Create an instance of {@link GetAccountBalanceResponse }
     * 
     */
    public GetAccountBalanceResponse createGetAccountBalanceResponse() {
        return new GetAccountBalanceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wipro.com/", name = "getAccountBalanceResponse")
    public JAXBElement<GetAccountBalanceResponse> createGetAccountBalanceResponse(GetAccountBalanceResponse value) {
        return new JAXBElement<GetAccountBalanceResponse>(_GetAccountBalanceResponse_QNAME, GetAccountBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wipro.com/", name = "getAccountBalance")
    public JAXBElement<GetAccountBalance> createGetAccountBalance(GetAccountBalance value) {
        return new JAXBElement<GetAccountBalance>(_GetAccountBalance_QNAME, GetAccountBalance.class, null, value);
    }

}
