package elements;

import java.util.ArrayList;

/*
 * This concerns the implementation of Moyenne (multiple note) Class
 * u have:
 *      Constructor: Moyenne()
 *                   Moyenne(ArrayList<Note> Tab)
 *      Methods: getMoy() bech ne3mlou l sort 7esb l moyenne
 *               toString() fiha l report mte3 l'étudiant
 * 
 * in the Note (single note) Class you have:
 *      Constructor: Note(String Mat, double Note, double Coef)
 *                   getCoef()
 *                   getNote()
 *                   setCoef(double coef)
 *                   setMat(String mat)
 *   
 * 
 *  Matières: Math / Physique / Litteraire / Chimie / SVT / Histoire / Geographie / Francais / Anglais / Allmagne
 *              You can now hardcode their coefficient values
 *              For more info -> Check the note class
 *  Coef: 0.0 - 4.0      Arbitrary limit
 *  Note: 0.0 - 20.0      Arbitrary limit
 *  Mention: Trés bien / Bien / Assez Bien / Refusée
 *  
 */


public class Etudiant {
    private String nom,prenom,dateDeNaiss;
    private ArrayList<Note> notes ;

    public Etudiant(String nom, String prenom, String dateDeNaiss, ArrayList<Note> notes) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaiss = dateDeNaiss;
        notes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDateDeNaiss() {
        return dateDeNaiss;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
    public String toString(){
        return (nom + " " + prenom + " " + dateDeNaiss + " " + notes);
    }
}
