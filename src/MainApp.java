import java.io.IOException;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Выберите режим работы: " +
                "\n 1 - Шифрование текста из файла." +
                "\n 2 - Расшифровка текста из файла с помощью ключа." +
                "\n 3 - Расшифровка методом brute force." +
                "\n 4 - Расшифровка методом статистического анализа." +
                "\n 5 - Закрыть программу.");

        switch (Integer.parseInt(console.nextLine())) {

            case 1:
                System.out.println("Введите имя файла с текстом для шифрования: ");
                String inputFilename = console.nextLine();

                try {
                    String text = FileManager.readFile(inputFilename);

                    System.out.println("Введите ключ шифрования: ");
                    int shift = Integer.parseInt(console.nextLine());
                    String encryptedText = Cipher.encrypt(text, shift);

                    System.out.println("Введите имя файла для сохранения зашифрованного текста: ");
                    String outputFilename = console.nextLine();
                    FileManager.writeFile(outputFilename, encryptedText);

                    System.out.println("Текст зашифрован и сохранен в " + outputFilename);
                } catch (IOException e) {
                    System.out.println("Ошибка чтения или записи файла: " + e.getMessage());
                } break;

            case 2:
                System.out.println("Введите имя файла с текстом для расшифровки: ");
                String decryptFilename = console.nextLine();

                try {
                    String text = FileManager.readFile(decryptFilename);

                    System.out.println("Введите ключ шифрования: ");
                    int key = Integer.parseInt(console.nextLine());

                    String decrypt = Cipher.decrypt(text, key);

                    System.out.println("Введите имя файла для сохранения расшифрованного текста: ");
                    String outputFilename = console.nextLine();
                    FileManager.writeFile(outputFilename, decrypt);

                    System.out.println("Текст расшифрован и сохранен в " + outputFilename);
                } catch (IOException e) {
                    System.out.println("Ошибка чтения или записи файла: " + e.getMessage());
                } break;

            case 3:
                System.out.println("Введите имя файла с текстом для расшифровки: ");
                String inputFilenameBrute = console.nextLine();

                try {
                    String text = FileManager.readFile(inputFilenameBrute);

                    System.out.println("Расшифровка brute force: ");
                    String bruteForceResult = BruteForce.decrypt(text);

                    System.out.println("Расшифрованные варианты: \n" + bruteForceResult);
                } catch (IOException e) {
                    System.out.println("Ошибка чтения файла: " + e.getMessage());
                } break;

            case 4:
                System.out.println("Введите имя файла с текстом для расшифровки: ");
                String inputFilenameStatic = console.nextLine();

                try {
                    String text = FileManager.readFile(inputFilenameStatic);

                    System.out.println("Расшифровка статическим анализом: ");
                    String staticAnalysisResult = StatisticalAnalyzer.decrypt(text);

                    System.out.println("Расшифрованные варианты: \n" + staticAnalysisResult);
                } catch (IOException e) {
                    System.out.println("Ошибка чтения файла: " + e.getMessage());
                } break;

            case 5:
                System.out.println("Программа завершена.");
                break;
            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите число от 1 до 5.");
        }

        console.close();
    }
}
