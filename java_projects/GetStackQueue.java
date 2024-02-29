package java_projects;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class GetStackQueue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Stack<Integer> stack = GetStack(arr);
        // System.out.println(stack);
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        Queue<Integer> queue = GetQueue(arr);
        System.out.println(queue);
    }
    public static Stack<Integer> GetStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int element: arr) {
            stack.push(element);
        }
        return stack;
    }
    public static Queue<Integer> GetQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for(int element: arr){
            queue.add(element);
        }
        return queue;
    }
}
