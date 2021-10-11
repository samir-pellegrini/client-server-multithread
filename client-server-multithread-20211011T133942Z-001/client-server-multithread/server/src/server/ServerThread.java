/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.*;
import java.net.*;

/**
 *
 * @author Giorgio Del Rocca
 */
public class serverThread extends Thread {
    ServerSocket server = null; // socket server
    Socket client = null;// socket da parte del client
    String Stringaricevuta = null; // stringa ricevuta
    String StringaModificata = null; // stringa mandata
    BufferedReader inDalClient;
    DataOutputStream outVersoClient;
    Multiserver multi;

    multi.stop()

    public Serverstr(Socket socket,ServerSocket server// costruttore
    {
        this.server=server;
        this.client = socket;
    }

    public void run()// richiama il metodo comunica
    {
        try {
            comunica();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void comunica() throws Exception {
        inDalClient = new BufferedReader(new InputStreamReader(client.getInputStream()));// out dal client verso il
                                                                                         // server(in)
        outVersoClient = new DataOutputStream(client.getOutputStream());// out d3l server verso il cliebnt
        for (;;) {
            Stringaricevuta = inDalClient.readLine();// lege e salva la stringa
            if (Stringaricevuta == null || Stringaricevuta.equals("FINE")) {//se il client scrive fine si chiude la porta
                outVersoClient.writeBytes(Stringaricevuta + "(--> socket in chiusura");//messagio della porta in chiusura
                System.out.println("echo sul socket in chiusura :" + Stringaricevuta);
                outVersoClient.close();
                inDalClient.close();
                System.out.println("9 chiusura socket" + client);
                client.close();
                break;
            } 
            if (Stringaricevuta == null || Stringaricevuta.equals("STOP")) {//se il client scrive fine si chiude la porta
                outVersoClient.writeBytes(Stringaricevuta + "(--> socket in chiusura");//messagio della porta in chiusura
                System.out.println("echo sul socket in chiusura :" + Stringaricevuta);
                outVersoClient.close();
                inDalClient.close();
                System.out.println("9 chiusura socket" + client);
                client.close();
                server.close();
                break;
            } 
            else {
                outVersoClient.writeBytes(Stringaricevuta + "(--> ricevuta e trasmessa");//avverta che la stringa è stata è trsmessa
                System.out.println("6 echo sul server");
            }
        }
       

    }
 