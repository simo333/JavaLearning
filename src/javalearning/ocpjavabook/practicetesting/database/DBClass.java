package javalearning.ocpjavabook.practicetesting.database;

import java.sql.*;

public class DBClass {
    public static void main(String[] args) {
        try (Connection con = getConnection();
             Statement statement = con.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM tree");){
            if(rs.next())
                System.out.println(rs.getString(2));

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    private static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Test";
        String userName = "root";
        String password = "admin96";
        return DriverManager.getConnection(url, userName, password);
    }

}
