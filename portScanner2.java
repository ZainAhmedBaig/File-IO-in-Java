package Lab2;

import java.net.Socket;
public class portScanner2 {
    public static void main(String[] args){
        for(int i=1;i<65535;i++){
            try{
                System.out.println("Checking....."+i); 
                Socket s = new Socket("127.0.0.1",i);
                s.close();
                System.out.println("Port " +i +" is open");
        }catch(Exception e){}
     }
   }
}