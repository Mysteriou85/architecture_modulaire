package eu.unareil.bo;

public class Auteur {
    String prenom;
    String nom;

    // Constructor
    public Auteur(String prenom, String nom) {
        this.setPrenom(prenom);
        this.setNom(nom);
    }

    // Getter
    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    // Setter
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
