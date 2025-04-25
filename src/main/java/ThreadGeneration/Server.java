package ThreadGeneration;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server extends Thread {
    ServerSocket serverSocket;
    List<Socket> clients = new ArrayList<>();

    public void run() {
        System.out.println("Server for updates started");
        try {
            serverSocket = new ServerSocket(9000);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                synchronized (clients) {
                    clients.add(clientSocket);
                }
                System.out.println("New client connected");

                new Thread(() -> handleClient(clientSocket)).start();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void handleClient(Socket clientSocket) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Received: " + message);

                synchronized (clients) {
                    Iterator<Socket> iterator = clients.iterator();
                    while (iterator.hasNext()) {
                        Socket s = iterator.next();
                        try {
                            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
                            out.println(message); // this is to broadcast a message sent by one client to all users
                        } catch (IOException e) {
                            iterator.remove();
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Client disconnected");
        } finally {
            synchronized (clients) {
                clients.remove(clientSocket);
            }
        }
    }
}