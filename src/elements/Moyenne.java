package elements;
import java.util.*;


public class Moyenne {
    private ArrayList<Note> TabMoy = new ArrayList<>();
    private double Moy = -1;
    private double coef_all = 0;
    private String mention = null;
    public void push(Note New){
        TabMoy.add(New);
        System.out.println("Pushed Note");
    }

    public double getMoy(){
        if (Moy == -1) {
            Moy = 0;
            for (Note note: TabMoy){
                Moy += note.getNote() * note.getCoef();
                coef_all += note.getCoef();
            }
            Moy /= coef_all;
        }
        return Moy;
    }

    public String getMention(){
        if (mention != null) return mention;

        if (this.getMoy() < 10.0) { 
            mention = "Refusée!";
            return mention;
        }

        if (this.getMoy() < 12.0) { 
            mention = "Assez Bien!";
            return mention;
        }

        if (this.getMoy() < 14.0) { 
            mention = "Bien!";
            return mention;
        }

        mention = "Tres Bien!";
        return mention;
    }
}
