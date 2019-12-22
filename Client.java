package Lab2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
public class Client {
         public static void main(String[] args){
    try {
    	Socket s = new Socket("192.168.8.100",3999);
    	DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        DataInputStream dis = new DataInputStream(s.getInputStream());
        dos.writeUTF("Assalam-o-Alaikum");
        System.out.println("Read:" +dis.readUTF());
        dos.writeUTF("Walaikum Assalam");
        s.close();
	}catch(IOException e) {}
         }
}