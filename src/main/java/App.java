import elements.*;
import UI.*;

// This is a comment in Java yay!

/*
 * Time to write more comments
 * This is the main branch that will handle all the functionality provided bu other
 * Packages, packages will vary depending on the amount of effort im willing to give
 * into java shenanigins.
 */


 // Refactoring the code in netbeans
public class App {
    public static void main(String[] args) {
      /* Etudiant e = new Etudiant("Slama","Med Amine","23 / 02 / 2003");
      e.ajouteNotes();
      System.out.println(e);
      e.toString(); */
      Login l = new Login();
      l.setVisible(true);
      l.pack();
      l.setLocationRelativeTo(null);
    }
}