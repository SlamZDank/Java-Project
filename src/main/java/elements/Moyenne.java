package elements;
import java.util.*;
import java.text.DecimalFormat;


// May need modifications in order to work with enums.
// Not sure about it... didnt get the time to check

public class Moyenne {
    ArrayList<Note> TabMoy = new ArrayList<>();
    private double Moy = -1;
    private double coef_all = 0;
    private String mention = null;

    public void push(Note New){ TabMoy.add(New); }

    public Moyenne(){}

    public Moyenne(ArrayList<Note> Tab){this.TabMoy = Tab;}


    // TODO: Ensure that methods are available for UI
    public double getMoy(){
        if (Moy == -1) {
            Moy = 0;
            for (Note note: TabMoy){
                Moy += note.getNote() * note.getCoef();
                coef_all += note.getCoef();
            }
            Moy /= coef_all;// Moy /= TabMoy.size();
        }
        return Moy;
    }

    public String getMention(){
        if (mention != null) {return mention;}

        if (this.getMoy() < 10.0) { 
            mention = "Not Good";
            return mention;
        }

        if (this.getMoy() < 12.0) { 
            mention = "Sufficiently Good";
            return mention;
        }

        if (this.getMoy() < 14.0) { 
            mention = "Good";
            return mention;
        }

        mention = "Very Good";
        return mention;
    }
    public String status(){
        String mention = getMention();
        if (mention.equals("Not Good")) {return "Rejected";}
        else{return "Accepted";}
    }
    
    public String toString(){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return (status() + 
                " with a remark of \"" 
                + getMention() + 
                "\" and with a score of " 
                + decimalFormat.format(getMoy())+ " !");
    }
}
