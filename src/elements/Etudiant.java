package elements;

import java.util.*;

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
 *  
 *              You can now hardcode their coefficient values
 *              For more info -> Check the note class
 *  Coef: 0.0 - 4.0      Arbitrary limit
 *  Note: 0.0 - 20.0      Arbitrary limit
 *  Mention: Trés bien / Bien / Assez Bien / Refusée
 *  
 */


public class Etudiant {
    private String nom,prenom,dateDeNaiss;
    public Moyenne moy = null;

    public Etudiant(String nom, String prenom, String dateDeNaiss) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaiss = dateDeNaiss;
    }

    public void ajouteNotes(){
        moy = new Moyenne();
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner les notes: ");

        System.out.println("Math: ");
        Note noteMath = Note.MATH;
        noteMath.setNote(sc.nextDouble());

        System.out.println("Physique: ");
        Note notePhy = Note.PHYSIQUE;
        notePhy.setNote(sc.nextDouble());
        
        System.out.println("Litteraire: ");
        Note noteLit = Note.LITTERAIRE;
        noteLit.setNote(sc.nextDouble());

        System.out.println("Svt: ");
        Note noteSvt = Note.SVT;
        noteSvt.setNote(sc.nextDouble());

        System.out.println("Chimie: ");
        Note noteChim = Note.CHIMIE;
        noteChim.setNote(sc.nextDouble());

        System.out.println("Histoire: ");
        Note noteHis = Note.HISTOIRE;
        noteHis.setNote(sc.nextDouble());

        System.out.println("Geographhie: ");
        Note noteGeo = Note.GEOGRAPHIE;
        noteGeo.setNote(sc.nextDouble());
        
        System.out.println("Français: ");
        Note noteFr = Note.FRANCAIS;
        noteFr.setNote(sc.nextDouble());

        System.out.println("Anglais: ");
        Note noteAng = Note.ANGLAIS;
        noteAng.setNote(sc.nextDouble());

        System.out.println("Allemand: ");
        Note noteGer = Note.ALLEMAND;
        noteGer.setNote(sc.nextDouble());

        //Matières: Math / Physique / Litteraire / Chimie / SVT / Histoire / Geographie / Francais / Anglais / Allmagne
        moy.push(noteMath);
        moy.push(notePhy);
        moy.push(noteLit);
        moy.push(noteSvt);
        moy.push(noteChim);
        moy.push(noteHis);
        moy.push(noteGeo);
        moy.push(noteFr);
        moy.push(noteAng);
        moy.push(noteGer);

        sc.close();
    }

    public String getNom() { return nom; }

    public String getPrenom() { return prenom; }

    public String getDateDeNaiss() { return dateDeNaiss; }


    public String toString(){
        if (moy != null) {return (nom + " " + prenom + " " + dateDeNaiss + " " + moy.toString());}
        return (nom + " " + prenom + " " + dateDeNaiss);
    }
}
