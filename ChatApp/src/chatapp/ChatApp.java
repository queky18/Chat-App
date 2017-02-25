package chatapp;

import chatapp.gui.MainScreen;

public class ChatApp {

	/*
	 * 
GUI Design:
Textbox : 
	send message
	ip address
	port number
Button
	Connect
	Disconnect
	Send Button
Textarea
	Incoming chat
	Outgoing chat


Chat Implementation
	server
	client

Testing:
	virtual machine
	host machine
	
	 * 
	 */
	
	public static void main(String[] args) {
		MainScreen screen = new MainScreen();
		screen.show();
	}
	
}
