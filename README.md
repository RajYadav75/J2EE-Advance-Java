=======================
What is Software Project ?
=======================

=> Collection of Programs is called as Software Project

=> In industry we can see 3 types of software projects


			1) Scratch development  (Brand New)

			2) Maintenence / Support Projects

			3) Migration Projets


===========================
Types of applications using Java
===========================

1) Stanadlone applications

		Ex : Eclipse IDE, Calculator, Notepad++ etc..

2) Web Applications ( C 2 B )
		
		Ex: www.gmail.com, www.facebook.com etc...

3) Distributed Applications ( B 2 B )

		Ex: gpay, phonepay, paytm, makemytrip, irctc......



============================
How to deliver project to client ?
============================

1) Standalone Application  : The project which runs in only one machine

Note : Standalone applications we will deliver as JAR file (Java Archieve)

Note: JAR contains collection of .class files

2) Web Application : Everybody can access through browser

Note: Web Applications will be delivered as WAR file (Web Archieve)

Note: To run "web application" war file we need Server (Ex: Tomcat)

3) Enterprise Application : Distributed Application

Note: Enterprise applications will be delivered as EAR file (Enterprise Archieve)

			
				JAR : Java Archieve
				WAR : Web Archieve
				EAR : Enterprise Archieve

========================
Java Project Architecture
=========================

1) Presentation Layer : User Interface (UI)

								 - HTML & CSS
								 - Java Script
								 - BootStrap
								 - JSP (Java Server Pages)
								 - Angular / React JS


2) Web Layer :  It contains logic to deal with Request & Response

						- Servlets
						- Spring Web MVC

3) Business Layer : It contains business logic

						- form validation
						- sending email
						- sending OTP
						- generate excel / pdf
						- calculations

4) Persistence Layer : It contains logic to communicate with Database
		
						- JDBC
						- Spring JDBC
						- Hibernate
						- Data JPA


====================
How to create JAR file
====================

-> JAR stands for Java Archieve

-> JAR contains collection of .class files


Syntax:  	jar  cvfe  <filename.jar>  <main-class>  *.class

	
			a)  jar is a command to deal with jar files

				c - means create
				v - verbose
				f  - file
				e - entrypoint

			b)  main-class represents entrypoint for our application execution

			c) *.class means packaging all .class files available in current working directory


====================
How to run JAR file
====================

Syntax :    java   -jar  <jar-file-name.jar>

====================
How to Extract JAR file
====================

Syntax :    jar -xvf  <jar-file-name.jar>
============================================
What is the difference between PATH & CLASSPATH ?
============================================

-> PATH is used to locate where our java s/w got installed

-> CLASSPATH is used locate where our .class files / jar files are available

Note: If we set PATH & CLASSPATH in command prompt then they are temporary. If we close CMD then we will loose them.

-> TO set them permanently we need to use Environment Variables.

============
What is API ?
============

=> API  stands for Application Programming Interface

=> API contains set of classes and interfaces

=> Sun Microsystem provided JSE API and JEE API

=> JSE API contains set of classes & interfaces which are used to develop Standalone applications

=> JEE API contains set of classes & interfaces which are used to develop Web applications.

=> To understand classes, interfaces, methods available in the APIs Sun Microsystem provided documentation for us.

		URL : https://docs.oracle.com/javase/8/docs/api/

========================================
How to create documentation for our project ?
========================================

-> To create documentation for our project we can use below command

		Syntax :   javadoc *.java

-> The above command will create several HTML files

-> We need to open "index.html" file in browser to get documentation of our project.

Note: To provide metadata of our code (class, methods, interfaces) we will use java documentation comments 

/**
*
*
*
*/


==================
What is Build Path ? 
==================

-> Jar contains .class files

-> Jar files are also called as Libraries

-> When we want to libraries in our project then we need to add them to Build Path

Ex:
----
			1) servlet library we need to develop web app using java
			2) To communicate with database we need jdbc library




================
Java De-Compiler
================

-> It is used to convert byte code to source code

-> We can download java decompiler to convert byte code to source code

-> Using below URL we can dowload Java De-Compiler

URL : https://github.com/java-decompiler/jd-gui/releases/download/v1.6.6/jd-gui-windows-1.6.6.zip


=============
Database
=============

=> Database is a software which is used to store the permanentley

	Ex: Oracle, MySQL,  SQLServer, PostGresSQL

=> To work with database we need to install Database software

=> Database Server software will store the data in the form of tables, rows and columns

=> Database Client software is used to communicate with Database Server Software

										
									SQL 
			DataBase client -----------------------------------> Database Server

Note: SQL (Structured Query Language) queries will be used to communicate Database Server


=> To communicate with Oracle DB server we can use "SQL Developer" as a client software

=> To communicate with MySQL DB server we can use "MySQL Workbench" as a client software

Note: SQL Developer  & MySQL Workbench softwares are used to execute SQL queries

======
JDBC
======

=> JDBC API released by Sun Microsystem

=> Using JDBC API we can communicate with Database software using Java Program

=> JDBC API will act as mediator between Java Program and Database software

								
								JDBC API
			Java Program ----------------------------------> Database Server


=> JDBC API contains set of interfaces & classes


=> Database Software vendors provided implementation for JDBC API. As part of JDBC API implementation they provided Database Driver

Note: Every Database software having its own Driver.

			
				Oracle Database ------------> OracleDriver

				MySQL Database ----------> MySQL Driver

				SQL Server ------------------> SQLDriver


Note: Driver is a program which knows how to connect with Database Software.

=> Database Driver software released as jar file

		
			MySQL Driver ===========> mysql-connector.jar

			Oracle Driver ==========> ojdbc14.jar


Note: We need to download that jar file and add to project build path.

=====================
JDBC API Components
=====================

---------------
Interfaces
---------------
Driver
Connection
Statement
PreparedStatement
CallableStatement
ResultSet
RowSet

-------------
Classes
------------
DriverManager
Types
Date

-------------------
Exceptions
--------------------
SQLException



============================
Steps to develop JDBC Program
============================

1) Load the Driver class

2) Get Connection from Database

3) Create Statement / PreparedStatement / Callable Statement

4) Execute Query

5) Process the Result

6) Close the Connection




====================================
Setup Database & Table in MySQL DB
===================================

=> Connect to MySQL Database Server using MySQL Workbench

# To display list of databases available
$ show databases;

# To create new database in DB server
$ create database advjdb;

# To Select database to perform our operations
$ use advjdb;

# To display all tables available in the database
$ show tables;

# Create Table in the database

CREATE TABLE BOOKS ( 

		BOOK_ID   INT (10),

		BOOK_NAME VARCHAR(100),

		BOOK_PRICE  INT(10)
);

commit;
===============
Types Of Queries
===============

=> Database queries are divided into 2 types

	1) DML Queries / Non - Select ( CREATE, INSERT,  UPDATE & DELETE)

	2) DQL QUERIES / SELECT 


=> To execute NON-SELECT queries we will use below method 

	Syntax :  	int executeUpdate (String sql ) ;

Note: The above method parameter represents query which we want to execute and method return type represents how many rows effected in db table with given query.

=> To execute SELECT queries we will use below method

	Syntax :   ResultSet  executeQuery (String sql)

Note: The above method parameter represents query which we want to execute and method return type represents records returned by given Query.

=> ResultSet represents records returned by given select query.

============================
SELECT OPERATION USING JDBC
============================


=> When we execute select query using JDBC then we will get data from database in the form of ResultSet object

=> ResultSet Object will maintain a Cursor which will point to current row.

Note: Intially ResultSet cursor will point before first row. We need to move the cursor to next position by calling next ( ) method.


		Syntax :     boolean next ( ) 


-> When record is present next ( ) method will return true otherwise it will return false.
Note : By Default ResultSet cursor will move in forward direction. Based on the Requirement we can make it as Bi Directional.

==============
ResultSet Types
==============

=> ResultSet will represent data given by our select query

=> ResultSet will maintains cursor to point the rows

=>Initially ResultSet cursor will be available before first record

=> We need to move RS cursor to next position by calling next ( ) method

Note: By Default ResultSet is FORWARD_DIRECTIONAL


1) TYPE_FORWARD_ONLY    ( by default )

2) TYPE_SCROLL_INSENSITIVE

3) TYPE_SCROLL_SENSITIVE


=>  INSENSITIVE & SENSITIVE ResultSets are scrollable and Bi-Directional

=> ResuletSet concurrency will represent changes of ResultSet data

1) CONCUR_READ_ONLY

2)  CONCUR_UPDATABLE


-> CONCUR_READ_ONLY will allow only read operation on the ResultSet

-> CONCUR_UPDATABLE will allow update operations also on the ResultSet


Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 						           ResultSet.CONCUR_UPDATABLE);
===========================================================================

boolean next ( ) : To move cursor next position

absolute (int row ) : To move cursor to specific row

boolean last ( ) : To move cursor to last row

boolean previous ( ) : To move cursor to previous row

int getInt (int index ) : To get current row column data based on column index

int getInt (String columnName ) : To get current row column data based on column index

==================
Prepared Statement
==================

=> PreparedStatement is used to execute both SELECT & NON-SELECT Queries

=> PreparedStatement will support for Positional Parameters ( ? ) in the Query

=> Postional Parameters are used to supply dynamic values to Query in the Run time.

=> When we want to execute same query multiple times with different values then it is highly recommended to use PreparedStatement.

 Query Without Positional Parameters :   INSERT INTO BOOKS VALUES (101, "JAVA", 5000);

 Query With Positional Parameters :   	INSERT INTO BOOKS VALUES (?, ?, ?) ;


Note: Positional Parameters index will start from 1.
public String login (String name , String pwd ) {

"select * from users where uname = ' " + name +"  and pwd  ' = " + pwd + " '  ";

}


name : raj--
pwd: 123

		select * from users where uname=raj  -- and pwd = 123;
  ========================
syntax to create Procedure
========================

CREARE PROCEDURE <PROCEDURE-NAME>  ( params.... )

BEGIN

		// SQL STATEMENTS

END ;


=> A procedure can have 3 types of Parameters


		1) IN    ----> represents input

		2) OUT  ----> represents output

		3) INOUT   ---> represents both input & output



============== Procedure without IN & OUT Parameters ============

DELIMITER $$
CREATE PROCEDURE getBooksData ( )
BEGIN
	SELECT * FROM BOOKS;
END $$

// call the procedure in workbench
call getBooksData ( ) ;
=============================================================
===================== PROCEDURE WITH IN PARAMETER ==================

DELIMITER $$
CREATE PROCEDURE getBookById ( IN BID  INT )
BEGIN
	SELECT * FROM BOOKS WHERE BOOK_ID=BID;
END $$

// call the procedure in workbench

call getBookById (101);

=====================================================================
====================== Procedure with IN & OUT Parameters ==============================

DELIMITER $$
CREATE PROCEDURE getBookNameByPrice
( 
		IN bprice INT, 
		OUT bname VARCHAR(100) 
)

BEGIN
	SELECT BOOK_NAME as bname from BOOKS where BOOK_PRICE <= bprice ;
END $$

// call the procedure in workbench
CALL getBookNameByPrice(5000, @bname);

==========================================================================================
===================================================================================
1) What is Class Path ?
2) How to set Class Path ?
3) What is JAR ?
4) What is API ?
5) What is JDBC ?
6) JDBC Driver
7) JDBC Connection
8) Statement ( SELECT * NON-SELECT QUERIES )
9) PreparedStatement  ( SELECT * NON-SELECT QUERIES with Positional  Parameters )
10) CallableStatement ( Procedures - IN & OUT Params )
11) Result Set
12) ResultSet Types (Sensitive, Insensitive ResultSet, READ-ONLY, CONCUR-UPDATABLE)
===================================================================================

====================
JDBC Batch Operations
====================

=> Batch means Bulk Operation

=> When we want to perform Bulk Operations in Database then we can use JDBC Batch Operations concept.
======================
Transactions in JDBC
=======================

=> Single Unit amount of work is called as Transaction

=> We can execute multiple Queries in single transaction

Note: Every Transaction should follow ACID Properties

		A - Atomocity

		C - Consistency

		I  - Isolation

		D - Durability




Note: When we are performing NON-SELECT OPERATIONS (insert / update/ delete) with Database then Transaction is mandatory.

=> For Select Operations Transaction is optional.

=> When we are performing multiple operations in single transaction then either all operations should be success or none of the operation should be success.


		Transcation Commit  -  to save the operation  permanently

		Transaction Rollback - to undo the operation


=> In JDBC, transaction will be committed by default for every non select query execution because  by default Transaction Auto Commit is true.

   	con.setAutoCommit ( true ) ; // this is default behaviour of Connection obj


=> If we want to manage Transactions in JDBC we need to set AutoCommit as False.

		con.setAutoCommit ( false ) ;


Note: When Auto Commit is false, we need to commit the transaction programmatically to save our operation in database.


Tx Mgmt Code Snippt
====================

				Connnection con = DriverManager.getConnection(url, uname,pwd);

				con.setAutoCommit (false);

				try{
						// logic to execute queries

						con.commit ( );

				} catch(Exception e){
					con.rollback ( ) ;
				}
===================
Connection Pooling
===================

=> Connection Pooling is the process of getting fixed no.of connections from database and store them into a pool for re-usability.

=> If we don't use Connection Pooling concept then our project will run into Connections Exhausted Problem (No connections available to communicate with db)


=> If we use DriverManager.getConnection ( ) it will give physical connection with database. It is not at all recommended to use Physical Connections.

=> Always we need to use Logical Connections to perform DB operations. To use Logical connections we need to setup Connection Pool.


Note: With the connection pooling we can improve performance of the application.







===========================
How to setup Connection Pool
==========================

=> We can setup Connection Pool in 2 ways

		1) Client Side Connection Pool

			Ex: DBCP, C3P0, Hikari etc....

		2) Server Managed Connection Pool

			Ex: Tomcat, JBoss, WebLogic etc...


===============================================
Steps to develop JDBC app with Hikari Connection Pool
===============================================

1) Create Java Project in IDE

2) Add below jars to project build path

		a) Hikar-CP.jar
		b) SLF4J-api.jar
		c) mysql-connector.java

===============================
Working with Properties files in Java
===============================

-> As of now in JDBC programs we have declared Database properties which is not at all recommended because if database properties are modified then we need to modify our java programs also.

Note: In realtime project we will have multiple databases like below

			a) Dev DB   (Developers will use this db)
			b) SIT DB   (Testers will use this db)
			c) UAT DB  (client side testing will happen with this db)
			d) Prod DB  (live application will use this db)


Note : Every database will have different credentials so when we want to change the database then we have to change our java programs which is not a good practise.


-> We need to seperate our Java programs with Database Properties using properties file

-> Properties file is used to configure properties in the form of key-value pair


Note: file name can be anything but extension should be .properties only


-> To work with properties files we have "java.util.Properties" class. Using this class we can store the data in properties file and we can get data from Properties file.


load (InputStream is) --> To load all properties into Properties object

getProperty(String key) ---> To load property value based on given key

setProperty(String key, String value ) ---> To set new property with key-value pair

size ( ) ---> To get count of properties









=> Connection pool should be created only one time when the project starts... and we need to re-use connections from pool for our db operations.


package in.raj;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionFactory {

	private static DataSource datasource = null;

	static {

		try {

			File f = new File("DB.properties");
			FileInputStream fis = new FileInputStream(f);

			Properties p = new Properties();
			p.load(fis);

			String url = p.getProperty("db.url");
			String uname = p.getProperty("db.uname");
			String pwd = p.getProperty("db.pwd");
			String poolSize = p.getProperty("db.poolSize");

			HikariConfig config = new HikariConfig();

			config.setJdbcUrl(url);
			config.setUsername(uname);
			config.setPassword(pwd);
			config.setMaximumPoolSize(Integer.parseInt(poolSize));

			datasource = new HikariDataSource(config);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getDBConnection() throws Exception {
		return datasource.getConnection();
	}

}


package in.raj;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookStore {

	public static void main(String[] args) throws Exception {

		Connection con = ConnectionFactory.getDBConnection();

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("select * from books");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "--" + rs.getString(2) + "--" + rs.getDouble(3));
		}

		rs.close();
		stmt.close();
		con.close();
	}

}


=====================Insert image into database ===================

create table person (pid int, pimage blob(1000));

==============================================================

package in.raj;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookStore {

	public static void main(String[] args) throws Exception {

		File f = new File("file-path");
		FileInputStream fis = new FileInputStream(f);

		Connection con = ConnectionFactory.getDBConnection();

		String sql = "INSERT INTO PERSON VALUES (?,?)";

		PreparedStatement pstmt = con.prepareStatement(sql);

		pstmt.setInt(1, 101);
		pstmt.setBlob(2, fis);

		int count = pstmt.executeUpdate();

		System.out.println("Rows Inserted :: " + count);

		pstmt.close();
		con.close();

	}

}

=========================Read Image from Database ===============

package in.raj;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookStore {

	public static void main(String[] args) throws Exception {

		Connection con = ConnectionFactory.getDBConnection();

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM PERSON");
		
		if (rs.next()) {
			System.out.println(rs.getInt(1));
			byte[] stream = rs.getBytes(2);

			FileOutputStream fos = new FileOutputStream("path\\image.png");
			fos.write(stream);
			fos.close();
		}
		con.close();
	}
}

======================RowSet Example =========================

public class BookStore {

	public static void main(String[] args) throws Exception {

		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

		rowSet.setUrl("jdbc:mysql://localhost:3306/advjdb");
		rowSet.setUsername("root");
		rowSet.setPassword("root");

		rowSet.setCommand("select * from books");
		
		rowSet.execute();

		while (rowSet.next()) {
			System.out.print(rowSet.getInt(1) + "\t");
			System.out.print(rowSet.getString(2) + "\t");
			System.out.println(rowSet.getInt(3));
		}
		rowSet.close();
	}
}

============================================================================

=====================
Types of JDBC Drivers
=====================

=> In JDBC we have 4 types of drivers

	a) Type-1 Driver

	b) Type-2 Driver

	c) Type -3 Driver

	d) Type-4 Driver


Note: Type-1, Type-2, Type-3 drivers are outdated, we are using Type-4 driver.
