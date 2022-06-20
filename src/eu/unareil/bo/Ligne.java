package eu.unareil.bo;

import java.text.DecimalFormat;

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

    public double getPrix() {
        return this.getQuantite() * produit.getPrixUnitaire();
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
        final StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getSimpleName());
        sb.append(" [");
        sb.append("produit=").append(produit);
        sb.append(", qte=").append(quantite);
        sb.append(", prix=").append(this.getPrix()).append(" euro").append((this.getPrix() > 1) ? "s" : "");
        sb.append(']');
        return sb.toString();
    }
}
