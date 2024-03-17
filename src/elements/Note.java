package elements;
import java.util.Scanner;


public enum Note {
    /*
     * Implemets method that requires you to type each note and each coefficient
     * You could change that so the coefficient become hardtyped
     * 
     * Added additional getters and setters to see what you need
     */

// Example of implementation with hard coded coef value:
    // Math(1.0),
    //       ^  Coefficient
    Math(), 
    Physique(), 
    Litteraire(), 
    Chimie(), 
    SVT(), 
    Histoire(), 
    Geographie(), 
    Francais(), 
    Anglais(), 
    Allmagne();

    private String Mat;
    private double Note;
    private double Coef;

    private Note(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Matière: " + this.name() + ": ");
        System.out.println("Donner la note: ");
        Note = sc.nextDouble();
        System.out.println("Enter le Coefficient: ");
        Coef = sc.nextDouble();
        sc.close();
    }

    private Note(double Coef) {
        this.Coef = Coef;
    }

    public double getCoef(){return Coef;}
    public double getNote() {return Note;}
    public void setCoef(double coef) {Coef = coef;}
    public void setNote(double note) {Note = note;}
}
