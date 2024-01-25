package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Presentation;
import query.Query_Presentation;
import view.Interfaz;

public class CTRL_Presentation implements ActionListener {

    Query_Presentation dao;
    Interfaz interfaz = new Interfaz();

    public CTRL_Presentation(Interfaz interfaz) throws SQLException {

        this.dao = new Query_Presentation();
        this.interfaz = interfaz;
        this.interfaz.buttonSaveDetailsProduct.addActionListener(this);

        this.interfaz.buttonGroup.add(interfaz.radioButtonKg);
        this.interfaz.buttonGroup.add(interfaz.radioButtonLt);
        this.interfaz.buttonGroup.add(interfaz.radioButtonMl);

        addPresentationCombobox();

        this.interfaz.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dao.closeConnection();
            }
        });

    }

    private boolean insertPresentation(String presentation, String volume) throws SQLException {
        Presentation insertPresentation = new Presentation(presentation, volume);
        return dao.insertPresentation(insertPresentation);
    }

    private void addPresentationProduct() {
        String presentation = interfaz.textfieldPresentationProduct.getText().trim();
        String volume = interfaz.textfieldVolumeProduct.getText();
        try {
            if (presentation.isBlank() || interfaz.buttonGroup.getSelection() == null || volume.isBlank()) {
                utility.Messages.showErrorMessage("Existen campos vacios");
            } else {
                String volumeData = interfaz.buttonGroup.getSelection().getActionCommand();
                String concateVolumeSelection = volume + " " + volumeData;
                insertPresentation(presentation, concateVolumeSelection);
                utility.Messages.showCorrectMessage("La presentacion " + presentation + " " + concateVolumeSelection + " se ha registrado exitosamente");
                cleanData();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CTRL_Presentation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Presentation[] getPresentations() throws SQLException {
        return dao.readPresentation();
    }

    private void addPresentationCombobox() throws SQLException {
        interfaz.comboboxPresentationProduct.addItem("Selecciona una opcion");
        for (Presentation presentation : getPresentations()) {
            interfaz.comboboxPresentationProduct.addItem(presentation.getPresentation() + " " + presentation.getVolume());
        }
    }

    private void cleanData() {
        interfaz.textfieldPresentationProduct.setText("");
        interfaz.textfieldVolumeProduct.setText("");
        interfaz.buttonGroup.clearSelection();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == interfaz.buttonSaveDetailsProduct) {
            addPresentationProduct();
        }
    }

}
