package in.raj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetTypes {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
    private static final String DB_Uname = "root";
    private static final String DB_PWD = "root";
    private static final String SELECT_SQL = "SELECT * FROM BOOKS";

    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(DB_URL, DB_Uname, DB_PWD);
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(SELECT_SQL);
        System.out.println("Query Execution Completed ... Data available in ResultSet");
        while(rs.next()){
            System.in.read();
            System.in.read();
            rs.refreshRow();
            System.out.println(rs.getInt(1)+" --- "+rs.getString(2)+" --- "+rs.getDouble(3));
        }
        con.close();
    }
}
