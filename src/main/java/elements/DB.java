package elements;
import java.sql.*;
import UI.Dialogs;


/*
 * The implementation of DB using JDBC (Java Database Connectivity)
 * Hope its not that hard.
 */


 // There is a method on a db to export to CSV idk about pdf

 /*
  * Upon login ken we7ed yedekhel:
  *   1. ID jdid -> Creation mte3 info jdida fil table bel id jdid wel donnés ferghin
  *   2. ID deja mawjoud -> login mrgl wywerri l fields m3obbin bel valeurat mel data base
  *   3. "root" -> ye3mel search lel ness lkol "select * from Etudiant" w ywarrihom
  */

public  class DB {
    // static final String URL = "jdbc:mysql://localhost:3306/etudiant";
    // static final String USER = "sqluser";
    // static final String PASS = "password";
    private static Connection connection;
    public DB() {}
    
    public void ajoutEtudiant(){}

    public void supprimeEtudiant(){}

    public void afficheListeEtudiant(){

    }
   
    
    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/etudiant", "sqluser", "password");
                System.out.println("Connected to MySQL database");
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
                Dialogs.writeErr("Error", "<html>Failed to connect to MySQL database<br>* Data may not be loaded nor interacted with!<br><h3>- LIMITED FUNCTIONNALITY MODE -</h3>");
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }
        }
    }
    // public static void main(String[] args) throws SQLException {
    //     try(Connection conn = DriverManager.getConnection(URL, USER, PASS);
    //     Statement stmt = conn.createStatement();){
    //         String sql = "CREATE DATABASE new";
    //         stmt.executeUpdate(sql);
    //         System.out.println("Database created successfully...");
    //     }
    //     catch(SQLException e){
    //         e.printStackTrace();
    //     }
    // }
}