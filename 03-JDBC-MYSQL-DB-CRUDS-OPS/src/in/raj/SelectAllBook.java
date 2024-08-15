package in.raj;

import java.sql.*;

public class SelectAllBook {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
    private static final String DB_Uname = "root";
    private static final String DB_PWD = "root";
    private static final String SELECT_SQL = "SELECT * FROM BOOKS";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(DB_URL, DB_Uname, DB_PWD);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(SELECT_SQL);
        System.out.println("BOOK_ID"+" | "+"BOOK_NAME"+" | "+"BOOK_PRICE");
        while (rs.next()){
            System.out.println(rs.getInt("BOOK_ID")+" | "+rs.getString("BOOK_NAME")+" | "+rs.getDouble("BOOK_PRICE"));
        }
        con.close();
    }
}
