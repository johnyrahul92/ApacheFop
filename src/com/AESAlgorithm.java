package com;


import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class AESAlgorithm {
    //private static final String TOKEN = "passwd";
    private static String salt;
    private static int pwdIterations = 65536;
    private static int keySize = 128;
    private static byte[] ivBytes;
    private static String keyAlgorithm = "AES";
    private static String encryptAlgorithm = "AES/CBC/PKCS5Padding";
    private static String secretKeyFactoryAlgorithm = "PBKDF2WithHmacSHA1";



    

    private static String getSalt() {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
         salt = new String(bytes);
        return salt;
    }

    /**
     * @param plainText
     * @return encrypted text
     * @throws Exception
     */
    public static String encyrpt(String plainText, String TOKEN) throws Exception {
        //generate key
        byte[] saltBytes = getSalt().getBytes("UTF-8");

        SecretKeyFactory skf = SecretKeyFactory.getInstance(secretKeyFactoryAlgorithm);
        PBEKeySpec spec = new PBEKeySpec(TOKEN.toCharArray(), saltBytes, pwdIterations, keySize);
        SecretKey secretKey = skf.generateSecret(spec);
        SecretKeySpec key = new SecretKeySpec(secretKey.getEncoded(), keyAlgorithm);

        //AES initialization
        Cipher cipher = Cipher.getInstance(encryptAlgorithm);
        cipher.init(Cipher.ENCRYPT_MODE, key);

        //generate IV
        ivBytes = cipher.getParameters().getParameterSpec(IvParameterSpec.class).getIV();
        byte[] encryptedText = cipher.doFinal(plainText.getBytes("UTF-8"));
        return new Base64().encodeAsString(encryptedText);
    }

    /**
     * @param encryptText
     * @return decrypted text
     * @throws Exception
     */
    public static String decrypt(String encryptText, String TOKEN) throws Exception {
        byte[] saltBytes = getSalt().getBytes("UTF-8");
        byte[] encryptTextBytes = new Base64().decode(encryptText);

        SecretKeyFactory skf = SecretKeyFactory.getInstance(secretKeyFactoryAlgorithm);
        PBEKeySpec spec = new PBEKeySpec(TOKEN.toCharArray(), saltBytes, pwdIterations, keySize);
        SecretKey secretKey = skf.generateSecret(spec);
        SecretKeySpec key = new SecretKeySpec(secretKey.getEncoded(), keyAlgorithm);

        //decrypt the message
        Cipher cipher = Cipher.getInstance(encryptAlgorithm);
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(ivBytes));

        byte[] decyrptTextBytes = null;
        try {
            decyrptTextBytes = cipher.doFinal(encryptTextBytes);
        } catch (IllegalBlockSizeException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        String text = new String(decyrptTextBytes);
        return text;
    }
}
