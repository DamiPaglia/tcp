/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Studente
 */
public class MainClient {
    public static void main(String[]args){
        Client c= new Client("damiano","blu");
        c.connetti("127.0.0.0", 2000);
    }
    
}
