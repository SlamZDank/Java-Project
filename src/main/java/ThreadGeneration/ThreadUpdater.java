package ThreadGeneration;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadUpdater {
    PrintWriter pw;
    Socket socket;

    public ThreadUpdater() {
        try {
            socket = new Socket("127.0.0.1", 9000);
            pw = new PrintWriter(socket.getOutputStream(), true); // Auto-flush enabled
        } catch (IOException e) {
            throw new RuntimeException("Failed to connect to server: " + e.getMessage());
        }
    }

    public void triggerRefresh() {
        try {
            pw.println("Detected Submission: Updating...");
        } catch (Exception e) {
            System.err.println("Error in triggerRefresh(): " + e.getMessage());
            e.printStackTrace();
        }
    }
}
