package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //String path = "/Users/Boris/Desktop/Java/Projects/JavaMarathon2020/src/main/java/day14/nums";
        File file = new File("nums");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numString = line.split(" ");

            if (numString.length != 10)
                throw new IllegalArgumentException();

            int sum = 0;

            for (String number : numString) {
                sum += Integer.parseInt(number);
            }

            System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
