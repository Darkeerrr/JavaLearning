package java_projects;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Чёрный", 2, "Шипа");
        Cat cat2 = new Cat("Белый", 2, "Джеся");
        Cat cat3 = new Cat("Серый", 2, "Барсик");
        Cat cat4 = new Cat("Чёрный", 2, "Шипа");
        Cat cat5 = new Cat("Белый", 2, "Джеся");
        Cat cat6 = new Cat("Серый", 2, "Барсик");

        Set<Cat> cats = new HashSet<>(Arrays.asList(cat1,cat2,cat3,cat4,cat5,cat6));

        for(Cat cat : cats) System.out.println(cat);
    }
}
