package UI;

import javax.swing.JOptionPane;

public class Dialogs {
    static public void writeErr(String errType, String errMes) {
        // Code to summon the dialog containing the Error message
        // If clicked on OK the fields that contain invalid info
        // May be deleted
        JOptionPane.showMessageDialog(null,
                errMes, errType,
                JOptionPane.ERROR_MESSAGE);
    }

    // To confirm info Submission
    static public int ConfirmDialog(String okType, String okMes) {
        return JOptionPane.showConfirmDialog(null,
                okMes, okType,
                JOptionPane.YES_NO_OPTION);
    }

    static public void SuccessDialog(String SuccType, String SuccMes) {
        JOptionPane.showMessageDialog(null,
                SuccMes, SuccType,
                JOptionPane.INFORMATION_MESSAGE);
    }

    static public String InputDialog(String inputType, String inputMes) {
        return JOptionPane.showInputDialog(null, inputMes, inputType, JOptionPane.PLAIN_MESSAGE);
    }
}