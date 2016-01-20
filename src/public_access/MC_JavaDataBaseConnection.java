package public_access;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 @author : deepal_suranga
 */
public class MC_JavaDataBaseConnection {

    public MC_JavaDataBaseConnection() {
    }

    private static String HOST = "166.62.27.145";
    private static String DATABASE = "g4_2015_java_se_management_ramanifernando";
    private static String USER = "deepalsuranga";
    private static String PASS = "WelComeDB1129";
    private static String PORT = "3306";

    ///////////////////////////////////////////////////////////////////////////
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;

    //  Database credentials
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
            JOptionPane.showMessageDialog(null, "Connection Failed!Please Check Your Internet Connection");
            e.printStackTrace();
            return connection;
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
            JOptionPane.showMessageDialog(null, "Failed to make connection!");
        }
        return connection;
    }

}
