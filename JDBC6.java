//SELECTING DATA FROM TABLE
import java.sql.*;
class JDBC6
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Root@123");
String query="select * from first_jdbc";
PreparedStatement psmt=con.prepareStatement(query);
ResultSet set=psmt.executeQuery();
while(set.next())
{
System.out.println(set.getInt(1)+":"+set.getString(2)+":"+set.getString(3));
}
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}