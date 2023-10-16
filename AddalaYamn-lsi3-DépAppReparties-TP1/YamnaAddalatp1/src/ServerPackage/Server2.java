package ServerPackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			// Affiche un message pour indiquer que le serveur démarre
			System.out.println("je suis un serveur");
			
			// Crée un ServerSocket qui écoute les connexions sur le port 1234
		    ServerSocket ss = new ServerSocket(1234);
		    System.out.println("j attend un client ...");
		 
		    // Attend qu'un client se connecte et crée un Socket pour communiquer avec le client
		    Socket s = ss.accept(); 
		    System.out.println("un client est connecté");
		 
		    // Obtient les flux d'entrée et de sortie pour communiquer avec le client
		    OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			
			int nb = is.read();// Lit la valeur envoyée par le client
			System.out.println("j'ai recu la valeur"+nb);
			
			int rep = nb*5; // Calcule la réponse (le produit du nombre par 5)
            
			os.write(rep);// Envoie la réponse au client
			
			System.out.println("déconnection serveur");
			s.close();    // Ferme la connexion avec le client
			ss.close();   // Ferme le ServerSocket
		}
		catch(Exception e){
			e.printStackTrace(); // Affiche toute exception qui se produit
		}
	}

}