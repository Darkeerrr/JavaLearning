package java_projects;

import java.util.Stack;

public class StackFunctions {

    static int[] array;

    static int capacity;

    static int topIndex;

    public static void main(String[] args) {
        capacity = 5;
        array = new int[capacity];
        topIndex = -1;
        System.out.println(SizeStack());
        System.out.println(EmptyStack());
        PushStack(6);
        PushStack(7);
        PushStack(8);
        System.out.println(PickStack());
        System.out.println(SizeStack());
        System.out.println(PopStack());
        System.out.println(SizeStack());
        System.out.println(EmptyStack());

    }

    public static int SizeStack() {
        return topIndex + 1;
    }
    public static boolean EmptyStack() {
        return topIndex == -1;
    }
    public static void PushStack(int num) {
        array[++topIndex] = num;
    }
    public static int PickStack() {
        return topIndex;
    }
    public static int PopStack() {
        return array[topIndex--];
    }
}
