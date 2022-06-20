package eu.unareil.bo;

import java.time.LocalDate;

public class Glace extends ProduitPerissable {
    String parfun;
    int temperatureConservation;

    // Constructor
    public Glace() {
        super();
    }
    public Glace(LocalDate dateLimiteConso, long refProd, String marque, String libelle, long qteStock, float prixUnitaire, String parfun, int temperatureConservation) {
        super(refProd, marque, libelle, qteStock, prixUnitaire, dateLimiteConso);
        this.setParfun(parfun);
        this.setTemperatureConservation(temperatureConservation);
    }

    public Glace(LocalDate dateLimiteConso, String marque, String libelle, int temperatureConservation, String parfun, long qteStock, float prixUnitaire) {
        this(dateLimiteConso, 0 , marque, libelle, qteStock, prixUnitaire, parfun, temperatureConservation);
    }

    // Getter
    public String getParfun() {
        return parfun;
    }

    public int getTemperatureConservation() {
        return temperatureConservation;
    }

    // Setter
    public void setParfun(String parfun) {
        this.parfun = parfun;
    }

    public void setTemperatureConservation(int temperatureConservation) {
        this.temperatureConservation = temperatureConservation;
    }

    // Methode

    @Override
    public String toString() {
        return super.toString() + "Glace{" +
                "parfun='" + parfun + '\'' +
                ", temperatureConservation=" + temperatureConservation +
                '}';
    }
}
