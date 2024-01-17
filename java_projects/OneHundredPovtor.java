// 📌 Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

package java_projects;

import java.io.FileWriter;
import java.io.IOException;

public class OneHundredPovtor {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Bad");
        String newStr = GetString(str);
        IntoText(newStr, "fileName.txt");
    }

    private static String GetString(StringBuilder str) {
        StringBuilder strNew = new StringBuilder();
        int num = 100;
        for (int i = 0; i <= num; i++){
            strNew.append(str + ", ");
        }
        System.out.println(strNew);
        return strNew.toString();
    }
    public static void IntoText(String str, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(str);
            System.out.println("Файл записан успешно!");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
