package public_access;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/*
 @author : deepal_suranga
 */
public class MC_JavaDataBaseConnection {

    public MC_JavaDataBaseConnection() {
    }

    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    private static String HOST = null;
    private static String DATABASE = null;
    private static String USER = null;
    private static String PASS = null;
    private static String PORT = null;

    //  Database credentials
    // public static void main(String[] args) {
    public static Connection myConnection() {

        //////////////////////////////////////////////////////////////////////
        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("src\\FourGenius\\db_pro.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("prot"));
            System.out.println(prop.getProperty("dbname"));
            System.out.println(prop.getProperty("username"));
            System.out.println(prop.getProperty("host"));

            HOST = prop.getProperty("host");
            PORT = prop.getProperty("prot");
            DATABASE = prop.getProperty("dbname");
            USER = prop.getProperty("username");
            PASS = prop.getProperty("password");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        ////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;

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
