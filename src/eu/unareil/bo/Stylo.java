package eu.unareil.bo;

public class Stylo extends Produit {
    String couleur;
    String typeMine;

    // Constructor
    public Stylo(long refProd, String marque, String libelle, long qteStock, float prixUnitaire, String couleur, String typeMine) {
        super(refProd, marque, libelle, qteStock, prixUnitaire);
        this.setCouleur(couleur);
        this.setTypeMine(typeMine);
    }

    public Stylo(String marque, String libelle, long qteStock, float prixUnitaire, String couleur, String typeMine) {
        super(marque, libelle, qteStock, prixUnitaire);
        this.setCouleur(couleur);
        this.setTypeMine(typeMine);
    }

    // Getter
    public String getCouleur() {
        return couleur;
    }

    public String getTypeMine() {
        return typeMine;
    }

    // Setter
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setTypeMine(String typeMine) {
        this.typeMine = typeMine;
    }
}
