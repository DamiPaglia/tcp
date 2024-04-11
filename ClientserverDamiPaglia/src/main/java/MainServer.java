/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Studente
 */

public class MainServer {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
    
      MultiServer server = new MultiServer(2000); //crea il server e apre la porta 4002
      server.start();
      
    }
    
}
