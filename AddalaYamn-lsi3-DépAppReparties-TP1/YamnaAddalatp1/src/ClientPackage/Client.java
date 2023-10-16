package ClientPackage;


import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class Client {
public static void main(String[] args) {
	try
	{
		// Affiche un message pour indiquer que le client est toujours connecté 
		System.out.println("je suis un client encore connecte");
		// Crée un socket pour se connecter au serveur qui s'exécute en local sur le port 1234 
		Socket socket=new Socket("localhost",1234);
		// Obtient les flux d'entrée et de sortie pour le socket 
		InputStream inputstream=socket.getInputStream();
		OutputStream outputstream=socket.getOutputStream();
		
		// Affiche un message pour indiquer que le client est maintenant connecté 
		System.out.println("je suis un client connecte");
		  int myNumber =23;// Définit une variable 'myNumber' et lui attribue la valeur 23 
	
}catch(IOException e) {
	 e.printStackTrace();// Affiche toute IOException qui se produit 
	 }
}



	
	}


