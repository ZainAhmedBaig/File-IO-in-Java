package Lab2;

import java.net.*;

public class q1 {
	public static void main(String[] args) {
		 
 	try {
		   InetAddress localhost;
		   localhost = InetAddress.getLocalHost();
		   System.out.println("System IP Address : " +(localhost.getHostAddress())); 
	} catch (UnknownHostException e) {
			e.printStackTrace();
	} 
  }
}