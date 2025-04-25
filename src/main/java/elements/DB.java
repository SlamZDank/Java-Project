package elements;

import java.sql.*;
import UI.Dialogs;

/*
 * The implementation of DB using JDBC (Java Database Connectivity)
 * Hope it's not that hard.
 */

// There is a method on a db to export to CSV idk about pdf

/*
 * Upon login ken we7ed yedekhel:
 *   1. ID jdid -> Creation mte3 info jdida fil table bel id jdid wel donnés ferghin
 *   2. ID deja mawjoud -> login mrgl wywerri l fields m3obbin bel valeurat mel data base
 *   3. "root" -> ye3mel search lel ness lkol "select * from Etudiant" w ywarrihom
 */

public class DB {
    // static final String URL = "jdbc:mysql://localhost:3306/etudiant";
    // static final String USER = "sqluser";
    // static final String PASS = "password";
    private static Connection connection;

    public DB() {
    }

    public void ajoutEtudiant() {
    }

    public void supprimeEtudiant() {
    }

    public void afficheListeEtudiant() {

    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaProject", "root", "");
                System.out.println("Connected to MySQL database");
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
                Dialogs.writeErr("Error",
                        "<html>Failed to connect to MySQL database<br>* Data may not be loaded nor interacted with!<br><h3>- LIMITED FUNCTIONNALITY MODE -</h3>");
            }
        }
        return connection;
    }
}
