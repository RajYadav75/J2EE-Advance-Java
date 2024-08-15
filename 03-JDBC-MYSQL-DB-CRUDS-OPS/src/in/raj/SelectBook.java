package in.raj;

import java.sql.*;

public class SelectBook {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
    private static final String DB_Uname = "root";
    private static final String DB_PWD = "root";
    private static final String SELECT_SQL = "SELECT * FROM BOOKS WHERE BOOK_ID=101";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(DB_URL, DB_Uname, DB_PWD);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(SELECT_SQL);
        if (rs.next()){
            int bookId = rs.getInt("BOOK_ID");
            String bookName = rs.getString("BOOK_NAME");
            double bookPrice = rs.getDouble("BOOK_PRICE");

            System.out.println(bookId);
            System.out.println(bookName);
            System.out.println(bookPrice);
        }else {
            System.out.println("No Record Found");
        }
        con.close();
    }
}
