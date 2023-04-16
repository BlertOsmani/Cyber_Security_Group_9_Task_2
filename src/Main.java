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


}



