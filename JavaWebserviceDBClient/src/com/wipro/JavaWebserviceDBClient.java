/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wipro;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author AN268536
 */
public class JavaWebserviceDBClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigDecimal bd = new BigDecimal(getAccountBalance("4"));
        System.out.println("bd::"+bd);
        System.out.println(numberToDollars(bd));
//        System.out.println(""+numberToDollars(new BigDecimal("35324")));
    }


    private static float getAccountBalance(java.lang.String userid) {
        com.wipro.GetAccountInfo_Service service = new com.wipro.GetAccountInfo_Service();
        com.wipro.GetAccountInfo port = service.getGetAccountInfoPort();
        return port.getAccountBalance(userid);
    }

    private static String numberToDollars(java.math.BigDecimal dNum) {
        com.dataaccess.webservicesserver.NumberConversion service = new com.dataaccess.webservicesserver.NumberConversion();
        com.dataaccess.webservicesserver.NumberConversionSoapType port = service.getNumberConversionSoap();
        return port.numberToDollars(dNum);
    }

}
