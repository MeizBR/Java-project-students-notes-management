package note;
import matiere.matiere;
import etudiant.etudiant;

import java.util.Scanner;

// classe note
public class note {
 
    Scanner objet = new Scanner(System.in); 

    // déclaration des attributs utilisées pour une note
    private matiere m;
    private etudiant e;
    private double note_ds, note_ex;

    // définition du constructeur de la classe matiere
    public note(matiere m, etudiant e) {
        this.m = m;
        this.e = e;
        System.out.println("donner le note de ds : ");
        this.note_ds = objet.nextDouble();
        System.out.println("donner le note d'examen : ");
        this.note_ex = objet.nextDouble();
    }

    // les getters and setters

    // le getter and setter pour l'attribut m
    public matiere getM() {
        return m;
    }

    public void setM(matiere m) {
        this.m = m;
    }

    // le getter and setter pour l'attribut e
    public etudiant getE() {
        return e;
    }

    public void setE(etudiant e) {
        this.e = e;
    }

    // le getter and setter pour l'attribut note_ds
    public double getNote_ds() {
        return note_ds;
    }

    public void setNote_ds(double note_ds) {
        this.note_ds = note_ds;
    }

    // le getter and setter pour l'attribut note_ex
    public double getNote_ex() {
        return note_ex;
    }

    public void setNote_ex(double note_ex) {
        this.note_ex = note_ex;
    }
  
}
