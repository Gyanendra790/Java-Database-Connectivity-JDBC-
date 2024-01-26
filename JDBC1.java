//JDBC PROGRAM FOR CREATING A TABLE IN DATABASE
import java.sql.*;
class JDBC1
{
public static void main(String args[])
{
try
{
//LOAD THE DRIVER
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/jdbc";
String username="root";
String password="Root@123";
//CREATE A CONNECTION
Connection con=DriverManager.getConnection(url,username,password);
//CREATE A QUERY
String query="create table first_jdbc(Id int(20) primary key auto_increment,Name varchar(50),City varchar(50))";
//CREATE A STATEMENT
Statement stmt=con.createStatement();
stmt.executeUpdate(query);
System.out.println("Table created...");
//CLOSE THE CONNECTION
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}