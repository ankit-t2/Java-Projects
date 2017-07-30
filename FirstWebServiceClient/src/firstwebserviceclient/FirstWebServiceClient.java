/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package firstwebserviceclient;

/**
 *
 * @author an268536
 */
public class FirstWebServiceClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calling webservice");
        String ret = hello("chacha chaudhry");
        System.out.println(ret);
    }

    private static String hello(java.lang.String name) {
        com.wipro.NoNameWebService_Service service = new com.wipro.NoNameWebService_Service();
        com.wipro.NoNameWebService port = service.getNoNameWebServicePort();
        return port.hello(name);
    }
}
