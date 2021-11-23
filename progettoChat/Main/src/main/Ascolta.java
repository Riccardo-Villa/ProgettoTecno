/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.DatagramPacket;

/**
 *
 * @author villa_riccardo
 */
public class Ascolta extends Thread{
    byte[] buffer = new byte[1500];

        String risposta = "CIAO CLIENT";

    byte[] responseBuffer = risposta.getBytes();

    DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length);

    responsePacket.setAddress(packet.getAddress());

    responsePacket.setPort(packet.getPort());

    server.send(responsePacket);


}
