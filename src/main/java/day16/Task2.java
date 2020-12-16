package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileOut1 = new File("/Users/Boris/Desktop/Java/Projects/JavaMarathon2020/src/main/resources/nums_till_1000.txt");
        File fileOut2 = new File("/Users/Boris/Desktop/Java/Projects/JavaMarathon2020/src/main/resources/avr.txt");

        PrintWriter pw1 = new PrintWriter(fileOut1);
        PrintWriter pw2 = new PrintWriter(fileOut2);

        List<Integer> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list1.add((int) (Math.random() * 101));
            pw1.print((int) (Math.random() * 101) + " ");
        }
//        Проверка списка рандомных чисел
//        System.out.println(list1);
//        System.out.println(list1.size());

        int partitionSize = 20;
        Integer sum = 0;
        for (int i = 0; i < list1.size(); i += partitionSize) {
            for (Integer mark : list1.subList(i, Math.min(i + partitionSize, list1.size()))) {
                sum += mark;
            }
            list2.add(sum.doubleValue() / list1.subList(i, Math.min(i + partitionSize, list1.size())).size());
            pw2.print((sum.doubleValue() / list1.subList(i, Math.min(i + partitionSize, list1.size())).size()) + " ");
        }
//        Проверка списка со средними значениями
//        System.out.println(list2);
//        System.out.println(list2.size());

        pw1.close();
        pw2.close();
        printResult(fileOut2);

    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            int result;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numString = line.split(" ");
                for (String x : numString) {
                    sum += Double.parseDouble(x);
                }
            }
            result = (int) sum;
            System.out.println(result);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
