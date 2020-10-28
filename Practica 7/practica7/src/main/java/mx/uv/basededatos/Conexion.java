package mx.uv.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
    public static String url = "jdbc:mysql://127.0.0.1:3306/ejemplo_simple?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false";
    public static String driverName = "com.mysql.cj.jdbc.Driver";
    public static String user ="root";
    public static String password ="";
    public static Connection connection = null;

    public static Connection getConnection(){
        try {
            class.forName(driverName);
            connection = DriverManager.getConnection(,user,password);
            System.out.println("Success connection:");
        } catch (SQLException e) {
            System.out.println("Failed to create the database connection:");
        } catch (ClassNotFoundException e){
            System.out.println("Driver not found:");
        }
        return connection;
    }
}