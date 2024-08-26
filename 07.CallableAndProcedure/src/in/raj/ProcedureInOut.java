
package in.raj;

import java.sql.*;
import java.util.Scanner;

public class ProcedureInOut {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";

    private static final String DB_UNAME = "root";

    private static final String DB_PWD = "root";

    private static final String PROCEDURE = "call getBookNameByPrice(?,?)";
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Book Price :: ");
        double bookPrice = s.nextDouble();

        Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);

        CallableStatement cstmt = con.prepareCall(PROCEDURE);
        cstmt.setDouble(1,bookPrice);
        cstmt.registerOutParameter(2, Types.VARCHAR);

        ResultSet rs = cstmt.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
        con.close();
    }
}