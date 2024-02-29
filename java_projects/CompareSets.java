// 1. Создайте HashSet, заполните его следующими числами: {3, 6, 43, 8, 11, 7, 33, 3, 4, 8}.
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {3, 6, 43, 8, 11, 7, 33, 3, 4, 8}.
// Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {3, 6, 43, 8, 11, 7, 33, 3, 4, 8}.
// Распечатайте содержимое данного множества.

package java_projects;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CompareSets {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        // hashSet.add(5);
        System.out.println(hashSet);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        // hashSet.add(5);
        System.out.println(linkedHashSet);
        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        // hashSet.add(5);
        System.out.println(treeSet);
    }
}
