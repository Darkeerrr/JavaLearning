package java_projects;

import java.util.Scanner;

public class helloName {
    public static void main(String[] args) {
        System.out.print("Представьтесь, пожалуйста: ");
        Scanner scan = new Scanner(System.in, "ibm866");
        String name = scan.nextLine();
        scan.close();
        System.out.println("Привет, " + name + "!");
        System.out.printf("Привет, %s!", name);
    }
}