package javap;

import java.net.ServerSocket;
import java.net.Socket;

public class Echoserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket=new ServerSocket(port);
		System.err.println("Started server on port"+port);
		while(true)
		{

            // a "blocking" call which waits until a connection is requested
            Socket clientSocket = serverSocket.accept();
            System.err.println("Accepted connection from client");

            // open up IO streams
            In  in  = new In (clientSocket);
            Out out = new Out(clientSocket);

            // waits for data and reads it in until connection dies
            // readLine() blocks until the server receives a new line from client
            String s;
            while ((s = in.readLine()) != null) {
                out.println(s);
            }

            // close IO streams, then socket
            System.err.println("Closing connection with client");
            out.close();
            in.close();
            clientSocket.close();
        }
    }
}
