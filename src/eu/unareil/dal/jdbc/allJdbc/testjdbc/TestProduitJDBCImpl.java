package eu.unareil.dal.jdbc.allJdbc.testjdbc;

import eu.unareil.bo.produit.Produit;
import eu.unareil.bo.produit.Stylo;
import eu.unareil.dal.DALException;
import eu.unareil.dal.jdbc.allJdbc.ProduitJDBCImpl;

import java.util.Scanner;

public class TestProduitJDBCImpl {
    public static void main(String[] args) {

        ProduitJDBCImpl produitJDBC = new ProduitJDBCImpl();
        Scanner scanner = new Scanner(System.in);

        String libelle = "Stylo bleu";
        String marque = "BicBleu";
        float prixUnitaire = 5.2f;
        long qteStock = 100;

        String couleur = "Bleu";
        String typeMine = "Fin";

        Produit newStylo = new Stylo(libelle, marque, qteStock, prixUnitaire, couleur, typeMine);

//        try {
//            produitJDBC.insert(newStylo);
//        } catch (DALException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            System.out.println(produitJDBC.selectById(13));
//        } catch (DALException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            produitJDBC.delete(produitJDBC.selectById(13));
//        } catch (DALException e) {
//            throw new RuntimeException(e);
//        }
    }
}
