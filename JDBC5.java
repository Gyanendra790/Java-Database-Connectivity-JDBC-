//PROGRAM TO UPDATE DATA OF TABLE
import java.sql.*;
class JDBC5
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Root@123");
String query="update first_jdbc set Name=?,City=? where Id=?";
PreparedStatement psmt=con.prepareStatement(query);
psmt.setString(1,"Abhijeet Pal");
psmt.setString(2,"faizabad");
psmt.setInt(3,2);
psmt.executeUpdate();
System.out.println("Updated...");
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}