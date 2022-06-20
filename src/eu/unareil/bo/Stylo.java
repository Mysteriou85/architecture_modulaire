package eu.unareil.bo;

public class Stylo extends Produit {
    String couleur;
    String typeMine;

    // Constructor
    public Stylo() {
        super();
    }
    public Stylo(long refProd, String marque, String libelle, long qteStock, float prixUnitaire, String couleur, String typeMine) {
        super(refProd, marque, libelle, qteStock, prixUnitaire);
        this.setCouleur(couleur);
        this.setTypeMine(typeMine);
    }

    public Stylo(String marque, String libelle, long qteStock, float prixUnitaire, String couleur, String typeMine) {
        this(0, marque, libelle, qteStock, prixUnitaire, couleur, typeMine);
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

    // Methode

    @Override
    public String toString() {
        return super.toString() + "Stylo{" +
                "couleur='" + couleur + '\'' +
                ", typeMine='" + typeMine + '\'' +
                '}';
    }
}
