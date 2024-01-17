// 📌 Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// 📌 Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// 📌 Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

package java_projects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class VernyFromFile {
    public static void main(String[] args) {
        String[] folderContent = getFolderContent(".");
        WriteToFile(folderContent, "file.txt");
    }
    public static String[] getFolderContent(String nameFolder) {
        File newFolder = new File(nameFolder);
        return newFolder.list();
    }
    public static void WriteToFile(String[] str, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String element: str){
            writer.write(element);
            writer.write(System.lineSeparator());
            }
            System.out.println("Файл записан успешно!");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
