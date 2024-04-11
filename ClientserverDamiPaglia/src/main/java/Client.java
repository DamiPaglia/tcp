
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Studente
 */
public class Client {
    private String nome;
    private String colore;
    private Socket s;
    
    public Client(String nomeDefault, String coloreDefault){
        nome=nomeDefault;
        colore=coloreDefault;
    }
    
    public void connetti(String nomeServer, int portaServer){
        try{
        s = new Socket(nomeServer, portaServer);
        System.out.println("connesione riuscita con il server...");
        }catch(ConnectException e){
            System.err.println("server non in ascolto");
        }catch(UnknownHostException oh){
            System.err.println("errore con il dns");
        }catch(IOException ex){
            System.err.println("errore nella connesione");   
        }
        
    }
    public void scrivi(){
        
    }
    public void leggi(){
        
    }
    public void chiudi(){
        
    }
}
