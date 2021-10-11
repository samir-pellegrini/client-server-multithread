package it.delrocca;

import java.io.*;
import java.net.*;

public class Clientstr {
    String NomeServer = "localhost"; // indirizzo server locale
    int SocketServer = 6789; // porta per servizio
    Socket miosocket;
    BufferedReader tastiera; // buffer per l'input da tastiera
    String StringaUtente; // stringa inserita da utente
    String StringaRicevutaDalServer; // stringa inserita dal server
    DataOutputStream outVersoServer; // stream di output
    BufferedReader inDalServer; // stream di input

    public void comunica()
    {
        try{
            System.out.println("4..utente,inserisci la stringa da trasmettere");
            stringUtete= tastiera.readline();
            //lo spedisco al sever
            System.out.println("5... invio la stringa al sever e attendo...");
            outVersoServer.writeBytes(stringaUtente+'\n');
            //leggo la risposta
            stringaRicevutaDalServer=inDalserver.readLine;
            System.out.println("7... risposta dal server "+'\n'+stringaRicevutaDalServer ...);
            if(stringUtete.equals("FINE")
            {
                System.out.println("8 client: termina elaborazione e chiude connessione");
                miosocket.close();
                break;
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println("erorre durante la connessione");
                System.exit(1);
            }
        }
    }
}
public Socket connetti(){
    System.out.println("2 CLient partito in esecuzione");
    try{
     tastiera=new BufferedReader(new InputStreamReader(System.in));
      
     miosocket=new Socket(nomeServer,porta);

     miosocket = new Socket(NomeServer, SocketServer);

     outVersoServer = new DataOutputStream(miosocket.getOutputStream());

     inDalServer = new BufferedReader(new InputStreamReader(miosocket.getInputStream()));
    } catch (UnknownHostException e) {
        System.err.println("Host sconosciuto");
    } catch (Exception e) {
        System.out.println(e.getMessage());
        System.out.println("Errore durante la connessione");
        System.exit(1);
    }
    }
}
}
