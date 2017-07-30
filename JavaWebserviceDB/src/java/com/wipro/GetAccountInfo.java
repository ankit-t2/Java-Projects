package com.wipro;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.*;

/**
 *
 * @author an268536
 */
@WebService(serviceName = "GetAccountInfo")
public class GetAccountInfo {

    Connection con;
    Statement stmt;
    ResultSet rs;
    float amount;
    String msg;
            
    public GetAccountInfo()
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("Jdbc:Oracle:thin:@localhost:1521:ORCL","scott","tiger");
            stmt = con.createStatement();
        } catch (Exception ex) {
            Logger.getLogger(GetAccountInfo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }
    
    /** This is a sample web service operation */
    @WebMethod(operationName = "getAccountBalance")
    public float getAccountBalance(@WebParam(name = "userid") String userID) {
        try {
            rs = stmt.executeQuery("select * from cust_account_info where userID = " + userID);
            if(rs.next())
            {
                amount = rs.getFloat(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GetAccountInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return amount;
    }
}
