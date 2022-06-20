package eu.unareil.bo;

import java.util.ArrayList;
import java.util.List;

public class Achat {
    double montant;
    List<Ligne> lignes = new ArrayList<>();

    // Constructor
    public Achat(Ligne ligne) {
        lignes.add(ligne);
    }

    // Getter
    public double getMontant() {
        return montant;
    }

    public Ligne getLigne(int index) {
        return lignes.get(index);
    }

    public List<Ligne> getLignes() {
        return lignes;
    }

    // Setter
    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setLignes(List<Ligne> lignes) {
        this.lignes = lignes;
    }

    // Methode
    public void calculMontant() {

    }

    public void supprimeLigne(int index) {
        lignes.remove(index);
    }

    public void ajouteLigne(Produit produit, int qte) {
        lignes.add(new Ligne(produit, qte));
    }

    public void modifieLigne(int index, int nouvelleQte) {
        if (lignes.contains(lignes.get(index))) {
            lignes.get(index).setQuantite(nouvelleQte);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Achat{" +
                "montant=" + montant +
                ", lignes=" + lignes +
                '}';
    }
}
