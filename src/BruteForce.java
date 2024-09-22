import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BruteForce {

    public static String decrypt(String text, String FileName) {
        StringBuilder result = new StringBuilder();

        // Выводим первые 5 слов для каждого ключа
        for (int i = 0; i < Alphabet.ALPHABET_RU.length; i++) {
            String decrypted = Cipher.decrypt(text, i);
            String[] words = decrypted.split("\\s+"); // Разделяем строку на слова

            result.append(Constant.key).append(i).append(": ");
            for (int j = 0; j < Math.min(5, words.length); j++) { // Выводим максимум 5 слов
                result.append(words[j]).append(" ");
            }
            result.append("\n");
        }

        System.out.println(result.toString()); // Выводим варианты

        // Запрашиваем у пользователя выбор
        System.out.println(Constant.getBrut);
        Scanner scanner = new Scanner(System.in);
        int chosenKey = scanner.nextInt();

        // Дешифруем текст с выбранным ключом
        String decryptedText = Cipher.decrypt(text, chosenKey);

        String fileName = new File(FileName).getName();

        // Записываем расшифрованный текст в файл с новым именем
        String newFileName = "src/FileLibrary/BruteForce" + fileName;
        try (FileWriter writer = new FileWriter(newFileName)) {
            writer.write(decryptedText);
            System.out.println(Constant.textDecrypt);
        } catch (IOException e) {
            System.out.println(Constant.ExIO + e.getMessage());
        }

        return decryptedText;
    }
}
