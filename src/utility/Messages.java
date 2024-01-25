package utility;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Messages {

    private static final String CORRECT_OPERATION = "Operacion Aprovada";
    private static final String ERROR_OPERATION = "Operacion Erronea";
    private static final String WARNING_OPERATION = "Aviso";
    private static final String QUESTION = "Solicitud";
    private static final String SYSTEM_ACCESS = "Acceso";
    private static final String OPTION = "Seleccion de Opcion";

    private static final ImageIcon CORRECT_ICON = new ImageIcon(Messages.class.getResource("/image/iconoAprovado.png"));
    private static final ImageIcon ERROR_ICON = new ImageIcon(Messages.class.getResource("/image/iconoError.png"));
    private static final ImageIcon WARNING_ICON = new ImageIcon(Messages.class.getResource("/image/iconoAdvertencia.png"));
    private static final ImageIcon QUESTION_ICON = new ImageIcon(Messages.class.getResource("/image/iconoPregunta.png"));
    private static final ImageIcon ACCESS_ICON = new ImageIcon(Messages.class.getResource("/image/iconoAccederSistema.png"));
    private static final ImageIcon OPTION_ICON = new ImageIcon(Messages.class.getResource("/image/iconoElegir.png"));

    public static void showCorrectMessage(String message) {
        JOptionPane.showMessageDialog(null, message, CORRECT_OPERATION, JOptionPane.INFORMATION_MESSAGE, CORRECT_ICON);
    }

    public static void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, ERROR_OPERATION, JOptionPane.ERROR_MESSAGE, ERROR_ICON);
    }

    public static void showWarningMessage(String message) {
        JOptionPane.showMessageDialog(null, message, WARNING_OPERATION, JOptionPane.WARNING_MESSAGE, WARNING_ICON);
    }

    public static int showQuestionMessage(String message) {
        Object result = JOptionPane.showInputDialog(null, message, QUESTION, JOptionPane.QUESTION_MESSAGE, QUESTION_ICON, null, null);
        if (result == null) {
            return -1;
        }
        return Integer.parseInt((String) result);
    }

    public static void showAccessMessage(String message) {
        JOptionPane.showMessageDialog(null, message, SYSTEM_ACCESS, JOptionPane.WARNING_MESSAGE, ACCESS_ICON);
    }

    public static Object showOptionMessage(String message, Object[] objeto) {
        return JOptionPane.showOptionDialog(null, message, OPTION, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, OPTION_ICON, objeto, objeto[0]);
    }

}
