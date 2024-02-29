package java_projects;

import java.util.Objects;

public class Cat {
    private String name;

    private int age;

    private String collor;

    public Cat(String name, int age, String collor) {
        this.collor = collor;
        this.age = age;
        this.name = name;

    }

    public static String GetName(String name) {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public static int GetAge(int age) {
        return age;
    }

    public void SetAge(int age) {
        this.age = age;
    }

    public static String GetCollor(String collor) {
        return collor;
    }

    public void SetCollor(String collor) {
        this.collor = collor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", collor='" + collor + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && age == cat.age && collor.equals(cat.collor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name,age,collor);
    }
}
