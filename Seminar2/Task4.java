// Задание №4
// Исправьте код, примените подходящие способы обработки исключений

package Seminar2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Task4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = { "asdf", "asdf" };
            String strings1 = strings[strings.length-1];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("gdafgdsaf");
        } catch (StackOverflowError error) {
            System.out.println("Стек переполнен!");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}