package view;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import controller.CTRL_Presentation;
import controller.CTRL_Product;
import java.sql.SQLException;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buttonAddProduct = new javax.swing.JButton();
        buttonEditProduct = new javax.swing.JButton();
        buttonDeleteProduct = new javax.swing.JButton();
        panelListExistingProducts = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableExistingsProducts = new javax.swing.JTable();
        buttonRestoreProduct = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textfieldNameProduct = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textfieldTypeProduct = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textfieldPriceProduct = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboboxPresentationProduct = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        textfieldPresentationProduct = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textfieldVolumeProduct = new javax.swing.JTextField();
        buttonSaveDetailsProduct = new javax.swing.JButton();
        Consult = new javax.swing.JButton();
        radioButtonMl = new javax.swing.JRadioButton();
        radioButtonLt = new javax.swing.JRadioButton();
        radioButtonKg = new javax.swing.JRadioButton();
        buttonReturnTable = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTabbedPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane5.setFont(new java.awt.Font("Arial Narrow", 1, 28)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(100, 107, 99)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1194, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("INICIO", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(100, 107, 99)));

        buttonAddProduct.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        buttonAddProduct.setText("Agregar");
        buttonAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddProductActionPerformed(evt);
            }
        });

        buttonEditProduct.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        buttonEditProduct.setText("Editar");
        buttonEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditProductActionPerformed(evt);
            }
        });

        buttonDeleteProduct.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        buttonDeleteProduct.setText("Eliminar");

        panelListExistingProducts.setBackground(new java.awt.Color(204, 204, 204));
        panelListExistingProducts.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)), "Lista de productos existentes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 28), new java.awt.Color(0, 0, 0))); // NOI18N

        tableExistingsProducts.setAutoCreateRowSorter(true);
        tableExistingsProducts.setFont(new java.awt.Font("Arial Narrow", 0, 30)); // NOI18N
        tableExistingsProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "TIPO", "PRECIO", "PRESENTACIÓN", "VOLUMEN"
            }
        ));
        tableExistingsProducts.setRowHeight(37);
        tableExistingsProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableExistingsProducts.setShowGrid(false);
        tableExistingsProducts.setShowVerticalLines(true);
        tableExistingsProducts.getTableHeader().setResizingAllowed(false);
        tableExistingsProducts.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableExistingsProducts);

        javax.swing.GroupLayout panelListExistingProductsLayout = new javax.swing.GroupLayout(panelListExistingProducts);
        panelListExistingProducts.setLayout(panelListExistingProductsLayout);
        panelListExistingProductsLayout.setHorizontalGroup(
            panelListExistingProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListExistingProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelListExistingProductsLayout.setVerticalGroup(
            panelListExistingProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListExistingProductsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        buttonRestoreProduct.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        buttonRestoreProduct.setText("Restaurar");
        buttonRestoreProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestoreProductActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");

        textfieldNameProduct.setBackground(new java.awt.Color(204, 204, 204));
        textfieldNameProduct.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textfieldNameProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 188, 212)));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tipo");

        textfieldTypeProduct.setBackground(new java.awt.Color(204, 204, 204));
        textfieldTypeProduct.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textfieldTypeProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 188, 212)));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio");

        textfieldPriceProduct.setBackground(new java.awt.Color(204, 204, 204));
        textfieldPriceProduct.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textfieldPriceProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 188, 212)));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Presentación");

        comboboxPresentationProduct.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxPresentationProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textfieldPriceProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(textfieldTypeProduct)
                            .addComponent(textfieldNameProduct))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textfieldNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textfieldTypeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textfieldPriceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboboxPresentationProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)), "Presentación del producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Narrow", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Presentación");

        textfieldPresentationProduct.setBackground(new java.awt.Color(204, 204, 204));
        textfieldPresentationProduct.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textfieldPresentationProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 188, 212)));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Volumen");

        textfieldVolumeProduct.setBackground(new java.awt.Color(204, 204, 204));
        textfieldVolumeProduct.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        textfieldVolumeProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 188, 212)));

        buttonSaveDetailsProduct.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        buttonSaveDetailsProduct.setText("Guardar");
        buttonSaveDetailsProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveDetailsProductActionPerformed(evt);
            }
        });

        Consult.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        Consult.setText("?");
        Consult.setOpaque(true);
        Consult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultActionPerformed(evt);
            }
        });

        buttonGroup.add(radioButtonMl);
        radioButtonMl.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        radioButtonMl.setForeground(new java.awt.Color(0, 0, 0));
        radioButtonMl.setText("mililitros");

        buttonGroup.add(radioButtonLt);
        radioButtonLt.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        radioButtonLt.setForeground(new java.awt.Color(0, 0, 0));
        radioButtonLt.setText("litro/s");
        radioButtonLt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonLtActionPerformed(evt);
            }
        });

        buttonGroup.add(radioButtonKg);
        radioButtonKg.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        radioButtonKg.setForeground(new java.awt.Color(0, 0, 0));
        radioButtonKg.setText("kilogramo/s");
        radioButtonKg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonKgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Consult, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSaveDetailsProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(radioButtonMl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfieldPresentationProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfieldVolumeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(radioButtonLt)
                                .addGap(51, 51, 51)
                                .addComponent(radioButtonKg)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(textfieldPresentationProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioButtonLt)
                            .addComponent(radioButtonMl)
                            .addComponent(radioButtonKg))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textfieldVolumeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonSaveDetailsProduct)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Consult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addContainerGap())
        );

        Consult.setToolTipText("En este apartado solo deberás\n"
            + "ingresar detalles sobre la\n"
            + "presentación del producto\n"
            + "para despues seleccionar una\n"
            + "opción en agregar un producto.");
        radioButtonMl.setActionCommand("ml.");
        radioButtonLt.setActionCommand("lt.");
        radioButtonKg.setActionCommand("kg.");

        buttonReturnTable.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        buttonReturnTable.setText("Volver");
        buttonReturnTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReturnTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonEditProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAddProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonDeleteProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonRestoreProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonReturnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelListExistingProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buttonAddProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonEditProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonDeleteProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonRestoreProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonReturnTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panelListExistingProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("PRODUCTOS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(100, 107, 99)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1194, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("HISTORIAL", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddProductActionPerformed

    private void buttonEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditProductActionPerformed

    private void buttonRestoreProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestoreProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRestoreProductActionPerformed

    private void buttonSaveDetailsProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveDetailsProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSaveDetailsProductActionPerformed

    private void ConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultActionPerformed

    private void radioButtonLtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonLtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonLtActionPerformed

    private void radioButtonKgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonKgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonKgActionPerformed

    private void buttonReturnTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonReturnTableActionPerformed

    public static void main(String args[]) throws SQLException {
        FlatMaterialLighterIJTheme.setup();

        Interfaz interfaz = new Interfaz();

        CTRL_Product controller1 = new CTRL_Product(interfaz);
        CTRL_Presentation controller2 = new CTRL_Presentation(interfaz);
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Interfaz().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consult;
    public javax.swing.JButton buttonAddProduct;
    public javax.swing.JButton buttonDeleteProduct;
    public javax.swing.JButton buttonEditProduct;
    public javax.swing.ButtonGroup buttonGroup;
    public javax.swing.JButton buttonRestoreProduct;
    public javax.swing.JButton buttonReturnTable;
    public javax.swing.JButton buttonSaveDetailsProduct;
    public javax.swing.JComboBox<String> comboboxPresentationProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane5;
    public javax.swing.JPanel panelListExistingProducts;
    public javax.swing.JRadioButton radioButtonKg;
    public javax.swing.JRadioButton radioButtonLt;
    public javax.swing.JRadioButton radioButtonMl;
    public javax.swing.JTable tableExistingsProducts;
    public javax.swing.JTextField textfieldNameProduct;
    public javax.swing.JTextField textfieldPresentationProduct;
    public javax.swing.JTextField textfieldPriceProduct;
    public javax.swing.JTextField textfieldTypeProduct;
    public javax.swing.JTextField textfieldVolumeProduct;
    // End of variables declaration//GEN-END:variables
}
