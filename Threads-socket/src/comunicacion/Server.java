package comunicacion;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public Server() {
		int i;
		try{
			ServerSocket s = new ServerSocket(1000);
			for (int j = 0; j < 3; j++) {
				Socket c  = s.accept();
				DataOutputStream d = new DataOutputStream(c.getOutputStream());
				d.writeUTF("Cliente "+(j+1)+" :Hola");
				c.close();
			}
		}
		catch(Exception e)
		{
		}
	}
	
	
	public static void main(String args[]){
		 new Server();
	}
	
	
}