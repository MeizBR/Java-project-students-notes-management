package etudiant;
import note.note;

import java.util.Scanner;

// classe etudiant
public class etudiant {
    
    Scanner objet = new Scanner(System.in);

    String nom_et, prenom_et;

    public etudiant(note notes[]) {
        System.out.println("donner le nom d'étudiant : ");
        this.nom_et = objet.nextLine();
        System.out.println("donner le prénom d'étudiant : ");
        this.prenom_et = objet.nextLine();
    }

    public String getNom_et() {
        return nom_et;
    }

    public void setNom_et(String nom_et) {
        this.nom_et = nom_et;
    }

    public String getPrenom_et() {
        return prenom_et;
    }

    public void setPrenom_et(String prenom_et) {
        this.prenom_et = prenom_et;
    }

    

}
