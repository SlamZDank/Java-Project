import java.util.ArrayList;

import elements.*;
import ui.*;

// This is a comment in Java yay!
/*
 * Time to write more comments
 * This is the main branch that will handle all the functionality provided bu other
 * Packages, packages will vary depending on the amount of effort im willing to give
 * into java shenanigins.
 */

public class Main {
    public static void main(String[] args) {
      DB listeEtudiant = new DB();
        ArrayList<Note> notes1 = new ArrayList<>();
        Note.MATH.setNote(14);
        Note.SVT.setNote(10); 
        Note.PHYSIQUE.setNote(15); 
        Note.SVT.setNote(12); 
        Note.CHIMIE.setNote(17); 
        Note.HISTOIRE.setNote(20);
        Note.GEOGRAPHIE.setNote(18); 
        Note.FRANCAIS.setNote(17);
        Note.ANGLAIS.setNote(19); 
        Note.ALLEMAND.setNote(20);
        notes1.add(Note.MATH);
        notes1.add(Note.PHYSIQUE);
        notes1.add(Note.SVT);
        notes1.add(Note.CHIMIE);
        notes1.add(Note.HISTOIRE);
        notes1.add(Note.GEOGRAPHIE);
        notes1.add(Note.FRANCAIS);
        notes1.add(Note.ANGLAIS);
        notes1.add(Note.ALLEMAND);
        Etudiant e1 = new Etudiant("Amine", "slama", "1/2/2003",notes1);

        ArrayList<Note> notes2 = new ArrayList<>();
        Note.MATH.setNote(13);
        Note.SVT.setNote(9); 
        Note.PHYSIQUE.setNote(11); 
        Note.SVT.setNote(10); 
        Note.CHIMIE.setNote(15); 
        Note.HISTOIRE.setNote(5);
        Note.GEOGRAPHIE.setNote(10); 
        Note.FRANCAIS.setNote(15);
        Note.ANGLAIS.setNote(18); 
        Note.ALLEMAND.setNote(14);
        notes2.add(Note.MATH);
        notes2.add(Note.PHYSIQUE);
        notes2.add(Note.SVT);
        notes2.add(Note.CHIMIE);
        notes2.add(Note.HISTOIRE);
        notes2.add(Note.GEOGRAPHIE);
        notes2.add(Note.FRANCAIS);
        notes2.add(Note.ANGLAIS);
        notes2.add(Note.ALLEMAND);
        Etudiant e2 = new Etudiant("Ali", "Zayen", "9/7/2003",notes2);
        listeEtudiant.ajoutEtudiant(e1);
        listeEtudiant.ajoutEtudiant(e2);
        listeEtudiant.afficheListeEtudiant();
       
    }
}