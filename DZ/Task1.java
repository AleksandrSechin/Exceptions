// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package DZ;

import java.util.Arrays;

public class Task1{
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {0, 4, 5}; // Для проверки деления на ноль

        try {
            System.out.println(Arrays.toString(divideArrays(arr1, arr2)));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(getElement(arr1, 5)); // Проверка ArrayIndexOutOfBoundsException
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(parseStringToInt("abc")); // Проверка NumberFormatException
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    // Метод для деления массивов
    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы имеют разную длину!");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль в индексе " + i + "!");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }

    // Метод для получения элемента массива
    public static int getElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new RuntimeException("Индекс выходит за пределы массива!");
        }
        return arr[index];
    }

    // Метод для преобразования строки в целое число
    public static int parseStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Ошибка преобразования строки в число: " + str);
        }
    }
}
