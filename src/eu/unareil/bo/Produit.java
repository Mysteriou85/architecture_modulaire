package eu.unareil.bo;

public class Produit {
    long refProd;
    String libelle;
    String marque;
    float prixUnitaire;
    long qteStock;

    // Constructor
    public Produit(long refProd, String marque, String libelle, long qteStock, float prixUnitaire) {
        this.setRefProd(refProd);
        this.setLibelle(libelle);
        this.setMarque(marque);
        this.setPrixUnitaire(prixUnitaire);
        this.setQteStock(qteStock);
    }

    public Produit(String marque, String libelle, long qteStock, float prixUnitaire) {
        this.setLibelle(libelle);
        this.setMarque(marque);
        this.setPrixUnitaire(prixUnitaire);
        this.setQteStock(qteStock);
    }

    // Getter
    public long getRefProd() {
        return refProd;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public long getQteStock() {
        return qteStock;
    }

    // Setter
    public void setRefProd(long refProd) {
        this.refProd = refProd;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public void setQteStock(long qteStock) {
        this.qteStock = qteStock;
    }

    // Methode
}
