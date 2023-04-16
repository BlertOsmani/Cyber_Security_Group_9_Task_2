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







    
    public static void main(String[] args) {
        String plaintext = "Hello, world!";
        String key = "why_is_this_key_different";
        byte[] encryptedText = symmetricEncrypt(plaintext, key);
        System.out.println("Encrypted message: " + bytesToHex(encryptedText));

        String decryptedText = symmetricDecrypt(encryptedText, key);
        System.out.println("Decrypted message: " + decryptedText);
    }

    public static String bytesToHex(byte[] bytes) {
        String sb = "";
        for (byte b : bytes) {
            sb += (String.format("%02x", b));
        }
        return sb.toString();
    }

}



