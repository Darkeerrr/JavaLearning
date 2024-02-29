package java_projects;

import java.util.ArrayList;
import java.util.LinkedList;

public class training {

    public static void main(String[] args) {
    int count = 10_000_000;
    System.out.println("Добавление элементов в конец списка");
    long start = System.currentTimeMillis();
    addArrayListLast(count);
    System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + " мс");
    start = System.currentTimeMillis();
    addLinkedListLast(count);
    System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + " мс");
    System.out.println("Добавление элементов в начало списка");
    start = System.currentTimeMillis();
    addArrayListFirst(count);
    System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + " мс");
    start = System.currentTimeMillis();
    addLinkedListFirst(count);
    System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + " мс");
    System.out.println("Добавление элементов в середина списка");
    start = System.currentTimeMillis();
    addArrayListMidle(count);
    System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + " мс");
    start = System.currentTimeMillis();
    addLinkedListMidle(count);
    System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + " мс");


}
public static ArrayList<Integer> addArrayListLast(int count) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for(int i = 0; i < count; i++){
        arrayList.add(i);
    }
    return arrayList;
}
public static LinkedList<Integer> addLinkedListLast(int count) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    for(int i = 0; i < count; i++){
        linkedList.addLast(i);
    }
    return linkedList;
}
public static ArrayList<Integer> addArrayListFirst(int count) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for(int i = 0; i < count; i++){
        arrayList.add(0,i);
    }
    return arrayList;
}
public static LinkedList<Integer> addLinkedListFirst(int count) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    for(int i = 0; i < count; i++){
        linkedList.addFirst(i);
    }
    return linkedList;
}
public static ArrayList<Integer> addArrayListMidle(int count) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for(int i = 0; i < count; i++){
        arrayList.add(arrayList.size()/2, i);
    }
    return arrayList;
}
public static LinkedList<Integer> addLinkedListMidle(int count) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    for(int i = 0; i < count; i++){
        linkedList.add(linkedList.size()/2, i);
    }
    return linkedList;
}
    
}