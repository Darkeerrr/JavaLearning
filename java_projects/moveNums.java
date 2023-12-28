package java_projects;

import java.util.Scanner;

public class moveNums {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int num = getNum();
        getRight(arr, num);
    }

    private static void getRight(int[] arr, int num) {
        int right = arr.length -1;
        while(right == num){
            right--;
        }
        for (int left = 0; left < right; left++){
            if (arr[left] == num){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
        for (int item : arr){
            System.out.print(item + " ");
        }
    }

    private static int getNum() {
        System.out.print("Напишите число: ");
        Scanner scan = new Scanner(System.in, "ibm866");
        String snum = scan.nextLine();
        int num = Integer.parseInt(snum);
        System.out.println(num);
        scan.close();
        return num;
    }
}
