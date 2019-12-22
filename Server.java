package Lab2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
     public static void main(String[] args) {
        // TODO code application logic here
        	try {
		ServerSocket ss = new ServerSocket(3999);
		System.out.println("Listening.....");
                Socket s = ss.accept();
                
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                DataInputStream dis = new DataInputStream(s.getInputStream());
                String data = dis.readUTF();
                System.out.println("Reed: "+data);
                dos.writeUTF(data);
		ss.close();	
		}catch(IOException e) {e.printStackTrace();}
    }
}