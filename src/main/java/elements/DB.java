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

public class DB {
    public DB() {}
    
    public void ajoutEtudiant(){}

    public void supprimeEtudiant(){}

    public void afficheListeEtudiant(){

    }
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Etudiant";
            // This is to connect to the database in table Etudiant
            String username = "root";
            String password = "0000";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement();
            //stmt.executeUpdate();
            
            ResultSet myRs =stmt.executeQuery("select * from Etudiant");
            while (myRs.next()){
                System.out.println(myRs.getString("nom") + ", " + myRs.getString("prenom"));
            }
            myRs.close ( ) ; stmt.close ( ); con.close ( );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}