package elements;

import java.util.ArrayList;

/*
 * The implementation of DB using JDBC (Java Database Connectivity)
 * Hope its not that hard.
 */
public class DB  {
    private ArrayList<Etudiant> listeEtudiant ; 
    public DB() {
        this.listeEtudiant = new ArrayList<>() ;
    }
    
    public void ajoutEtudiant(Etudiant e){
        this.listeEtudiant.add(e);
    }
    public void supprimeEtudiant(Etudiant e){
        this.listeEtudiant.remove(e);
    }
    public void afficheListeEtudiant(){
        for(Object e : listeEtudiant){
            e.toString();
        }
    }
    public static void main(String[] args) {
        

        
    }
}
