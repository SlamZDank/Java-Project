package elements;

// import java.util.*;

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

    public void setHimself(String nom, String prenom, String dateDeNaiss, double m, double p, double l, double s, double c, double h, double g, double fr, double en, double ger){
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaiss = dateDeNaiss;
        ajouteNotes(m, p, l, s, c, h, g, fr, en, ger);
        // It is going to be garbage collected anyway.
    }

    public void ajouteNotes(double m, double p, double l, double s, double c, double h, double g, double fr, double en, double ger){
        moy = new Moyenne();

        Note noteMath = Note.MATH;
        noteMath.setNote(m);

        Note notePhy = Note.PHYSIQUE;
        notePhy.setNote(p);

        Note noteLit = Note.LITTERAIRE;
        noteLit.setNote(l);

        Note noteSvt = Note.SVT;
        noteSvt.setNote(s);

        Note noteChim = Note.CHIMIE;
        noteChim.setNote(c);

        Note noteHis = Note.HISTOIRE;
        noteHis.setNote(h);

        Note noteGeo = Note.GEOGRAPHIE;
        noteGeo.setNote(g);
        
        Note noteFr = Note.FRANCAIS;
        noteFr.setNote(fr);

        Note noteAng = Note.ANGLAIS;
        noteAng.setNote(en);

        Note noteGer = Note.ALLEMAND;
        noteGer.setNote(ger);

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
    }

    public String getNom() { return nom; }

    public String getPrenom() { return prenom; }

    public String getDateDeNaiss() { return dateDeNaiss; }


    public String toString(){
        if (moy != null) {return (nom + " " + prenom + " " + dateDeNaiss + " " + moy.toString());}
        return (nom + " " + prenom + " " + dateDeNaiss);
    }
}
