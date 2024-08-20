package in.raj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InputTaking {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
    private static final String DB_Uname = "root";
    private static final String DB_PWD = "root";
    private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES (?,?,?)";

    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(DB_URL, DB_Uname, DB_PWD);
        PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
        pstmt.setInt(1,102);
        pstmt.setString(2,"Python");
        pstmt.setDouble(3,1500.00);

        int count = pstmt.executeUpdate();
        System.out.println("Rows Effected :: "+count);
        con.close();
    }
}