//PROGRAM TO INSERT DATA INTO TABLE WITH USER INPUT
import java.sql.*;
import java.util.*;
class JDBC3
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/jdbc";
String username="root";
String password="Root@123";
Connection con=DriverManager.getConnection(url,username,password);
String query="insert into first_jdbc(Name,City) values(?,?)";
PreparedStatement psmt=con.prepareStatement(query);
System.out.println("Enter name and city");
String name=in.nextLine();
String city=in.nextLine();
psmt.setString(1,name);
psmt.setString(2,city);
psmt.executeUpdate();
System.out.println("Data Inserted");
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}