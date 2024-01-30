package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import model.Product;
import query.Query_Product;
import utility.CustomHeaderRenderer;
import view.Interfaz;

public class CTRL_Product implements ActionListener {

    Query_Product dao;
    Interfaz interfaz = new Interfaz();
    CustomHeaderRenderer customHeader;


    public CTRL_Product(Interfaz interfaz) throws SQLException {

        this.dao = new Query_Product();
        this.interfaz = interfaz;

        
        this.interfaz.buttonRestoreProduct.addActionListener(this);
        this.interfaz.buttonReturnTable.addActionListener(this);
        this.interfaz.buttonAddProduct.addActionListener(this);
        this.interfaz.buttonSaveDetailsProduct.addActionListener(this);
        this.interfaz.buttonDeleteProduct.addActionListener(this);

        this.interfaz.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dao.closeConnection();
            }
        });

        interfaz.buttonReturnTable.setVisible(false);

        updateInterfaz();
    }

    private Product[] readProdructs() throws SQLException {
        return dao.readProducts();
    }

    private Object[][] readProductsArray() throws SQLException {
        Product[] product = readProdructs();
        if (product == null || product.length == 0) {
            return new Object[0][0];
        }
        Object[][] data = new Object[product.length][];
        for (int i = 0, len = product.length; i < len; i++) {
            data[i] = product[i].toArray();
        }
        return data;
    }

    private Product[] readEliminatedProdructs() throws SQLException {
        return dao.readEliminatedProducts();
    }

    private Object[][] readEliminatedProductsArray() throws SQLException {
        Product[] product = readEliminatedProdructs();
        if (product == null || product.length == 0) {
            return new Object[0][0];
        }
        Object[][] data = new Object[product.length][];
        for (int i = 0, len = product.length; i < len; i++) {
            data[i] = product[i].toArray();
        }
        return data;
    }

    private DefaultTableModel showListProducts(JTable table, String option) throws SQLException {
        Object[][] data = null;
        String[] columnNames = Query_Product.FIELDS_TABLE;
        int[] columnWidths = {80, 300, 300, 120, 200, 115};

        switch (option) {
            case "existingProducts":
                data = readProductsArray();
                break;
            case "eliminatedProducts":
                data = readEliminatedProductsArray();
                break;
            default:
                data = null;
        }

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableModel modeloTabla = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setModel(modeloTabla);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Get table columns
        TableColumnModel columnModel = table.getColumnModel();

        // Set the preferred width for each column according to the array
        for (int i = 0; i < columnWidths.length; i++) {
            TableColumn column = columnModel.getColumn(i);
            column.setPreferredWidth(columnWidths[i]);
        }

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        table.getTableHeader().setDefaultRenderer(customHeader);

        return modeloTabla;
    }

    private void showEliminatedProducts() {
        try {
            showListProducts(interfaz.tableExistingsProducts, "eliminatedProducts");
            interfaz.panelListExistingProducts.setBorder(javax.swing.BorderFactory.createTitledBorder(
                    javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)),
                    "Lista de productos inexistentes", javax.swing.border.TitledBorder.LEFT,
                    javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 28),
                    new java.awt.Color(0, 0, 0)));
            interfaz.buttonReturnTable.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CTRL_Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showExistingProducts() {
        try {
            showListProducts(interfaz.tableExistingsProducts, "existingProducts");
            interfaz.panelListExistingProducts.setBorder(javax.swing.BorderFactory.createTitledBorder(
                    javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)),
                    "Lista de productos existentes", javax.swing.border.TitledBorder.LEFT,
                    javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 28),
                    new java.awt.Color(0, 0, 0)));
            interfaz.buttonReturnTable.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(CTRL_Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean insertProduct(String name, String type, int idPresentation, double price) throws SQLException {
        Product product = new Product(name, type, idPresentation, price);
        return dao.insertProduct(product);
    }

    private int deleteProduct(int product) throws SQLException {
        return dao.deleteProduct(product);
    }

    private int getSelectedProductId() {
        int selectedRow = interfaz.tableExistingsProducts.getSelectedRow();

        if (selectedRow != -1) {
            int idProduct = Integer.parseInt(String.valueOf(interfaz.tableExistingsProducts.getValueAt(selectedRow, 0)));
            return idProduct;
        } else {
            return -1;
        }
    }

    private void deleteProduct2() throws SQLException {
        int selectedProductId = getSelectedProductId();

        if (selectedProductId != -1) {
            deleteProduct(selectedProductId);
            updateInterfaz();
        } else {
            utility.Messages.showErrorMessage("No ha seleccionado ningun producto");
        }
    }

    private void addProduct() {
        String name = interfaz.textfieldNameProduct.getText();
        String type = interfaz.textfieldTypeProduct.getText();
        try {
            if (interfaz.comboboxPresentationProduct.getSelectedIndex() == 0 || name.isBlank() || type.isBlank() || interfaz.textfieldPriceProduct.getText().isBlank()) {
                utility.Messages.showErrorMessage("Existen campos vacios");
            } else {
                Double price = Double.valueOf(interfaz.textfieldPriceProduct.getText());
                int presentation = interfaz.comboboxPresentationProduct.getSelectedIndex();
                insertProduct(name, type, presentation, price);
                utility.Messages.showCorrectMessage("El producto se ha registrado exitosamente");
                cleanData();
                updateInterfaz();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CTRL_Presentation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cleanData() {
        interfaz.textfieldNameProduct.setText("");
        interfaz.textfieldTypeProduct.setText("");
        interfaz.textfieldPriceProduct.setText("");
        interfaz.comboboxPresentationProduct.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == interfaz.buttonRestoreProduct) {
            showEliminatedProducts();
        }
        if (e.getSource() == interfaz.buttonReturnTable) {
            showExistingProducts();
        }
        if (e.getSource() == interfaz.buttonAddProduct) {
            addProduct();
        }
        if (e.getSource() == interfaz.buttonDeleteProduct) {
            try {
                deleteProduct2();
            } catch (SQLException ex) {
                Logger.getLogger(CTRL_Product.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void updateInterfaz() throws SQLException {
        customHeader = new CustomHeaderRenderer(interfaz.tableExistingsProducts.getTableHeader());
        showListProducts(interfaz.tableExistingsProducts, "existingProducts");
    }

}
