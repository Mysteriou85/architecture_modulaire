package eu.unareil.dal.jdbc.allJdbc;

import eu.unareil.bo.produit.cartePostale.Auteur;
import eu.unareil.dal.DALException;
import eu.unareil.dal.DAO;

import java.util.List;

public class AuteurJBDCImpl implements DAO<Auteur> {

    private static final String SQL_INSERT="insert into auteur ";

    private static final String SQL_UPDATE="";
    private static final String SQL_DELETE="delete from auteur where id = ?";
    private static final String SQL_SELECT_ALL="";
    private static final String SQL_SELECT_BY_ID="";

    @Override
    public void insert(Auteur data) throws DALException {

    }

    @Override
    public void delete(Auteur data) throws DALException {

    }

    @Override
    public void update(Auteur data) throws DALException {

    }

    @Override
    public Auteur selectById(long id) throws DALException {
        return null;
    }

    @Override
    public List<Auteur> selectAll() throws DALException {
        return null;
    }
}
