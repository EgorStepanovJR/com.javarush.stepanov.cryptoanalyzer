public class BruteForce {

    public static String decrypt(String text) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < Alphabet.ALPHABET_RU.length; i++) {
                result.append("Ключ ").append(i).append(": ").append(Cipher.decrypt(text, i)).append("\n");
            }
            return result.toString();
        }
    }
