/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author villa_riccardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

    static void receive(DatagramPacket pacchetto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private DatagramSocket a;
    private DatagramPacket packetRicevuto;
    private String messaggioRicevuto;
    //thread ascolta
    public void ricevi() throws IOException {
        byte[] buffer = new byte[1500];

        packetRicevuto = new DatagramPacket(buffer, buffer.length);

        a.receive(packetRicevuto);

        byte[] dataReceived = packetRicevuto.getData(); // copia del buffer dichiarato sopra

        messaggioRicevuto = new String(dataReceived, 0, packetRicevuto.getLength());

        System.out.println(messaggioRicevuto);
    }
    
    public char analizza(){

        return messaggioRicevuto.charAt(0);
    }

    public String getContenuto(){
        int index = messaggioRicevuto.indexOf(";");
        String c = messaggioRicevuto.substring(index + 1, messaggioRicevuto.length());
        return c;
    }  
}
