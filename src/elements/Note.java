
package elements;

public class Note {
    private String Mat;
    private double Note;
    private double Coef;

    public Note(String Mat, double Note, double Coef) {
        this.Mat = Mat;
        this.Note = Note;
        this.Coef = Coef;
    }

    public double getCoef(){return Coef;}
    public double getNote() {return Note;}
    public void setCoef(double coef) {Coef = coef;}
    public void setMat(String mat) {Mat = mat;}
}