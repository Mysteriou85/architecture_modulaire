package eu.unareil.bo;

import java.util.ArrayList;
import java.util.List;

public class CartePostale extends Produit {
    TypeCartePostale type;
    List<Auteur> lesAuteurs = new ArrayList<>();

    // Constructor
    public CartePostale() {
        super();
    }
    public CartePostale(long refProd, String marque, String libelle, long qteStock, float prixUnitaire, List<Auteur> lesAuteurs, TypeCartePostale type) {
        super(refProd, marque, libelle, qteStock, prixUnitaire);
        this.setType(type);
        this.setLesAuteurs(lesAuteurs);
    }

    public CartePostale(String marque, String libelle, long qteStock, float prixUnitaire, List<Auteur> lesAuteurs, TypeCartePostale type) {
        super(marque, libelle, qteStock, prixUnitaire);
        this.type = type;
        this.lesAuteurs = lesAuteurs;
    }

    // Getter
    public TypeCartePostale getType() {
        return type;
    }

    public List<Auteur> getLesAuteurs() {
        return lesAuteurs;
    }

    // Setter
    public void setType(TypeCartePostale type) {
        this.type = type;
    }

    public void setLesAuteurs(List<Auteur> lesAuteurs) {
        this.lesAuteurs = lesAuteurs;
    }

    // Methode

    @Override
    public String toString() {
        return super.toString() + "CartePostale{" +
                "type=" + type +
                ", lesAuteurs=" + lesAuteurs +
                '}';
    }
}
