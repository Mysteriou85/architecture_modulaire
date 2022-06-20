package eu.unareil.bo;

public class Pain extends Produit{
    int poids;

    // Constructor
    public Pain(long refProd, String marque, String libelle, long qteStock, float prixUnitaire, int poids) {
        super(refProd, marque, libelle, qteStock, prixUnitaire);
        this.setPoids(poids);
    }

    public Pain(String marque, String libelle, long qteStock, float prixUnitaire, int poids) {
        super(marque, libelle, qteStock, prixUnitaire);
        this.setPoids(poids);
    }

    // Getter
    public int getPoids() {
        return poids;
    }

    // Setter
    public void setPoids(int poids) {
        this.poids = poids;
    }
}
