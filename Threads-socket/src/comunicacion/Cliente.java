package comunicacion;

import java.io.DataInputStream;
import java.net.Socket;

public class Cliente {
	public Cliente(){
		try{
			Socket c = new Socket("localhost",1000);
			DataInputStream f = new DataInputStream(c.getInputStream());
			String arg = f.readUTF();
			System.out.println(arg);
			c.close();
			
		}
		catch(Exception e){
			
		}
	}
	public static void main(String args[]){
		 new Cliente();
	}}
