// Реализуйте метод, принимающий в качестве аргументов два целочисленных
// массива и возвращающий новый массив, каждый элемент которого равен
// разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить
// пользователя

package DZ;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        try {
            int[] result = sumArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static int[] sumArrays(int[] arr1, int[] arr2) throws IllegalArgumentException {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Массивы имеют разную длину!");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr2[i] - arr1[i];
        }
        return result;
    }
}