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
            int[] numbers = new int[10];
            int counter = 0;
            try {
                for (String number : numString) {
                    numbers[counter++] = Integer.parseInt(number);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Некорректный входной файл");
            }
            int sum = 0;
            for (int n : numbers) {
                sum += n ;
            }
            //System.out.println(Arrays.toString(numbers));
            System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
