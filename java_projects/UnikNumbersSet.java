// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 500
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

package java_projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UnikNumbersSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n number: ");
        int n = in.nextInt();
        System.out.printf("Your number: %d \n", n);
        in.close();
        int[] arr = GetArray(n);
        String intArrayString = Arrays.toString(arr);
        System.out.println(intArrayString);
        Set<Integer> treeSet = getSet(arr);
        System.out.println(treeSet);
        int first = arr.length;
        System.out.println(first);
        int second = treeSet.size();
        System.out.println(second);
        double result = (double)(second* 100)/first;
        System.out.println(result + " Процента уникальных значений");
    }
    public static int[] GetArray(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 500);
        }
        return arr;
    }
    public static Set<Integer> getSet(int[] arr){
        Set<Integer> treeSet = new TreeSet<>();
        for(int v : arr){
            treeSet.add(v);
        }
        return treeSet;
    }
}
