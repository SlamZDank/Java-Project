package elements;
import java.sql.*;
import java.util.ArrayList;


/*
 * The implementation of DB using JDBC (Java Database Connectivity)
 * Hope its not that hard.
 */


 // There is a method on a db to export to CSV idk about pdf

public class DB {
    public DB() {}
    
    public void ajoutEtudiant(Etudiant e){}

    public void supprimeEtudiant(Etudiant e){}

    public void afficheListeEtudiant(){

    }
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/Etudiant";
            // This is to connect to the database in table Etudiant
            String username = "root";
            String password = "0000";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement();
            //stmt.executeUpdate();
            stmt.executeQuery("select * from Etudiant");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}