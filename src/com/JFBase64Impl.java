package com;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by online10 on 12-Dec-16.
 */
public class JFBase64Impl {

    public static String encryptData(String p_data) throws Exception {
        Cipher l_cipher = null;
        byte[] l_cipher_text = null;
        byte[] l_data = p_data.getBytes("UTF-8");
        int l_length = 0;

        String l_key_str = "&l['](&1j#wb-_<b^h?c_w==";

        byte[] l_store_key = JFBase64.altBase64ToByteArray(l_key_str);

        SecretKeySpec l_key = new SecretKeySpec(l_store_key, "AES");
        l_cipher = Cipher.getInstance("AES/CTR/NoPadding");
        l_cipher.init(1, l_key, getIv());

        l_cipher_text = new byte[l_cipher.getOutputSize(l_data.length)];
        l_length = l_cipher.update(l_data, 0, l_data.length, l_cipher_text, 0);
        l_cipher.doFinal(l_cipher_text, l_length);

        return JFBase64.byteArrayToBase64(l_cipher_text);
    }

    public static IvParameterSpec getIv() {
        byte[] l_iv_bytes = {-114, 18, 57, -100, 7, 114, 111, 90, -114, 18,
            57, -100, 7, 114, 111, 90};

        return new IvParameterSpec(l_iv_bytes);
    }

    public static String decryptData(String p_data) throws Exception {
        byte[] l_data = JFBase64.base64ToByteArray(p_data);
        Cipher l_cipher = null;
        byte[] l_cipher_text = null;
        int l_length = 0;

        String l_key_str = "&l['](&1j#wb-_<b^h?c_w==";

        byte[] l_store_key = JFBase64.altBase64ToByteArray(l_key_str);

        SecretKeySpec l_key = new SecretKeySpec(l_store_key, "AES");
        l_cipher = Cipher.getInstance("AES/CTR/NoPadding");
        l_cipher.init(2, l_key, getIv());

        l_cipher_text = new byte[l_cipher.getOutputSize(l_data.length)];
        l_length = l_cipher.update(l_data, 0, l_data.length, l_cipher_text, 0);
        l_cipher.doFinal(l_cipher_text, l_length);

        return new String(l_cipher_text);
    }

}
