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
    private int id;
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
    public String getField(String fieldName) {
        switch (fieldName) {
            case "id":
            return String.valueOf(this.id);
            case "Name":
                return this.nom;
            case "Surname":
                return this.prenom;
            case "Date of Birth (YYYY-MM-DD)":
                return this.dateDeNaiss;
                case "Math":
                return String.valueOf(getNoteMath());
            case "Physics":
                return String.valueOf(getNotePhysique());
            case "Literature":
                return String.valueOf(getNoteLitterature());
            case "Science":
                return String.valueOf(getNoteSvt());
            case "Chemistry":
                return String.valueOf(getNoteChimie());
            case "History":
                return String.valueOf(getNoteHistoire());
            case "Geography":
                return String.valueOf(getNoteGeographie());
            case "French":
                return String.valueOf(getNoteFrancais());
            case "English":
                return String.valueOf(getNoteAnglais());
            case "German":
                return String.valueOf(getNoteAllemand());
           

            default:
                return null; // Or throw an exception if the field name is not recognized
        }
    }

    
    public String getNom() { return nom; }
    
    public String getPrenom() { return prenom; }
    
    public void setId(int id ) {
        this.id= id;
    }
     public int getId() {
        return id;
     }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setDateDeNaiss(String dateDeNaiss) {
        this.dateDeNaiss = dateDeNaiss;
    }
    public void setNoteMath(double m) {
        Note noteMath = Note.MATH;
        noteMath.setNote(m);
    }
    
    public void setNotePhysique(double p) {
        Note notePhysique = Note.PHYSIQUE;
        notePhysique.setNote(p);
    }
    public void setNoteLitterature(double p) {
        Note noteLitterature = Note.LITTERAIRE;
        noteLitterature.setNote(p);
    }
    
    public void setNoteChimie (double l) {
        Note noteChimie = Note.CHIMIE;
        noteChimie.setNote(l);
    }
    public void setNoteSvt(double s){
        Note noteSvt = Note.SVT;
        noteSvt.setNote(s);
    }
    public void setNoteHistoire(double l) {
        Note noteHistoire = Note.HISTOIRE;
        noteHistoire.setNote(l);
    }
    public void setNoteGeographie(double l) {
        Note noteGeographie = Note.GEOGRAPHIE;
        noteGeographie.setNote(l);
    }
    public void setNoteFrancais(double l) {
        Note noteFrancais = Note.FRANCAIS;
        noteFrancais.setNote(l);
    }
    public void setNoteAnglais(double l) {
        Note noteAnglais = Note.ANGLAIS;
        noteAnglais.setNote(l);
    }
    public void setNoteAllemand(double l) {
        Note noteAllemand = Note.ALLEMAND;
        noteAllemand.setNote(l);
    }

    public double getNoteMath(){
        Note noteMath = Note.MATH;
        return noteMath.getNote();
    }
    
    public double getNotePhysique(){
        Note notePhysique = Note.PHYSIQUE;
        return notePhysique.getNote();
    }
    
    public double getNoteLitterature(){
        Note noteLitteraire = Note.LITTERAIRE;
        return noteLitteraire.getNote();
    }
    
    public double getNoteSvt(){
        Note noteSvt = Note.SVT;
        return noteSvt.getNote();
    }
    
    public double getNoteChimie(){
        Note noteChimie = Note.CHIMIE;
        return noteChimie.getNote();
    }
    
    public double getNoteHistoire(){
        Note noteHistoire = Note.HISTOIRE;
        return noteHistoire.getNote();
    }
    
    public double getNoteGeographie(){
        Note noteGeographie = Note.GEOGRAPHIE;
        return noteGeographie.getNote();
    }
    
    public double getNoteFrancais(){
        Note noteFrancais = Note.FRANCAIS;
        return noteFrancais.getNote();
    }
    
    public double getNoteAnglais(){
        Note noteAnglais = Note.ANGLAIS;
        return noteAnglais.getNote();
    }
    
    public double getNoteAllemand(){
        Note noteAllemand = Note.ALLEMAND;
        return noteAllemand.getNote();
    }
    

    public String getDateDeNaiss() { return dateDeNaiss; }

    
    
    

    public String toString(){
        if (moy != null) {return (nom + " " + prenom + " " + dateDeNaiss + " " + moy.toString());}
        return (nom + " " + prenom + " " + dateDeNaiss);
    }
}
