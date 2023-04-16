import java.util.Random;

public class Main {
    public static byte[] generateKeyStream(String seed, int length) {
        Random random = new Random(seed.hashCode());
        byte[] keyStream = new byte[length];
        random.nextBytes(keyStream);
        return keyStream;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}