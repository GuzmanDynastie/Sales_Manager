package dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class DAO {

    final protected static String DRIVER = "com.mysql.cj.jdbc.Driver";
    final protected static String SERVER = "localhost"; //127.0.0.1
    final protected static int PORT = 3306;
    final protected static String NAME_DB = "";
    final protected static String USER = "root";
    final protected static String PASSWORD = "";

    private Connection connection;
    private Statement stmt;

    protected DAO() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                String url = "jdbc:mysql://" + SERVER + ":" + PORT + "/" + NAME_DB;
                connection = DriverManager.getConnection(url, USER, PASSWORD);
                stmt = connection.createStatement();

                System.out.println("Connection to the database successfully established.");
            } catch (SQLException e) {
                throw new SQLException("Error establishing connection: " + e.getMessage(), e);
            }
        }
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        try {
            return connection.prepareStatement(sql);
        } catch (SQLException e) {
            throw new SQLException("Error preparing statement: " + e.getMessage(), e);
        }
    }

    public ResultSet executeQuery(String query) throws SQLException {
        try {
            return stmt.executeQuery(query);
        } catch (SQLException e) {
            throw new SQLException("Error executing query: " + e.getMessage(), e);
        }
    }

    public boolean execute(String instruction) throws SQLException {
        try {
            return stmt.execute(instruction);
        } catch (SQLException e) {
            throw new SQLException("Error executing instruction: " + e.getMessage(), e);
        }
    }

    public int executeUpdate(String instruction) throws SQLException {
        try {
            return stmt.executeUpdate(instruction);
        } catch (SQLException e) {
            throw new SQLException("Error executing update: " + e.getMessage(), e);
        }
    }

    public void closeResource(AutoCloseable resource) throws SQLException {
        if (resource != null) {
            try {
                resource.close();
            } catch (SQLException e) {
                throw new SQLException("Error closing the resource: " + e.getMessage(), e);
            } catch (Exception e) {
                throw new SQLException("Unexpected error closing the resource: " + e.getMessage(), e);
            }
        }
    }

    public void closeConnection() {
        try {
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
        } catch (SQLException e) {
            System.err.println("Error closing the statement: " + e.getMessage());
        }

        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed successfully.");
            }
        } catch (SQLException e) {
            System.err.println("Error closing the connection: " + e.getMessage());
        }
    }

}
