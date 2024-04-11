/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Studente
 */
public class MainClient {
    public static void main(String[] args) {
        Client client= new Client("Damiano","blu");
        client.connetti("127.0.0.1",2000);
        client.start();
    }
}