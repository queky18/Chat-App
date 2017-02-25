package chatapp.networking;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MessageTransmitter extends Thread {

	String message, hostname;
	int port;
	
	public MessageTransmitter() {
		
	}

	public MessageTransmitter(String meesage, String hostname, int port) {
 		this.message= meesage;
		this.hostname = hostname;
		this.port = port;
	}

	@Override
	public void run() {
		
		try {
			Socket s = new Socket(hostname, port);
			s.getOutputStream().write(message.getBytes());
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			// Logger.getLogger(MessageTransmitter.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
	
	
	
}
