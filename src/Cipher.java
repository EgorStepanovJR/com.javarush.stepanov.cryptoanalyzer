public class Cipher {

    public static final char[] ALPHABET = Alphabet.ALPHABET_RU;

    public static String encrypt(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (char c : text.toCharArray()) {
            int index = findIndex(c);

            if (index != -1) {
                int newIndex = (index + shift) % ALPHABET.length;
                encryptedText.append(ALPHABET[newIndex]);
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }

    public static String decrypt(String text, int shift) {
        StringBuilder decryptedText = new StringBuilder();

        for (char c : text.toCharArray()) {
            int index = findIndex(c);

            if (index != -1) {
                int newIndex = (index - shift + ALPHABET.length) % ALPHABET.length;
                decryptedText.append(ALPHABET[newIndex]);
            } else {
                decryptedText.append(c);
            }
        }
        return decryptedText.toString();
    }

    private static int findIndex(char c) {

        for (int i = 0; i < ALPHABET.length; i++) {
            if (ALPHABET[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
