package public_access;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/*
 @author : deepal_suranga
 */
public class JavaDataBaseConnection {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3307/g4_2015_java_se_management_ramanifernando";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "WelComeDB1129";

    // public static void main(String[] args) {
    public static Connection myConnection() {

        System.out.println("-------- MySQL JDBC Connection ------------");

        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return null;
        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);
            
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return connection;
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        return connection;
    }
    
    //public static void main(String[] args) {
       // DB.myConnection();
       // Connection c=c.createStatement();
        
   // }
}
