package UI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowUserListener extends WindowAdapter {
    UserMode frame;

    public WindowUserListener(UserMode frame) {
        this.frame = frame;
    }

    public void windowClosing(WindowEvent e) {
        frame.DisconnectActionPerformed();
    }
}
