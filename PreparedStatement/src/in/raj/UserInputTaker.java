package in.raj;

import java.sql.*;
import java.util.Scanner;

public class UserInputTaker {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
    private static final String DB_Uname = "root";
    private static final String DB_PWD = "root";
    private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES (?,?,?)";
    private static final String SELECT_SQL = "SELECT * FROM BOOKS";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Book Id");
        int id = s.nextInt();

        System.out.println("Enter Book Name ");
        String name = s.next();

        System.out.println("Enter Book Price");
        double price = s.nextDouble();

        Connection con = DriverManager.getConnection(DB_URL, DB_Uname, DB_PWD);
//        System.out.println(con);

        PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
        pstmt.setInt(1,id);
        pstmt.setString(2,name);
        pstmt.setDouble(3,price);

        int cnt = pstmt.executeUpdate();
        System.out.println("Rows Effected...."+cnt);

        PreparedStatement psts = con.prepareStatement(SELECT_SQL);
        ResultSet rs = psts.executeQuery();
        System.out.println("BOOK ID"+"---"+"BOOK NAME"+"---"+"BOOK PRICE ");
        while (rs.next()){
            System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getDouble(3));
        }

        con.close();
    }
}
