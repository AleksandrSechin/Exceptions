// Задание №8 (доп)
// Реализуйте метод, принимающий в качестве аргументов двумерный массив.
// Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
// детализировать какие строки со столбцами не требуется.
// Как бы вы реализовали подобный метод?

package Seminar1;

public class Task8 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 0}};
        if (checkArray(arr)){
            System.out.println("Количество строк и столбцов совпадает!");
        }
        else {
            System.out.println("Количество строк и столбцов не совпадает!");
        }
    }
    public static boolean checkArray(int[][] arr) {
        int rows = arr.length;
        if (rows == 0){
            return true;
        }
        for (int i = 1; i < rows; i++) {
            if (arr[i].length != rows){
                return false;
            }
        }
        return true;
    }
}
