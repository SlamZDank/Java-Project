package UI;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowDisconnectListener extends WindowAdapter {
    Disconnectable frame;

    public WindowDisconnectListener(Disconnectable frame) {
        this.frame = frame;
    }

    public void windowClosing(WindowEvent e) {
        frame.DisconnectActionPerformed(null);
    }
}
