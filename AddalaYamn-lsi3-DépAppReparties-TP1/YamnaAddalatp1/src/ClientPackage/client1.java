package ClientPackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// Affiche un message pour indiquer que le client n'est pas encore connecté 
			System.out.println("je suis un client pas encore connecté");
			   // Crée un socket pour se connecter au serveur à l'adresse IP 192.168.56.1 et au port 1234 
			Socket s = new Socket("192.168.56.1",1234);
			// Affiche un message pour indiquer que le client est connecté au serveur
			System.out.println("je suis connecté au serveur");
			
			int nb;
			
			// Obtient les flux d'entrée et de sortie pour communiquer avec le serveur 
			
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			
			Scanner sc = new Scanner(System.in);
			System.out.print("ecrire un nbr");
			nb = sc.nextInt();
			
			os.write(nb);// Envoie le nombre au serveur 
			
			int rep=is.read(); // Lit la réponse du serveur 
			
			// Affiche le produit du nombre saisi par 5, selon la réponse du serveur 
			
			System.out.println("le produit de "+nb+"*5 = "+rep);
			// Affiche un message pour indiquer que le client se déconnecte 
			
			System.out.println("déconnection client");
			s.close();// Ferme la connexion avec le serveur 
			
		}
		catch(Exception e) {
			e.printStackTrace();// Affiche toute exception qui se produit 
		}

	}

}