package main.java;

import java.io.UnsupportedEncodingException;

import javax.crypto.BadPaddingException;

public interface Authority {

		//Recibe la id de la votación, crea las claves y las guarda en BD.
		boolean postKey(String id, Integer token);
		
		//Recibe la id de la votación, crea las claves y las guarda en BD local.
		boolean postKeyLocal(String id, Integer token);
		
		//Recibe la id de la votación y devuelve su clave pública para poder cifrar.
		String getPublicKey(String id, Integer token);
		
		//Recibe la id de la votación y devuelve su clave pública para poder cifrar en local.
		String getPublicKeyLocal(String id, Integer token);
		
		//Recibe la id de la votación y devuelve su clave privada para poder descifrar.
		String getPrivateKey(String id, Integer token);
		
		//Recibe la id de la votación y devuelve su clave privada para poder descifrar en Local.
		String getPrivateKeyLocal(String id, Integer token);
		
		//Encripta el texto con la clave pública de la votación cuya id se pasa como parámetro.
		String encrypt(String idVote,String textToEncypt, Integer token);
		
		//Encripta el texto con la clave pública de la votación cuya id se pasa como parámetro en Local.
		String encryptLocal(String idVote,String textToEncypt, Integer token);
		
		//Desencripta el texto con la clave privada de la votación cuya id se pasa como parámetro.	
		String decrypt(String idVote,String cipherText, Integer token) throws BadPaddingException, UnsupportedEncodingException, Exception;
		
		//Desencripta el texto con la clave privada de la votación cuya id se pasa como parámetro en Local.	
		String decryptLocal(String idVote,String cipherText, Integer token) throws BadPaddingException, UnsupportedEncodingException, Exception;
		
		
}
