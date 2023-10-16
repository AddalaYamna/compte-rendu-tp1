package ServerPackage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[]args) {
		try
		{
			 // Crée un ServerSocket qui écoute les connexions sur le port 1234 
			ServerSocket ss = new ServerSocket(1234);
			// Affiche un message pour indiquer que le serveur attend la connexion d'un client 
		System.out.println("je suis un serveur en attente la connexion d'un client");
		 // Accepte une connexion entrante et crée un Socket pour communiquer avec le client 
		Socket s = ss.accept();
		// Obtient les flux d'entrée et de sortie pour le socket 
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		
		}catch(IOException e)
		{e.printStackTrace();// Affiche toute IOException qui se produit 
        }
		}

	}




	


