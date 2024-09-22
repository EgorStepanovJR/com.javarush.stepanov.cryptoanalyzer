public class Constant {

    //MainAppFace
    public static final String Annotation = "Добро пожаловать в программу для шифрования и дешифрования " +
            "текстовых файлов (в формате .txt).\nВы можете открыть файл для обработки" +
            " из любого места на вашем ПК, просто указав путь к файлу (с указанием формата).\n" +
            "Обработанный файл будет сохранен в папку программы <<FileLibrary>>.";

    public static final String Menu = "\nВыберите режим работы введя цифру в консоль: " +
            "\n 1 - Шифрование текста из файла." +
            "\n 2 - Расшифровка текста из файла с помощью ключа." +
            "\n 3 - Расшифровка методом brute force." +
            "\n 4 - Расшифровка методом статистического анализа." +
            "\n 5 - Закрыть программу.";

    public static final String close = "Программа завершена.";

    //The message in the methods
    public static final String getPathEncrupt = "Введите путь к файлу с текстом для шифрования: ";
    public static final String getPathDecrypt = "Введите путь к файлу с текстом для расшифровки: ";
    public static final String key = "Ключ ";
    public static final String getKey = "Введите ключ шифрования: ";
    public static final String getNewFileName = "Введите имя файла для сохранения зашифрованного текста: ";

    public static final String textEncrypt = "Текст зашифрован и сохранен в папку \"FileLibrary\"";
    public static final String textDecrypt = "Текст расшифрован и сохранен в папку \"FileLibrary\"";

    public static final String brut = "Расшифровка brute force: ";
    public static final String getBrut = "Выберите понравившийся вариант расшифровки (введите номер ключа):";
    public static final String statistical = "Реализация статического анализа в разработке.";

    //Exceptions
    public static final String ExIO = "Ошибка чтения или записи файла: ";
    public static final String ExNotMembers = "\nВозможно вы не знакомы с цифрами, вот они: 1, 2, 3, 4, 5.\n";
    public static final String ExMenuRestriction = "Неверный выбор. Пожалуйста, выберите число от 1 до 5.";
}
