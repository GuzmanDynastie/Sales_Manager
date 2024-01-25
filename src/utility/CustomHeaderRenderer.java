package utility;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class CustomHeaderRenderer extends DefaultTableCellRenderer {

    Font originalFont;

    public CustomHeaderRenderer(JTableHeader header) {
        originalFont = header.getFont().deriveFont(Font.BOLD, 17f);
        setHorizontalAlignment(JLabel.CENTER);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        setFont(originalFont);
        return this;
    }
}
