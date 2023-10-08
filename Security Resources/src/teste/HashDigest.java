package teste;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class HashDigest {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		String texto = JOptionPane.showInputDialog(null, "Digite seu texto:");
        byte[] message = texto.getBytes();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        	 
        md.update(message);
        byte[] digest = md.digest();
        	 
        System.out.println("Resultado: " +converte(digest));
	}
	
	public static String converte(byte[] byteArray) {
		//Para cada byte no array, é feita a conversao para hexadecimal
        //Os valores convertidos sao alocados em uma String.
		
        String conversao = "";
             
        for (byte i : byteArray) {
        	conversao = conversao + String.format("%02X", i);
        }
        return conversao;
    }

}
