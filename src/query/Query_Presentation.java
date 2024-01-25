package query;

import dao.DAO;
import model.Presentation;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Query_Presentation extends DAO {

    public Query_Presentation() throws SQLException {
        super();
    }

    private static final String TABLE = "presentacion";

    private static final String INSERT = "INSERT INTO " + TABLE + "(Presentacion, Volumen) VALUES(?,?)";
    private static final String READ = "SELECT * FROM " + TABLE;
    private static final String DELETE = "UPDATE " + TABLE + "SET Estado = 0";
    private static final String UPDATE = "UPDATE " + TABLE + "SET Presentacion = ?, Volumen = ?";

    private void completeStatement(PreparedStatement prep, Presentation presentation) throws SQLException {
        prep.setString(1, presentation.getPresentation());
        prep.setString(2, presentation.getVolume());
    }

    public boolean insertPresentation(Presentation presentation) throws SQLException {
        boolean result = false;
        PreparedStatement prep = null;
        try {
            prep = prepareStatement(INSERT);
            completeStatement(prep, presentation);
            result = prep.executeUpdate() > 0;
        } finally {
            closeResource(prep);
        }
        return result;
    }

    public Presentation[] readPresentation() throws SQLException {
        ArrayList<Presentation> list = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = executeQuery(READ);
            while (rs.next()) {
                list.add(new Presentation(rs.getString("Presentacion"), rs.getString("Volumen")));
            }
        } finally {
            closeResource(rs);
        }
        return list.toArray(Presentation[]::new);
    }

    public int deleteProduct(Presentation presentation) throws SQLException {
        PreparedStatement prep = null;
        int rowsAffected = -1;
        try {
            prep = prepareStatement(DELETE);
            completeStatement(prep, presentation);
            rowsAffected = prep.executeUpdate();
        } finally {
            closeResource(prep);
        }
        return rowsAffected;
    }

    public int updateProduct(Presentation presentation) throws SQLException {
        PreparedStatement prep = null;
        int rowsAffected = -1;
        try {
            prep = prepareStatement(UPDATE);
            completeStatement(prep, presentation);
            rowsAffected = prep.executeUpdate();
        } finally {
            closeResource(prep);
        }
        return rowsAffected;
    }
}
