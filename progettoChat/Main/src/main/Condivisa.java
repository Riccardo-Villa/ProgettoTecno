/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author utente
 */
public class Condivisa {
    private String nick = "";
    private String messaggio="";
    private static Condivisa instance = null;
    
    private int ip; 
    public String getMessaggio() {
        return messaggio;
    }
    
    public String getNickname() {
        return nick;
    }

    public void setNickname(String nickname) {
        this.nick = nickname;
    }


    public int getRemote_ip() {
        return ip;
    }

    public void setRemote_ip(int remote_ip) {
        this.ip = remote_ip;
    }
}
