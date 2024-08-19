package in.raj;

import java.sql.*;

import static java.sql.ResultSet.CONCUR_UPDATABLE;
import static java.sql.ResultSet.TYPE_SCROLL_SENSITIVE;

public class SelectAllBook {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
    private static final String DB_Uname = "root";
    private static final String DB_PWD = "root";
    private static final String SELECT_SQL = "SELECT * FROM BOOKS";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(DB_URL, DB_Uname, DB_PWD);
        //TODO -> This is how we retrieve all the record from databases;
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(SELECT_SQL);
        System.out.println("BOOK_ID"+" | "+"BOOK_NAME"+" | "+"BOOK_PRICE");
        while (rs.next()){
            System.out.println(rs.getInt("BOOK_ID")+" | "+rs.getString("BOOK_NAME")+" | "+rs.getDouble("BOOK_PRICE"));
        }

        /*// TODO -> How to make ResultSet Bi-Directional
        //Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        //Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        // TODO -> How to make ResultSet Bi-Directional and Updatable
        Statement stmt = con.createStatement(TYPE_SCROLL_SENSITIVE, CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(SELECT_SQL);
        rs.absolute(2);  //Second Row Printed
        rs.updateDouble(3,5500);
        rs.updateRow();

        System.out.println(rs.getInt(1));
        System.out.println(rs.getString(2));
        System.out.println(rs.getDouble(3));

        rs.previous();

        System.out.println(rs.getInt(1));
        System.out.println(rs.getString(2));
        System.out.println(rs.getDouble(3));*/

        con.close();
    }
}
