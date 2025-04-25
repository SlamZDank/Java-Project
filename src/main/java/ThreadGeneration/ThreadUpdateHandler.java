package ThreadGeneration;

import UI.AdminMode;
import java.io.*;
import java.net.*;
import javax.swing.SwingUtilities;

public class ThreadUpdateHandler extends Thread {
    AdminMode adminMode;
    Socket socket;
    BufferedReader br;

    public ThreadUpdateHandler(AdminMode adminMode) {
        this.adminMode = adminMode;
        initializeConnection();
    }

    private void initializeConnection() {
        try {
            socket = new Socket("127.0.0.1", 9000);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }

    public void run() {
        while (!Thread.interrupted()) {
            try {
                String message = br.readLine();
                if (message == null) {
                    System.out.println("Reconnecting...");
                    initializeConnection();
                    continue;
                }

                System.out.println(message);

                SwingUtilities.invokeLater(() -> adminMode.renderDatabase());
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
                try { Thread.sleep(2000); }
                catch (InterruptedException ie) { break; }
                initializeConnection();
            }
        }
    }
}