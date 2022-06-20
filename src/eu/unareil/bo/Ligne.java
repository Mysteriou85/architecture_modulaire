package eu.unareil.bo;

public class Ligne {
    int quantite;
    Produit produit;

    // Contructor
    public Ligne(Produit p, int quantite) {
        this.setProduit(p);
        this.setQuantite(quantite);
    }

    // Getter
    public int getQuantite() {
        return quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    // Setter
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    // Methode

    @Override
    public String toString() {
        return super.toString() + "Ligne{" +
                "quantite=" + quantite +
                ", produit=" + produit +
                '}';
    }
}
