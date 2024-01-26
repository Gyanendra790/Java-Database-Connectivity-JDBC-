//PROGRAM TO INSERT DATA IN TABLE
import java.sql.*;
class JDBC2
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/jdbc";
String username="root";
String password="Root@123";
Connection con=DriverManager.getConnection(url,username,password);
String query="insert into first_jdbc(Name,City) values(?,?)";
PreparedStatement psmt=con.prepareStatement(query);
psmt.setString(1,"Gyanendra Pratap Shukla");
psmt.setString(2,"Ambedkar Nagar");
psmt.executeUpdate();
System.out.println("Data Inserted...");
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}