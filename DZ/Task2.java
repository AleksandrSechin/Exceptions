// Посмотрите на код и подумайте сколько разных типов исключений вы тут
// сможете получить?


public static int sum2d(String[][] arr) {
    int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                    sum += val;
            }
        }
    return sum;
}




1. Если входной массив arr равен null, то при попытке доступа к его длине (arr.length) будет выброшено исключение NullPointerException.

2. Если длина любого из подмассивов arr[i] меньше 5, то при попытке доступа к arr[i][j] (где j равно 5 или больше) будет выброшено исключение ArrayIndexOutOfBoundsException.

3. Если строка, которую попытаемся преобразовать в целое число с помощью Integer.parseInt(arr[i][j]), не является целым числом (пустая строка или строка с буквами), будет выброшено исключение NumberFormatException