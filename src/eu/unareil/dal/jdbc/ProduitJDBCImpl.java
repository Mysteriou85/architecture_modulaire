package eu.unareil.dal.jdbc;

import eu.unareil.bo.produit.Produit;
import eu.unareil.dal.DALException;
import eu.unareil.dal.DAO;

import java.util.List;

public class ProduitJDBCImpl implements DAO<Produit> {

    private static final String SQL_INSERT="";
    private static final String SQL_UPDATE="";
    private static final String SQL_DELETE="";
    private static final String SQL_SELECT_ALL="";
    private static final String SQL_SELECT_BY_ID="";

    // ----- INSERT -----
    @Override
    public void insert(Produit data) throws DALException {

    }

    // ----- DELETE -----
    @Override
    public void delete(Produit data) throws DALException {

    }

    // ----- UPDATE -----
    @Override
    public void update(Produit data) throws DALException {

    }

    // ----- SELECT BY ID -----
    @Override
    public Produit selectById(Produit data) throws DALException {
        return null;
    }

    // ----- SELECT ALL -----
    @Override
    public List<Produit> selectAll() throws DALException {
        return null;
    }
}
