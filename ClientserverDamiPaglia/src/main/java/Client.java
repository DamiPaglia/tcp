import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.ConnectException;
import java.io.*;
import java.util.Scanner;


public class Client extends Thread {
    
    private String nome;
    private String colore;
    private Socket socket;
    private  boolean connessione = true;

    public Client(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
    }
    
    
    @Override
    public void run() {
      while(connessione) {
        scrivi();
        leggi();
      }
      chiudi();
    }

    
    public void connetti(String nomeServer, int porta) {
        System.out.println("Il Client  è in esecuzione\n");
        System.out.println("si collega alla porta " + porta + " in ascolto\n");
        try {
            socket = new Socket(nomeServer, porta);
        } catch(ConnectException e) {
            System.err.println("server non è in ascolto");
            System.err.println(e);
        }
        catch(UnknownHostException ex){ 
            System.err.println("Host sconosciuto");
            System.err.println(ex);
        } catch (IOException e){
            System.err.println("Errore nel client");
            System.err.println(e);
        }
        
    }
    
    public void leggi() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            
            System.out.println("il server ha risposto con: " + in.readLine());
            
            
        } catch (IOException e) {
            System.err.println("errore nella trasmissione dei dati");
            System.err.println(e);
        }
    }
    
    public void scrivi() {
        Scanner s = new Scanner(System.in);
        try {
         OutputStream outputStream = socket.getOutputStream();
         PrintWriter datiInUscita = new PrintWriter(outputStream, true);
         System.out.println("inserisci l'informazione da dare al server");
         String dati = s.nextLine();
         
         datiInUscita.println(dati);
         
         if(dati.equals("STOP")){
         connessione = false;
         }
                 
        } catch (IOException e) {
            System.err.println("errore nell'invio dei dati al server");
        }
    }

    public void chiudi() {
            try {              
                socket.close(); 
                System.out.println("Connessione chiusa.");
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
}