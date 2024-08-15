package in.raj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteBook {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
    private static final String DB_Uname = "root";
    private static final String DB_PWD = "root";
    private static final String DELETE_SQL = "DELETE FROM BOOKS WHERE BOOK_ID=102";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(DB_URL, DB_Uname, DB_PWD);

        Statement stmt = con.createStatement();

        int i = stmt.executeUpdate(DELETE_SQL);
        System.out.println("ROW Affected :: "+i);
        con.close();
    }
}
