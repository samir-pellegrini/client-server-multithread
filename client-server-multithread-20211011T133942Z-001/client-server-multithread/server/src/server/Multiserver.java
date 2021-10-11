package server;

import java.net.ServerSocket;
import java.net.Socket;

public class Multiserver {
    public void start(){
        try{
           ServerSocket serversocket= new ServerSocket(6789);
           for(;;)
           {
               System.out.println("1 serve in attesa...");
               Socket socket= serversocket.accept();
               System.out.println("3 server socket" +socket);
               Serverstr serverThread=new Serverstr (socket);
               serverThread.start();
           }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("errore durante ò'instanza del server");
            System.exit(1);
        }
    }
  

}
