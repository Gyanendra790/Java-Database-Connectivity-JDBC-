//PROGRAM TO INSERT PICTURE IN DATABASE
import java.sql.*;
import java.io.*;
class JDBC4
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Root@123");
String query="insert into pic(img) values(?)";
PreparedStatement psmt=con.prepareStatement(query);
FileInputStream fis=new FileInputStream("banner.jpg");
psmt.setBinaryStream(1,fis,fis.available());
psmt.executeUpdate();
System.out.println("Image inserted..");
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
