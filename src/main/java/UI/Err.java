package UI;
import javax.swing.JOptionPane;

public class Err {
    static public void writeErr(String errType, String errMes){
        // Code to summon the dialog containing the Error message
        // If clicked on OK the fields that contain invalid info
        // May be deleted
        JOptionPane.showMessageDialog(null, 
                                    errMes, errType,
                                    JOptionPane.ERROR_MESSAGE);
    }
}
