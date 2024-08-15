package in.raj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Registration {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
    private static final String DB_UNAME = "root";
    private static final String DB_PWD = "root";
    private static final String SQL_Query = "INSERT INTO REGISTRATION VALUES('3','raj@gmail.com','Raj','6388')";

    public static String createTable(){
        final String Create_Table = "CREATE TABLE IF NOT EXISTS Registration(userID INT PRIMARY KEY AUTO_INCREMENT, Email VARCHAR(100)  ,Name VARCHAR(20),Password VARCHAR(10))";
        return Create_Table;
    }
    public static void insertValue()throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
        Statement statement = con.createStatement();
        int row = statement.executeUpdate(SQL_Query);
        System.out.println("Create Table Row Effected :: "+ row);
        con.close();
    }
    public static void main(String[] args) throws Exception{
//        System.out.println(createTable());

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
        Statement statement = con.createStatement();
        int creationTable = statement.executeUpdate(createTable());
        System.out.println("Create Table Row Effected :: "+creationTable);
        insertValue();
        con.close();
    }
}
