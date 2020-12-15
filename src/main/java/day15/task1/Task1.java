package day15.task1;

import day14.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("/Users/Boris/Desktop/Java/Projects/JavaMarathon2020/src/main/resources/shoes.csv");
        File fileOut = new File("/Users/Boris/Desktop/Java/Projects/JavaMarathon2020/src/main/resources/missing_shoes.txt");
        //считывание

        PrintWriter pw = new PrintWriter(fileOut);
        try {
            Scanner scanner = new Scanner(fileIn);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numString = line.split(";");
                if (Integer.parseInt(numString[2]) == 0) {
                    pw.println(line);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        pw.close();
    }
}
