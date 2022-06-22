package eu.unareil.dal.jdbc.allJdbc;

import eu.unareil.bo.produit.Produit;
import eu.unareil.bo.produit.Stylo;
import eu.unareil.bo.produit.cartePostale.CartePostale;
import eu.unareil.bo.produit.produitPerissable.Glace;
import eu.unareil.bo.produit.produitPerissable.Pain;
import eu.unareil.bo.produit.produitPerissable.ProduitPerissable;
import eu.unareil.dal.DALException;
import eu.unareil.dal.DAO;
import eu.unareil.dal.jdbc.JdbcTools;

import java.sql.*;
import java.util.List;

public class ProduitJDBCImpl implements DAO<Produit> {

    private static final String SQL_INSERT="insert into produit "
            + "(libelle, marque, prixUnitaire, qteStock, type, dateLimiteConso, poids, parfun, temperatureConservation, couleur, typeMine, typeCartePostale)"
            + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE="";
    private static final String SQL_DELETE="delete from produit where refProd = ?";
    private static final String SQL_SELECT_ALL="";
    private static final String SQL_SELECT_BY_ID="";

    // ----- INSERT PRODUIT -----
    @Override
    public void insert(Produit data) throws DALException {
        PreparedStatement pstmt = null;
        Connection cnx = JdbcTools.getConnection();
        try {
            pstmt = cnx.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, data.getLibelle());
            pstmt.setString(2, data.getMarque());
            pstmt.setFloat(3, data.getPrixUnitaire());
            pstmt.setLong(4, data.getQteStock());

            // pstmt.setString(5, "Stylo");
            // pstmt.setDate(6, Date.valueOf(((ProduitPerissable) data).getDateLimiteConso())); // Date
            // pstmt.setFloat(7, ((Pain) data).getPoids());
            // pstmt.setString(8, ((Glace) data).getParfun());
            // pstmt.setInt(9, ((Glace) data).getTemperatureConservation());
            // pstmt.setString(10, ((Stylo) data).getCouleur());
            // pstmt.setString(11, ((Stylo) data).getTypeMine());
            // pstmt.setString(12, ((CartePostale) data).getType().toString());

            if (data instanceof Stylo) {
                pstmt.setString(5, "Stylo");
                pstmt.setNull(6, Types.NULL); // Date
                pstmt.setNull(7, Types.NULL);
                pstmt.setNull(8, Types.NULL);
                pstmt.setNull(9, Types.NULL);
                pstmt.setString(10, ((Stylo) data).getCouleur());
                pstmt.setString(11, ((Stylo) data).getTypeMine());
                pstmt.setNull(12, Types.NULL);
            }
            if (data instanceof Pain) {
                pstmt.setString(5, "Pain");
                pstmt.setDate(6, Date.valueOf(((ProduitPerissable) data).getDateLimiteConso())); // Date
                pstmt.setFloat(7, ((Pain) data).getPoids());
                pstmt.setNull(8, Types.NULL);
                pstmt.setNull(9, Types.NULL);
                pstmt.setNull(10, Types.NULL);
                pstmt.setNull(11, Types.NULL);
                pstmt.setNull(12, Types.NULL);
            }
            if (data instanceof Glace) {
                pstmt.setString(5, "Glace");
                pstmt.setDate(6, Date.valueOf(((ProduitPerissable) data).getDateLimiteConso())); // Date
                pstmt.setNull(7, Types.NULL);
                pstmt.setString(8, ((Glace) data).getParfun());
                pstmt.setInt(9, ((Glace) data).getTemperatureConservation());
                pstmt.setNull(10, Types.NULL);
                pstmt.setNull(11, Types.NULL);
                pstmt.setNull(12, Types.NULL);
            }
            if (data instanceof CartePostale) {
                pstmt.setString(5, "CartePostale");
                pstmt.setNull(6, Types.NULL); // Date
                pstmt.setNull(7, Types.NULL);
                pstmt.setNull(8, Types.NULL);
                pstmt.setNull(9, Types.NULL);
                pstmt.setNull(10, Types.NULL);
                pstmt.setNull(11, Types.NULL);
                pstmt.setString(12, ((CartePostale) data).getType().toString());
            }
            int nbRow = pstmt.executeUpdate();
            if (nbRow == 1) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    data.setRefProd(rs.getLong(1));
                }
            }
        } catch (SQLException e) {
            throw new DALException("erreur du insert - data=" + data, e.getCause());
        }
        finally {
            try {
                if(pstmt!=null) {
                    pstmt.close();
                }
                if(cnx!=null) {
                    cnx.close();
                }
            } catch (SQLException e) {
                throw new DALException("erreur du insert au niveau du close - data=" + data, e.getCause());
            }
        }
    }

    // ----- DELETE PRODUIT -----
    @Override
    public void delete(Produit data) throws DALException {
        PreparedStatement pstmt = null;
        long id = data.getRefProd();
        Connection cnx = JdbcTools.getConnection();
        try {
            pstmt = cnx.prepareStatement(SQL_DELETE);
            pstmt.setLong(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DALException("erreur du delete - data=" + data, e.getCause());
        }
        finally {
            try {
                if(pstmt!=null) {
                    pstmt.close();
                }
                if(cnx!=null) {
                    cnx.close();
                }
            } catch (SQLException e) {
                throw new DALException("erreur du delete au niveau du close - data=" + data, e.getCause());
            }
        }
    }

    // ----- UPDATE -----
    @Override
    public void update(Produit data) throws DALException {

    }

    // ----- SELECT BY ID -----
    @Override
    public Produit selectById(long id) throws DALException {
        PreparedStatement pstmt = null;
        ResultSet rs = null ;
        Produit produit = null;
        Connection cnx = JdbcTools.getConnection();
        try {
            pstmt = cnx.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setLong(1, id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                produit = new Produit(
//                    rs.getString(1),
//                    rs.getString(2),
//                    rs.getFloat(3),
//                    rs.getLong(4),
//                    rs.getString(5),
//                    rs.getDate(6),
//                    rs.getFloat(7),
//                    rs.getString(8),
//                    rs.getInt(9),
//                    rs.getString(10),
//                    rs.getString(11),
//                    rs.getString(12)
                );
            }
        } catch (SQLException e) {
            throw new DALException("erreur du select by id - id=" + id, e.getCause());
        }
        finally {
            try {
                if(pstmt!=null) {
                    pstmt.close();
                }
                if(cnx!=null) {
                    cnx.close();
                }
            } catch (SQLException e) {
                throw new DALException("erreur du select by id au niveau du close - id=" + id, e.getCause());
            }
        }
        return produit;
    }

    // ----- SELECT ALL -----
    @Override
    public List<Produit> selectAll() throws DALException {
        return null;
    }
}
