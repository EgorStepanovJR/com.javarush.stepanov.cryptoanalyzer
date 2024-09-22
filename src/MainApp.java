import java.io.IOException;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean сycle = true;

        System.out.println(Constant.Annotation);

        while (сycle == true) {
            System.out.println(Constant.Menu);


            try {
                switch (Integer.parseInt(console.nextLine())) {

                    case 1:
                        System.out.println(Constant.getPathEncrupt);
                        String inputFilename = console.nextLine();

                        try {
                            String text = FileManager.readFile(inputFilename);

                            System.out.println(Constant.getKey);
                            int shift = Integer.parseInt(console.nextLine());
                            String encryptedText = Cipher.encrypt(text, shift);

                            System.out.println(Constant.getNewFileName);
                            String outputFilename = console.nextLine();
                            FileManager.writeFile(outputFilename, encryptedText);

                            System.out.println(Constant.textEncrypt + outputFilename);
                        } catch (IOException e) {
                            System.out.println(Constant.ExIO + e.getMessage());
                        } break;

                    case 2:
                        System.out.println(Constant.getPathDecrypt);
                        String decryptFilename = console.nextLine();

                        try {
                            String text = FileManager.readFile(decryptFilename);

                            System.out.println(Constant.getKey);
                            int key = Integer.parseInt(console.nextLine());

                            String decrypt = Cipher.decrypt(text, key);

                            System.out.println(Constant.getNewFileName);
                            String outputFilename = console.nextLine();
                            FileManager.writeFile(outputFilename, decrypt);

                            System.out.println(Constant.textDecrypt + outputFilename);
                        } catch (IOException e) {
                            System.out.println(Constant.ExIO + e.getMessage());
                        } break;

                    case 3:
                        System.out.println(Constant.getPathDecrypt);
                        String inputFilenameBrute = console.nextLine();

                        try {
                            String text = FileManager.readFile(inputFilenameBrute);
                            String FileName = inputFilenameBrute;

                            System.out.println(Constant.brut);
                            String bruteForceResult = BruteForce.decrypt(text, FileName);
                        } catch (IOException e) {
                            System.out.println(Constant.ExIO + e.getMessage());

                        } break;

                    case 4:
                        System.out.println(Constant.statistical);
                        break;

                    case 5:
                        System.out.println(Constant.close);
                        сycle = false;
                        break;
                    default:
                        System.out.println(Constant.ExMenuRestriction);
                }
            } catch (Exception e) {
                System.out.println(Constant.ExNotMembers);
            }
        }
    }
}
