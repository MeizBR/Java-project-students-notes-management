package matiere;

import java.util.Scanner;

// classe matiere
public class matiere {

    Scanner objet = new Scanner(System.in);

    // déclaration des attributs utilisées pour une matière
    private String nom_mat;
    private String enseignant;
    private int coefficient;
    
    // définition du constructeur de la classe matiere
    public matiere() {
        System.out.println("donner le nom de la matière : ");
        this.nom_mat = objet.nextLine();
        System.out.println("donner l'enseignant de la matière : ");
        this.enseignant = objet.nextLine();
        System.out.println("donner le coefficient de la matière : ");
        this.coefficient = objet.nextInt();
    }

    // les getters and setters

    // le getter and setter pour l'attribut nom_mat
    public String getNom_mat() {
        return nom_mat;
    }

    public void setNom_mat(String nom_mat) {
        this.nom_mat = nom_mat;
    }

    // le getter and setter pour l'attribut enseignant
    public String getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(String enseignant) {
        this.enseignant = enseignant;
    }

    // le getter and setter pour l'attribut coefficient
    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
    
}
