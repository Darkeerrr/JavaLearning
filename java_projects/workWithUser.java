package java_projects;

import java.util.LinkedList;
import java.util.Scanner;

public class workWithUser {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку вида text~num для добавления элемента в список");
            System.out.println("print~num для вывода и удаления элемента");
            System.out.println("Для завершения работы программы введите - stop");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            String[] parts = input.split("~");
            String text = parts[0];
            int index = Integer.parseInt(parts[1]);

            try {
                if (text.equals("print")) {
                    System.out.println(list.get(index));
                    list.remove(index);
                    System.out.println(list);
                } else {
                    list.add(index, text);
                    System.out.println(list);
                }
            } catch (Exception e) {
                System.out.println("Индекс некорректный");
                System.out.println(list);
            }

        }
    }
}
