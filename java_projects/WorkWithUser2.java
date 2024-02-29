// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
package java_projects;

import java.util.LinkedList;
import java.util.Scanner;

public class WorkWithUser2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Введите строку для добавления в список");
            System.out.println("Введите print Для вывода строк в обратном порядке");
            System.out.println("Введите revert для удаления последнего элемента");
            System.out.println("Для завершения работы программы введите - stop");
            String input = scan.nextLine();
            if(input.equals("stop")){
                break;
            }
            if(input.equals("print")){
                for(int i = list.size()-1; i >=0; i--){
                    System.out.println(list.get(i) + " ");
                }
                System.out.println();
            } else if (input.equals("revert")){
                list.removeLast();
                System.out.println(list);
            } else{
                list.add(input);
                System.out.println(list);
            }
        }
    }
    
}
