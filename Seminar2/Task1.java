package Seminar2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = new int[10];
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
            int index = 0;
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
            } else {
                System.out.println("Укажите индекс элемента массива - целое число!");
            }
            if (index > arr.length) {
                System.out.println("Указан индекс за пределами массива");
            } else {
                arr[index] = 1;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}