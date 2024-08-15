package in.raj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertBook {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";
    private static final String DB_Uname = "root";
    private static final String DB_PWD = "root";
    private static final String INSERT_SQL = "INSERT INTO BOOKS VALUES(103,'AWS',5000)";

    public static void main(String[] args) throws Exception {
        // TODO -> 1. Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // TODO -> 2. Get DB Connection
        //DriverManager.getConnection("jdbc:mysql://localhost:3306/advjdb","root","root");
        Connection con = DriverManager.getConnection(DB_URL, DB_Uname, DB_PWD);

        // TODO -> this is con.toString() :: com.mysql.cj.jdbc.ConnectionImpl@48524010
        System.out.println(con);

        // TODO -> 3. Create Statement
        Statement stmt = con.createStatement();

        // TODO -> 4. Execute Query
        int rowsEffected = stmt.executeUpdate(INSERT_SQL);

        // TODO -> 5. Process Result
        System.out.println("Record Inserted Count :: " + rowsEffected);

        // TODO -> 6. Close Connection
        con.close();
    }
}