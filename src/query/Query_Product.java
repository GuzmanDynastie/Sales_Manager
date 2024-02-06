package query;

import dao.DAO;
import model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Query_Product extends DAO {

    public Query_Product() throws SQLException {
        super();
    }

    private static final String TABLE = "producto";
    private static final String TABLE2 = "presentacion";

    private static final String CREATE = "INSERT INTO " + TABLE + "(Nombre, Tipo, Precio, ID_Presentacion, Activo) VALUES(?, ?, ?, ?, 1)";
    private static final String READ = "SELECT " + NAME_DB + "." + TABLE + ".ID_Producto, " + NAME_DB + "." + TABLE + ".Nombre, " + NAME_DB + "." + TABLE + ".Tipo, "
            + NAME_DB + "." + TABLE + ".Precio, " + NAME_DB + "." + TABLE2 + ".Presentacion, " + NAME_DB + "." + TABLE2 + ".Volumen "
            + "FROM " + NAME_DB + "." + TABLE + " JOIN " + NAME_DB + "." + TABLE2 + " ON " + NAME_DB + "." + TABLE + ".ID_Presentacion = " + NAME_DB + "." + TABLE2 + ".ID_Presentacion "
            + "WHERE " + NAME_DB + "." + TABLE + ".Activo = 1;";
    private static final String UPDATE = "UPDATE " + TABLE + " SET Nombre = ?, Tipo = ?, Precio = ?, ID_Presentacion = ? WHERE ID_Producto = ?";
    private static final String DELETE = "UPDATE " + TABLE + " SET Activo = 0 WHERE ID_Producto = ?";

    private static final String READ_DELETE = "SELECT " + NAME_DB + "." + TABLE + ".ID_Producto, " + NAME_DB + "." + TABLE + ".Nombre, " + NAME_DB + "." + TABLE + ".Tipo, "
            + NAME_DB + "." + TABLE + ".Precio, " + NAME_DB + "." + TABLE2 + ".Presentacion, " + NAME_DB + "." + TABLE2 + ".Volumen "
            + "FROM " + NAME_DB + "." + TABLE + " JOIN " + NAME_DB + "." + TABLE2 + " ON " + NAME_DB + "." + TABLE + ".ID_Presentacion = " + NAME_DB + "." + TABLE2 + ".ID_Presentacion "
            + "WHERE " + NAME_DB + "." + TABLE + ".Activo = 0;";
    ;
    private static final String UPDATE_DELETE = "UPDATE " + TABLE + " SET Activo = 1 WHERE ID_Producto = ?";

    public static final String[] FIELDS_TABLE = {"ID", "NOMBRE", "TIPO", "PRECIO c/u", "PRESENTACÓN", "VOLUMEN"};

    private void completePrepareStatement(Product product, PreparedStatement prep) throws SQLException {
        prep.setString(1, product.getName());
        prep.setString(2, product.getType());
        prep.setDouble(3, product.getPrice());
        prep.setInt(4, product.getIdPresentation());
    }

    public boolean insertProduct(Product product) throws SQLException {
        boolean result = false;
        PreparedStatement prep = null;
        try {
            prep = prepareStatement(CREATE);
            completePrepareStatement(product, prep);
            result = prep.executeUpdate() > 0;
        } finally {
            closeResource(prep);
        }
        return result;
    }

    public Product[] readProducts() throws SQLException {
        ArrayList<Product> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = executeQuery(READ);
            while (rs.next()) {
                list.add(new Product(rs.getInt("ID_Producto"), rs.getString("Nombre"), rs.getString("Tipo"),
                        rs.getDouble("Precio"), rs.getString("Presentacion"), rs.getString("Volumen")));
            }
        } finally {
            closeResource(rs);
        }
        return list.toArray(Product[]::new);
    }

    public int updateProduct(Product product) throws SQLException {
        PreparedStatement prep = null;
        int rowsAffected = -1;
        try {
            prep = prepareStatement(UPDATE);
            completePrepareStatement(product, prep);
            rowsAffected = prep.executeUpdate();
        } finally {
            closeResource(prep);
        }
        return rowsAffected;
    }
    
    public int deleteProduct(int product) throws SQLException {
        PreparedStatement prep = null;
        int rowsAffected = -1;
        try {
            prep = prepareStatement(DELETE);
            prep.setInt(1, product);
            rowsAffected = prep.executeUpdate();
        } finally {
            closeResource(prep);
        }
        return rowsAffected;
    }
    
    public int updateDeleteProduct(int product) throws SQLException{
        PreparedStatement prep = null;
        int rowsAffected = -1;
        try{
            prep = prepareStatement(UPDATE_DELETE);
            prep.setInt(1, product);
            rowsAffected = prep.executeUpdate();
        } finally {
            closeResource(prep);
        }
        return rowsAffected;
    }

    public Product[] readEliminatedProducts() throws SQLException {
        ArrayList<Product> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = executeQuery(READ_DELETE);
            while (rs.next()) {
                list.add(new Product(rs.getInt("ID_Producto"), rs.getString("Nombre"), rs.getString("Tipo"),
                        rs.getDouble("Precio"), rs.getString("Presentacion"), rs.getString("Volumen")));
            }
        } finally {
            closeResource(rs);
        }
        return list.toArray(Product[]::new);
    }

}
