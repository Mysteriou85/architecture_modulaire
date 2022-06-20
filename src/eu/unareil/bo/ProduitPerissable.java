package eu.unareil.bo;

import java.time.LocalDate;

public class ProduitPerissable extends Produit {
    LocalDate dateLimiteConso;

    // Construtor
    public ProduitPerissable(long refProd, String marque, String libelle, long qteStock, float prixUnitaire, LocalDate dateLimiteConso) {
        super(refProd, marque, libelle, qteStock, prixUnitaire);
        this.setDateLimiteConso(dateLimiteConso);
    }

    public ProduitPerissable(String marque, String libelle, long qteStock, float prixUnitaire, LocalDate dateLimiteConso) {
        super(marque, libelle, qteStock, prixUnitaire);
        this.setDateLimiteConso(dateLimiteConso);
    }

    // Getter
    public LocalDate getDateLimiteConso() {
        return dateLimiteConso;
    }

    // Setter
    public void setDateLimiteConso(LocalDate dateLimiteConso) {
        this.dateLimiteConso = dateLimiteConso;
    }
}
