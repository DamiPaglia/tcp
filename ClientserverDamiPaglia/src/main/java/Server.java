
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Studente
 */
public class Server {
    private  ServerSocket serverSocket;
    private Socket clientSocket;
    private int porta;
    
    public Server(int porta){
        this.porta =porta;
        try{
           serverSocket = new ServerSocket(porta);
           System.out.println("il server è in ascolto");
        }catch(IOException e){
        System.err.println("errore nella fase d' ascolto...");
            
        }

    }
    public Socket attendi(){
        
        try{
            if(serverSocket != null){
     clientSocket = serverSocket.accept();
    System.out.println("server 2 stabilita con il client...");
            }
    }catch(IOException e){
    System.err.println("errore nella connesione...");
    }
    return clientSocket;
}
    
        
    
     public void scrivi(){
        
    }
    public void leggi(){

    }
    public void chiudi(){
        try{
             serverSocket.close();
        }catch(IOException e){
            System.err.println("chiusura non riuscita");
        }
       
    }
    public void termina(){
        
    }
}



