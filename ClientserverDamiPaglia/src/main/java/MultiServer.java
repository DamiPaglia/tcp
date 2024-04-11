/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author account
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.BindException;
import java.io.*;

public class MultiServer extends Thread {
    
    int porta;
    int n;
    ServerSocket serverSocket;
    
    public MultiServer(int porta) {
        this.porta= porta; 
        this.n = 1;
    }
    
    public void run() {
       try {
          serverSocket = new ServerSocket(porta);
          
          while(true) {
      
           Socket socket = serverSocket.accept();
           System.out.println("connessione accettata a " + socket +"; Client numero :" + n);
           Server server = new Server(porta, socket, n);
           server.start();
           n++;
      }
          } catch (IOException ex) {
           System.out.println("errore generico del server");
          }
}
    
    public void termina() {
        try {            
            serverSocket.close(); //chiudo il server
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}