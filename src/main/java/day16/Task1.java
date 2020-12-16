package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("nums2");
        printResult(file);
    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numString = line.split(" ");
            double sum = 0;
            for (String number : numString) {
                sum += Integer.parseInt(number);
            }
            double avg = sum/numString.length;
            //System.out.println((double)Math.round(avg * 1000d) / 1000d);
            System.out.println(avg+" --> "+new DecimalFormat("#0.000").format(avg));
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

