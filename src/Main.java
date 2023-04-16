import java.util.Random;

public class Main {
    public static byte[] generateKeyStream(String seed, int length) {
        Random random = new Random(seed.hashCode());
        byte[] keyStream = new byte[length];
        random.nextBytes(keyStream);
        return keyStream;
    }
    public static byte[] xor(byte[] text, byte[] keyStream) {
        byte[] returnText = new byte[text.length];
        for (int i = 0; i < text.length; i++) {
            returnText[i] = (byte) (text[i] ^ keyStream[i]);
        }
        return returnText;
    }
    
     public static byte[] symmetricEncrypt(String plaintext, String key) {
        byte[] keyStream = generateKeyStream(key, plaintext.length());
        byte[] encryptedText = xor(plaintext.getBytes(), keyStream);
        return encryptedText;
    }

    public static String symmetricDecrypt(byte[] ciphertext, String key) {
        byte[] keyStream = generateKeyStream(key, ciphertext.length);
        byte[] decryptedText = xor(ciphertext, keyStream);
        return new String(decryptedText);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
