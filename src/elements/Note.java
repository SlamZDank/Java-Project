package elements;
import java.util.Scanner;


public enum Note {
    /*
     * Implemets a cstor method that requires you to type each coefficient
     * You could change that so the coefficient become hardtyped
     * 
     * Added additional getters and setters to see what you need
     * You will surely need the -> setNote(double note) 
     * method.
     */

     // this.name() -> Treje3 Math walla SVT walla... 3ala 7asb l variant mte3 enum

// Example of implementation with hardcoded coef value (RECOMMENDED):
    // MATH(1.0),
    //       ^  Coefficient
    MATH(2.0), 
    PHYSIQUE(3.5), 
    LITTERAIRE(1.0), 
    CHIMIE(1.5), 
    SVT(4.0), 
    HISTOIRE(1.0), 
    GEOGRAPHIE(1.0), 
    FRANCAIS(2.0), 
    ANGLAIS(2.0), 
    ALLEMAND(1.0);

    private String Mat;
    private double Note;
    private double Coef;

    private Note(){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Matière: " + this.name() + ": ");
        // System.out.println("Donner le Coefficient: ");
        // Coef = sc.nextDouble();
        // sc.close();
        System.out.println("Here is the Note constructor ");
    }

    private Note(double Coef) {this.Coef = Coef;}

    public double getCoef(){return Coef;}
    public double getNote() {return Note;}
    public String getMat() {return this.name();} 
    public void setCoef(double coef) {Coef = coef;}
    public void setNote(double note) {Note = note;}
    public String toString(){
        return "Mat: " + this.getMat() + " Note: " + this.getNote() + " Coef: " + this.getCoef();
    }
}
