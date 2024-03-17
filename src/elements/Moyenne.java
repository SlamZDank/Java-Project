package elements;
import java.util.*;


public class Moyenne {
    private ArrayList<Note> TabMoy = new ArrayList<>();
    private double Moy;
    public void push(Note New){
        TabMoy.add(New);
        System.out.println("Pushed Note");
    }

    public void pop(){
        
    }
}
