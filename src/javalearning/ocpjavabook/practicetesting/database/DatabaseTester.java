package javalearning.ocpjavabook.practicetesting.database;

import java.sql.*;

public class DatabaseTester {
    public static void main(String[] args) {
        try (Connection con = getConnection();
             Statement statement = con.createStatement()){
            int createTableStmt = statement.executeUpdate("" +
                    "CREATE TABLE Akord (" +
                    "ID int NOT NULL PRIMARY KEY," +
                    "Komplet varchar(255)," +
                    "Stawka double)");
            System.out.println(createTableStmt);

            int insertIntoTableStmt = statement.executeUpdate(
                    "INSERT INTO Akord VALUES (" +
                            "1, 'Monika', 40.00)");
            System.out.println(insertIntoTableStmt);

            ResultSet query = statement.executeQuery(
                    "SELECT * FROM Akord");

            while(query.next()){
                System.out.print(query.getInt("ID") + "-");
                System.out.print(query.getString("Komplet") + "-");
                System.out.println(query.getDouble("Stawka"));
            }

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
