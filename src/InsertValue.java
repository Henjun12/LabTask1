import java.sql.*;


public class InsertValue {
    static final String DB_URL = "jdbc:mysql://localhost/EMPLOYEEDB";
    static final String USER = "admin";
    static final String PASS = "admin1234";
    static String  driverName = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stm = con.createStatement();

            String sql = "INSERT INTO employeedb VALUES(1001,'Owen', 'Gege', 12678)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1002,'Ah', 'Cus', 13890)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1003,'Tony', 'George', 14901)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1004,'Bob', 'James', 15012)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1005,'David', 'Liam', 16123)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1006,'Olivia', 'Brown', 17234)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1007,'Ethan', 'Jones', 18345)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1008,'Emily', 'Johnson', 19456)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1009,'Sophia', 'Wilson', 10567)";
            stm.executeUpdate(sql);
            sql = "INSERT INTO employeedb VALUES(1010,'Chloe', 'Martinez', 11678)";
            stm.executeUpdate(sql);
            System.out.println("Inserting records ...");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
