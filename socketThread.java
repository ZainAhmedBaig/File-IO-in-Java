package Lab2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class socketThread implements Runnable{
	  public socketThread(Socket s) {
	    }
 	     public static void main(String[] args)
        {
             try{
            	 ServerSocket ss = new ServerSocket(3999);
             while(true){ 
             Socket s = ss.accept();
             socketThread st = new socketThread(s);
             Thread mt = new Thread(st);
             mt.start(); 
        }
    }   catch(Exception e){
}
    }
        public void run(){
             try{ServerSocket ss = new ServerSocket(3999);
            	 Socket s = ss.accept();
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                DataInputStream dis = new DataInputStream(s.getInputStream());
                String data = dis.readUTF();
                System.out.println("Read: "+data);
                dos.writeUTF(data);
             }catch(Exception e){
         }
     }
}