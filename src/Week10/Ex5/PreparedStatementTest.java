package Week10.Ex5;
import java.sql.*;

public class PreparedStatementTest {
    private PreparedStatement pst;
    private Connection con;

    // JDBC driver name and database URL
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;database=Product;integratedSecurity=true";

    public PreparedStatementTest(){
        try{
            Class.forName(DRIVER);

            // Establish Connection
            con = DriverManager.getConnection(DATABASE_URL);

            pst = con.prepareStatement("INSERT into Product (productID, prod_name, productPrice, prod_desc) VALUES(?,?,?,?)");
            pst.setInt(1,1);
            pst.setString(2,"Playstation 4");
            pst.setString(3,"499,99");
            pst.setString(4,"Sony");

            pst.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Done");
            try{
                pst.close();
                con.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        PreparedStatementTest pst = new PreparedStatementTest();
    }
}
