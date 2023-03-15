package ly.bankati.JDBC;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bankati", "root", "");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM client");
        while (rs.next()) {
            System.out.println(rs.getString("nom"));
            System.out.println(rs.getString("prenom"));

        }

    }
}