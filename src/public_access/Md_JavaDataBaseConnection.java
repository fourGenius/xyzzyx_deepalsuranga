package public_access;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/*
 @author : deepal_suranga
 */
public class Md_JavaDataBaseConnection {

    
    static private String HOST="166.62.27.145"; 
    static private String DATABASE="g4_2015_java_se_management_ramanifernando";
    static private String USER = "deepalsuranga";
    static private String PASS = "WelComeDB1129";
    static private String PORT="3306";
    
    ///////////////////////////////////////////////////////////////////////////
    
    public static String getHOST() {
        return HOST;
    }

    public static void setHOST(String HOST) {
        Md_JavaDataBaseConnection.HOST = HOST;
    }

    public static String getDATABASE() {
        return DATABASE;
    }

    public static void setDATABASE(String DATABASE) {
        Md_JavaDataBaseConnection.DATABASE = DATABASE;
    }

    public static String getUSER() {
        return USER;
    }

    public static void setUSER(String USER) {
        Md_JavaDataBaseConnection.USER = USER;
    }

    public static String getPASS() {
        return PASS;
    }

    public static void setPASS(String PASS) {
        Md_JavaDataBaseConnection.PASS = PASS;
    }

    public static String getPORT() {
        return PORT;
    }

    public static void setPORT(String PORT) {
        Md_JavaDataBaseConnection.PORT = PORT;
    }
    
    
    //////////////////////////////////////////////////////////////////////////
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;

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
    
   
}
