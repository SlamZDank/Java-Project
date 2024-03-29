package elements;
import java.sql.*;



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
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
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
}
